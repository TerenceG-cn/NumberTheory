package com.tce.slgl.chapter15;

import static com.tce.slgl.chapter15.xiti15_7.funσ;

public class eular_proj_23 {
    public static void main(String[] args) {
        int[] isPerfect = new int[28124];
        for (int i = 0; i < 28124; i++) {
            if (funσ(i) > (2 * i)) isPerfect[i] = 1;
            else isPerfect[i] = 0;
        }
        int count = 0;
        for (int i = 28123; i > 0; i--) {
            count += i;
            for (int j = i; j >= 12; j--) {
                if (isPerfect[j] == 1 && isPerfect[i - j] == 1) {
                    count -= i;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
