package com.thanh.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * author lethanh9398 <p>
 * create Date 11-09-2019 15:12  <p>
 * document : <p>
 * <p>- vi :
 * <p>- en :
 */
public class TimSoDungGiuaTrongList {
    public static void main(String[] args) {
        TimSoDungGiuaTrongList main = new TimSoDungGiuaTrongList();
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            integers.add(i);
        }

        int index = (integers.size() > 1) ? (int) integers.size() / 2 : 0;
        System.out.println(index);

    }

}
