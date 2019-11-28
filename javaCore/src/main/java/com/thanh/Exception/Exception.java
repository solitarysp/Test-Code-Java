package com.thanh.Exception;

/**
 * author lethanh9398 <p>
 * create Date 16-09-2019 13:22  <p>
 * document : <p>
 * <p>- vi :
 * <p>- en :
 */
public class Exception {
    public static void main(String[] args) {
        finallyTest();
    }

    public static void finallyTest() {
        try {
            int a = 0;
            throw new java.lang.Exception();
        } catch (java.lang.Exception e) {
            System.out.println("ex");
            return;
        } finally {
            System.out.println("finally");
        }
    }
}
