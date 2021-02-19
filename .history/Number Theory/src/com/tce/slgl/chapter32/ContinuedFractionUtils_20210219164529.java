package com.tce.slgl.chapter32;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * 连分数工具类
 */
public class ContinuedFractionUtils {
    /**
     * 求非平方数平方根的连分数表示
     * 1.非平方数平方根一定可以表示为a0+循环连分数的形式
     * 形如【a0；a1，a2，...,an】，n为循环节长度
     * 还有个重要的特点：这个循环节一定是 a1 开始，且最后一个数 an 一定是 a0 的2倍。todo 可以进一步改进了
     */
    public static List<Integer> getCFbySR(int num){
        List<Integer> res=new ArrayList<>();
        double r=Math.sqrt(num);//开方
        int an=(int)Math.floor(r);//取整
        res.add(an);

        boolean flag=true;
        int count=0;
        while(flag){
            r=Math.pow(r-an,-1);//取倒数
            an=(int)Math.floor(r);
            res.add(an);
            //System.out.println("r:"+r);
            //System.out.println("an:"+an);
            if(++count%2==0&&count>3){
                //System.out.println("--------------------------");
                //System.out.println("size/2:"+res.size()/2);
                int cn=1;
                while(cn<=res.size()/2&&res.get(cn).equals(res.get(cn + res.size() / 2))){
                    cn++;
                    //System.out.println("cn:"+cn);
                }
                if(cn==res.size()/2+1)
                    flag=false;
                //System.out.println("--------------------------");
            }
            //System.out.println("flag:"+flag);
        }
        //删除多余的元素
        int len=res.size()/2+1;//循环节长度+1（a0）
        while(res.size()>len){
            res.remove(res.size()-1);
        }
        return res;
    }

    /**
     * 连分数加法
     * @param lmn  int[3]  l + m/n
     * @return
     */
    public static int[] addtion(int[] lmn){
        int numerator =lmn[0]*lmn[2]+lmn[1];
        int denominator=lmn[2];
        int[] res=new int[2];
        res[0]=numerator;
        res[1]=denominator;
        return res;
    }

    public static void main(String[] args){
        List<Integer> res=getCFbySR(41);//41的循环节2 2 12 ，有点问题 todo
                                            //小改，对于循环节是1的要另外考虑
        for (Integer i:res
             ) {
            System.out.println(i);
        }
    }
}
