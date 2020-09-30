package com.tce.slgl.chapter32;

import java.net.CookieHandler;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pell {
    /**
     * 连分数求解pell方程
     *
     * @param d x^2-dy^2=1
     * @return
     */
    public static Map<Integer, Integer> pell(int d) {

        HashMap<Integer,Integer> map=new HashMap<>();
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
        if(size%2==0){
            map.put(tmp[0],tmp[1]);
        }else {
            map.put(tmp[0]*tmp[0]*2+1,2*tmp[0]*tmp[1]);
        }
        return map;
    }

    public static void main(String[] args) {
        System.out.println(pell(41));
        System.out.println(pell(22));
    }

}
