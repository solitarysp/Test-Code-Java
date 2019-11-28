package com.thanh.conlelction;

import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * author lethanh9398 <p>
 * create Date 11-09-2019 17:57  <p>
 * document : <p>
 * <p>- vi :
 * <p>- en :
 */
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMapTest main = new TreeMapTest();
        Map<Integer, Integer> treeMap = new TreeMap();
        treeMap.put(5, 1);
        treeMap.put(1, 5);
        treeMap.put(2, 6);
        treeMap.put(112, 5);
        treeMap.put(20, 10);
        SortedSet<Map.Entry<Integer, Integer>> treeMap2 =mapSortedByValues(treeMap);
        System.out.println(treeMap2.size()>1 ? (int) treeMap2.size()/2 : 0);
        System.out.println("d");
    }

    static <K, V extends Comparable<? super V>> SortedSet<Map.Entry<K, V>> mapSortedByValues(Map<K, V> map) {
        SortedSet<Map.Entry<K, V>> sortedEntries = new TreeSet<>(
                (e1, e2) -> {
                    int res = e1.getValue().compareTo(e2.getValue());
                    return res != 0 ? res : 1; // Special fix to preserve items with equal values
                }
        );
        sortedEntries.addAll(map.entrySet());
        return sortedEntries;
    }
}
