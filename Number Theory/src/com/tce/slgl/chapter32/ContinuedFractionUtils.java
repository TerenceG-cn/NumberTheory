package com.tce.slgl.chapter32;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * ������������
 */
public class ContinuedFractionUtils {
    /**
     * ���ƽ����ƽ��������������ʾ
     * 1.��ƽ����ƽ����һ�����Ա�ʾΪa0+ѭ������������ʽ
     * ���硾a0��a1��a2��...,an����nΪѭ���ڳ���
     * ���и���Ҫ���ص㣺���ѭ����һ���� a1 ��ʼ�������һ���� an һ���� a0 ��2����todo ���Խ�һ���Ľ���
     */
    public static List<Integer> getCFbySR(int num){
        List<Integer> res=new ArrayList<>();
        double r=Math.sqrt(num);//����
        int an=(int)Math.floor(r);//ȡ��
        res.add(an);

        boolean flag=true;
        int count=0;
        while(flag){
            r=Math.pow(r-an,-1);//ȡ����
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
        //ɾ�������Ԫ��
        int len=res.size()/2+1;//ѭ���ڳ���+1��a0��
        while(res.size()>len){
            res.remove(res.size()-1);
        }
        return res;
    }

    /**
     * �������ӷ�
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
        List<Integer> res=getCFbySR(41);//41��ѭ����2 2 12 ���е����� todo
                                            //С�ģ�����ѭ������1��Ҫ���⿼��
        for (Integer i:res
             ) {
            System.out.println(i);
        }
    }
}
