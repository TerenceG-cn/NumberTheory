package com.tce.slgl.chapter33;

import java.math.BigDecimal;

public class GoldContinuedFACTION {
    public static void main(String[] args) {
        BigDecimal bd = new BigDecimal(1);
        for(int i=0;i<1000;i++)
        {
            bd = bd.add(BigDecimal.ONE);
            bd=BigDecimal.ONE.divide(bd,100, BigDecimal.ROUND_HALF_DOWN);
        }
        System.out.println((bd.add(new BigDecimal(1))).toString());
    }
}
