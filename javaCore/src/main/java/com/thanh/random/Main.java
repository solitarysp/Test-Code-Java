package com.thanh.random;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(randomBetweenTwo(1, 1));

    }
    public static int randomBetweenTwo(int min, int max) {
        max += 1;
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
}
