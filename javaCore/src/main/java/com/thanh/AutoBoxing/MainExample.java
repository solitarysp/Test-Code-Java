package com.thanh.AutoBoxing;

import java.util.ArrayList;
import java.util.List;

public class MainExample {
    public static void main(String[] args) {
        MaCode();
        CodeThucChat();


    }

    private static void CodeThucChat() {
        // mã thực chất

        int a = 50;
        Integer a2 = Integer.valueOf(a);// auto Boxing convert int to Integer

        List<Integer> listNumber = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            listNumber.add(Integer.valueOf(i));// auto Boxing convert int to Integer and add to list
        }
    }

    private static void MaCode() {
        // mã code
        int a = 50;
        Integer a2 = a;// auto Boxing convert int to Integer

        List<Integer> listNumber = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            listNumber.add(i);// auto Boxing convert int to Integer and add to list
        }
    }
}
