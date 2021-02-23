package com.tce.slgl.chapter32;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pell {
    /**
     * 连分数求解pell方程 最小整数解
     *
     * @param d x^2-dy^2=1
     * @return
     */
    public static Map<Integer, Integer> pell(int d) {

        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> res = ContinuedFractionUtils.getCFbySR(d);
        res.remove(res.size() - 1);
        int size = res.size();
        int lmn[] = new int[3];
        int[] tmp = new int[2];
        lmn[1] = 1;
        lmn[2] = res.remove(res.size() - 1);
        lmn[0] = res.remove(res.size() - 1);
        tmp = ContinuedFractionUtils.addtion(lmn);
        while (res.size() > 0) {
            lmn[0] = res.remove(res.size() - 1);
            lmn[1] = tmp[1];
            lmn[2] = tmp[0];
            tmp = ContinuedFractionUtils.addtion(lmn);
        }
        //System.out.println("res:" + tmp[0] + " " + tmp[1]);
        if (size % 2 == 0) {
            map.put(tmp[0], tmp[1]);
        } else {
            map.put(tmp[0] * tmp[0] * 2 + 1, 2 * tmp[0] * tmp[1]);
        }
        return map;
    }

    public static void pellForAll(int d) {
        Map<Integer, Integer> map = pell(d);//得到最小整数解x0，y0
        if (map.size() > 1) return;//todo
        int x0 = 0, y0 = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            x0 = entry.getKey();
            y0 = entry.getValue();
            if (x0 != 0 && y0 != 0) {
                break;
            }
        }
        System.out.println("(x0,y0):" + "(" + x0 + "," + y0 + ")");
        //递推公式 xk+1=x0*xk+d*y0*yk; yk+1=y0*xk+x0*yk;
        int k = 1, xk = x0, yk = y0;
        int x = xk, y = yk;
        while (true) {
            System.out.println("(x,y):" + "(" + x + "," + y + ")");
            if (xk > Math.pow(10, 6)) {
                break;
            }
            x = x0 * xk + d * y0 * yk;
            y = y0 * xk + x0 * yk;
            xk = x;
            yk = y;
        }
    }


    public static void main(String[] args) {
        //System.out.println(pell(41));//连分数 6，2，2，12
        //System.out.println(pell(22));//4，1，2，4，2，1，8
        pellForAll(11);
    }

}
