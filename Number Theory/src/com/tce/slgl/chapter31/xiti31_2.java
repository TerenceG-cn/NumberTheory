package com.tce.slgl.chapter31;

import java.util.*;
import java.util.List;

import static com.tce.slgl.chapter01.TriangularNumbers.findTriangularNumbers;

/*
结论：每一个正整数可以表示为最多3个三角形数之和

为了完成证明，先解决：给定一个正整数，其中，把用最少的三角形数之和来表示，输出它们。

分析：有一个定理每一个正整数可以表示为3个三角形数之和，所以这样我们可以先判断是否是一个三角形数，如
     果是，则直接输出，否则判断是否是两个三角形数之和，如果是，则输出，否则一定就是三个三角形数之和。
     在找这些数的时候可以利用二分来求解，这样时间复杂度会比较低。
 */
public class xiti31_2 {
    static int cnt=0;
    static List<Integer> res=new ArrayList<>();
    public static List<Integer> triNumComb(int t,List<Integer> res){
        List<Integer> triNs=findTriangularNumbers(t);
        for(int trin:triNs){
            if(res.size()!=0&&trin<res.get(res.size()-1)) continue;
            res.add(trin);
            if(trin==t){
                System.out.println(res);
                cnt++;
            }else if(res.size()<3){
                triNumComb(t-trin,res);
                //System.out.println("!!!"+res);
            }
            res.remove(res.size()-1);
        }
        return res;
    }

    public static void main(String[] args){
        triNumComb(123456789,res);
        System.out.println("共有"+cnt+"种三角数组合");
    }

}
