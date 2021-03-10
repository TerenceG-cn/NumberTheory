package com.tce.slgl.chapter31;

import java.util.*;
import java.util.List;

import static com.tce.slgl.chapter01.TriangularNumbers.findTriangularNumbers;

/**
 * @author TerenceG
 * @classname Ex2
 * @description 习题31.2
 * @lastmodifydate 2021/3/8
 */
public class Ex2 {
    static int cnt=0;
    static List<Integer> res=new ArrayList<>();
    public static void triNumComb(int t,List<Integer> res){
        List<Integer> triNs=findTriangularNumbers(t);
        for(int trin:triNs){
            if(res.size()!=0&&trin<res.get(res.size()-1)) {continue;}
            res.add(trin);
            if(trin==t){
                System.out.println(res);
                cnt++;
            }else if(res.size()<3){
                triNumComb(t-trin,res);
            }
            res.remove(res.size()-1);
        }
    }

    public static void main(String[] args){
        triNumComb(123456789,res);
        System.out.println("共有"+cnt+"种三角数组合");
    }

}
