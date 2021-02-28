package com.tce.slgl.chapter33;

public class xiti33_3 {
    public static void main(String[] args) {
        final double GOLD=(1+Math.pow(5,0.5))/2;
        System.out.println(GOLD);

        double r=1,ri=r;
        int i=0;
        while(i++<30) {
            System.out.println(ri);
            System.out.println("|r"+i+"-γ|="+Math.abs(GOLD-ri));
            ri = 1 + Math.pow(ri, -1);
        }
    }
}
