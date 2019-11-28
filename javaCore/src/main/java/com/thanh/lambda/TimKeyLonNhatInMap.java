package com.thanh.lambda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * author lethanh9398 <p>
 * create Date 19-08-2019 17:20  <p>
 * document : <p>
 * <p>- vi :
 * <p>- en :
 */
public class TimKeyLonNhatInMap {
    public static void main(String[] args) {
        Map<Integer, Integer> integerIntegerMap = new HashMap<>();
        integerIntegerMap.put(25, 1);
        integerIntegerMap.put(100, 1);
        integerIntegerMap.put(10, 1);
        integerIntegerMap.put(520, 1);
        integerIntegerMap.put(11, 1);
        List<Integer> integers = integerIntegerMap.entrySet().stream().sorted((o1, o2) -> o2.getKey() - o1.getKey()).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.printf(String.valueOf(integers.get(0)));
        System.out.printf(String.valueOf(integerIntegerMap.entrySet().stream().sorted((o1, o2) -> o2.getKey() - o1.getKey()).map(Map.Entry::getKey).findFirst().get()));
    }
}
