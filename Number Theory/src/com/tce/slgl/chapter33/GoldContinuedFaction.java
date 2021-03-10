package com.tce.slgl.chapter33;

import java.math.BigDecimal;


public class GoldContinuedFaction {
    public static void main(String[] args) {
        BigDecimal bd = new BigDecimal(1);
        int size=1000;
        for(int i=0;i<size;i++)
        {
            bd = bd.add(BigDecimal.ONE);
            bd= BigDecimal.ONE.divide(bd, 100, BigDecimal.ROUND_HALF_DOWN);
        }
        System.out.println((bd.add(new BigDecimal(1))).toString());
    }
}
