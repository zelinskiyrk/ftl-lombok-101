package com.zelinskiyrk.maven.service.task013;

public class ThreadLombok {
    public static void run() throws InterruptedException {
        Task013 example = new Task013();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread1: " + example.answerToLife());
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread2: " + example.answerToLife());
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
