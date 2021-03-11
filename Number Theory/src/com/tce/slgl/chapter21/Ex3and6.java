package com.tce.slgl.chapter21;

import java.util.ArrayList;
import java.util.List;

/**
 * @author TerenceG
 * @classname Ex3and6
 * @description 习题21.3, 21.6
 * @lastmodifydate 2021/3/11
 */
public class Ex3and6 {
    /**
     * 以3为二次剩余的素数
     */
    private final static int[] QR3 = {11, 13, 23, 37, 47, 59, 61, 71, 73, 83, 97, 107, 109};
    /**
     * 以3为二次非剩余的素数
     */
    private final static int[] NR3 = {5, 7, 17, 19, 29, 31, 41, 43, 53, 67, 79, 89, 101, 103, 113, 127};

    /*
     * 20.2
     * 模p的所有满足1≤a<p的二次剩余a的和 A
     * 模p的所有满足1≤a<p的二次非剩余b的和 B
     */
    /**
     * 满足二次剩余的和等于二次非剩余的和、小于100的素数满足二次剩余的和等于二次非剩余的和
     */
    static int[] A_EQL_B = {5, 13, 17, 29, 37, 41, 53, 61, 73, 89, 97};
    /**
     * 3? todo
     */
    static int[] A_NEQ_B = {7, 11, 23, 31, 43, 47, 59, 67, 71, 79, 83, 91};

    public static List<Integer> tryMod(int n, int[] array) {
        List<Integer> res = new ArrayList<>();
        for (int j : array) {
            res.add(j % n);
        }
        return res;
    }

    public static void main(String[] args) {
        //11,1
        System.out.println(tryMod(24, QR3));
        //5,7
        System.out.println(tryMod(24, NR3));
        /*
         * 21.3
         * 结论是
         * 猜想:
         * 对于满足模12余11或1的奇素数p，3是模p的二次剩余；
         * 对于满足模12余7或5的奇素数p，3是模p的二次非剩余；
         * 未证明
         */
        System.out.println(tryMod(4, A_EQL_B));
        System.out.println(tryMod(4, A_NEQ_B));
        /*
         * 21.6
         * 结论是
         * 对于满足模4余1的奇素数p,二次剩余的和等于二次非剩余的和
         * 对于满足模4余3的奇素数p,二次剩余的和不等于二次非剩余的和
         */
    }

}
