package com.thanh.SortByLambdaJava8;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(4, 2, 3, 5, 12, 4, 3, 2, 78, 78);
        System.out.println(integers.stream().sorted((o1, o2) -> o2-o1).findFirst().get());
        System.out.println(integers.stream().sorted((o1, o2) -> o2-o1).collect(Collectors.toList()));

        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        scheduler.schedule(() -> {
            System.out.println("ddddddd");
            scheduler.shutdown();
            try {
                scheduler.awaitTermination(5, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, 10, TimeUnit.SECONDS);
        System.out.println("d");
    }
}
