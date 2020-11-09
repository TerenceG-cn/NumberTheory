package com.tce.slgl.chapter33;

import com.tce.slgl.chapter05.GCD_LCM;

public class xiti33_2 {
    public void findGold(int Y){
        double x=0,y=21;
        double[] res={0,1,0};
        final double GOLD=(1+Math.pow(5,0.5))/2;
        System.out.println(GOLD);
        while(y<=Y){
            x=Math.rint(y*GOLD);
            System.out.println("y="+y+" x="+x);
            if(Math.abs(x-y*GOLD)<res[1]&&x>0&& GCD_LCM.gcd((long)x,(long)y)==1) {
                res[1] = Math.abs(x - y * GOLD);
                res[0]=x;
                res[2]=x/y;
            }
            y++;
        }
        System.out.println(res[0]+" "+res[1]+" "+res[2]);
    }

    public static void main(String[] args) {
        xiti33_2 cla=new xiti33_2();
        cla.findGold(1000);
    }
}
