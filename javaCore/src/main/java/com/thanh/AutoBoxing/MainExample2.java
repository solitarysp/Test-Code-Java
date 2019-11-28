package com.thanh.AutoBoxing;

public class MainExample2 {
    public static void main(String[] args) {
        MaCode();

        ThucTe();
    }

    private static void ThucTe() {
        Integer i = 100;
        if (i.intValue() % 2 == 0) {
            System.out.println("'le'");
        }
    }

    private static void MaCode() {
        Integer i = 100;
        if (i % 2 == 0) {
            System.out.println("'le'");
        }
    }


}
