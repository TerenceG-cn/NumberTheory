package com.tce.slgl.chapter11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *@classname         EularFunc
 *@description       计算欧拉函数,偷的百度百科，以后修改 todo
 *@author            TerenceG
 *@lastmodifydate    2021/3/2
 */
public class EularFunc {
    private static final int MIN_PRIME_NUM=2;
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()) {
        	int num=scanner.nextInt();
            int a=num;
            double oulaAnswer=0;
            ArrayList<Integer> oulaList = new ArrayList<>();
            if (isPrime(num)){
                oulaAnswer=num-1;
            }else{
                List<Integer> allPrime = getAllPrime(num);
                for(int i : allPrime){
                    int tem=num;
                    num=repeatDivide(num,i);
                    if (tem!=num){
                        //素因子列表
                        oulaList.add(i);
                    }
                }
                oulaAnswer=a;
                for (int j :oulaList){
                    oulaAnswer=oulaAnswer*(1-(double)1/j);
                }
            }
            System.out.println("欧拉函数的值为"+Math.round(oulaAnswer));
        }
        
        scanner.close();
    }
    /**
     * 小于num的所有素数
     * @param num
     * @return
     */
    private static List<Integer> getAllPrime(int num){
        ArrayList<Integer> result = new ArrayList<>();
        for (int i =2;i<num;i++){
            if (isPrime(i)) {
                result.add(i);
            }
        }
        return result;
    }
    private static boolean isPrime(int num){
        if(num < MIN_PRIME_NUM) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++ ) {
            if(num%i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean canBeDivide(int num, int i){

        return num != 1 && num % i == 0;
    }
    private static int repeatDivide(int num, int i){
        if (canBeDivide(num,i)){
            return repeatDivide(num/i,i);
        }else{
            return num;
        }
    }
}