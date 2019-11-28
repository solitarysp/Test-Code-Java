package com.thanh.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * author lethanh9398 <p>
 * create Date 21-08-2019 17:08  <p>
 * document : <p>
 * <p>- vi :
 * <p>- en :
 */
public class SortVaGetItemOGiua {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1);
        list = list.stream().sorted((o1, o2) -> o2 - o1).collect(Collectors.toList());
        do {
            System.out.printf(String.valueOf(list.get(Math.round(list.size()/2))));
            break;
        }while (true);
        System.out.printf("dddd");
    }
}
