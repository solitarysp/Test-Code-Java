package com.thanh.integercache;

public class Main {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        System.out.println(a == b);
        //-XX:AutoBoxCacheMax=2000

        Integer c = 200;
        Integer d = 200;
        System.out.println(c == d);
    }
}
