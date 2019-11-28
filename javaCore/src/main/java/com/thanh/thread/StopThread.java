package com.thanh.thread;

import javax.script.ScriptException;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class StopThread {


    public static void main(String[] args) throws InterruptedException, ScriptException {
    int a = 10 * (9+1);
        System.out.printf(String.valueOf(a));
    }

    public static void newTheadAndStopThread(String threadName) throws InterruptedException {
        Thread thread = new Thread(() -> {
            System.out.println("Start thread name :" + Thread.currentThread().getName());

            try {
                TimeUnit.SECONDS.sleep(10);
            } catch (InterruptedException e) {
                //e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println("end thread");

        });
        // set name cho thread
        thread.setName(threadName);
        thread.start();

        Thread.sleep(1000);
        // get thread bởi name
        Thread threadA = getThreadByName(threadName);
        if (Objects.nonNull(threadA)) {
            // nếu thread đang sleep thì gọi method này để bỏ qua sleep và chạy code dưới luôn
            threadA.interrupt();
            // dùng để stop thread và không chạy các code ở dưới chỗ sleep luôn.
            //  threadA.stop();


        }
    }

    public static Thread getThreadByName(String threadName) {
        for (Thread t : Thread.getAllStackTraces().keySet()) {
            if (t.getName().equals(threadName)) return t;
        }
        return null;
    }
}
