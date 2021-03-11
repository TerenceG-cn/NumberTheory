package com.tce.slgl.utils;


/**
 * @ClassName FindPrimes
 * @Description 素数筛法
 * @Author TerenceG
 * @LastModifyDate 2021/2/28
 */
public class FindPrimes {
    /**
     * 亿
     */
    private static final int MAX_LENGTH_CHECK = 100000000;
    /**
     * 千万
     */
    private static final int MAX_LENGTH_PRIMELIST = 10000000;
    /**
     * 存储标记
     */
    private static final boolean[] check = new boolean[MAX_LENGTH_CHECK];
    /**
     * 存储素数
     */
    private static final int[] primeList = new int[MAX_LENGTH_PRIMELIST];

    /**
     * @author TerenceG
     * @lastmodifydate 2021/2/28
     * @description: 埃拉托斯特尼筛法
     * @Param: * @param null
     * @Return:
     */
    public static void eratosthenes(int num) {
        int count = 0;
        for (int indexI = 2; indexI <= num; indexI++) {
            // 当 indexI 不是被剔除的数时，将 indexI 留下
            if (!check[indexI]) {
                primeList[count++] = indexI;
            }
            /*
             * 剔除 indexI 的倍数
             * 改进 int indexJ = indexI *indexI，但此时最大算到int indexJ = indexI* indexI
             */
            for (int indexJ = indexI + indexI; indexJ <= num; indexJ += indexI) {
                check[indexJ] = true;
            }
        }
    }

    /**
     * @author TerenceG
     * @lastmodifydate 2021/2/28
     * @description: 欧拉筛法
     * 保证每个合数只会被它的最小质因数筛掉，时间复杂度降低到O(n)。
     * 每一个数都去乘以当前素数表里面已有的数，当 indexI 是合数，且
     * indexI % primeList[indexJ] == 0 时，只能乘以第一个素数 2
     * @Param: * @param num
     * @Return: void
     */
    public static void euler(int num) {
        int count = 0;
        for (int indexI = 2; indexI <= num; indexI++) {
            if (!check[indexI]) {
                primeList[count++] = indexI;
            }
            // 每一个数都去乘以当前素数表里面已有的数，如果 indexI 是合数，且 indexI % primeList[indexJ] ==
            // 0，那么它只能乘以第一个素数 2
            // 如：2×2、3×(2、3)、4×(2)、5×(2、3、5)、6×(2)、7×(2、3、5、7)、8×(2)、9×(2、3)、10×(2)
            for (int indexJ = 0; indexJ < count; indexJ++) {
                // 过大的时候跳出
                if (indexI * primeList[indexJ] > num) {
                    break;
                }

                check[indexI * primeList[indexJ]] = true;

                // 如果 indexI 是一个合数，而且 indexI % primeList[indexJ] == 0
                // 保证了每个合数只会被它的最小素因子筛掉
                if (indexI % primeList[indexJ] == 0) {
                    break;
                }
            }
        }
    }

    public static void euler2(int num) {
        int count = 0;
        for (int i = 2; i < num; i++) {
            if (!check[i]) {
                primeList[count++] = i;
            }
            for (int j = 0; j < count && i * primeList[j] <= num; j++) {
                check[i * primeList[j]] = true;
                //偶合数只能*2
                if (i % primeList[j] == 0) {
                    break;
                }
            }
        }
    }

    public static int[] getPl() {
        return primeList;
    }

    public static void main(String[] args) {

        // Eratosthenes(10);
        euler2(10_000_000);

        for (int i = 0; FindPrimes.getPl()[i] != 0; i++) {
            System.out.println("第" + (i + 1) + "个素数：" + FindPrimes.getPl()[i]);
        }

    }
    /*
     *
     *
     * n=100 : 25 n=1000: 168 n=10000 : 1229 n=100000: 9592 n=1000000: 78498
     * n=10000000: 664579
     *
     * @author 10352
     *
     */
}
