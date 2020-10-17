package com.zelinskiyrk.maven.service.task015;

import lombok.var;

public class GetterLazy {
    public static void run () {
        Task15 task015 = new Task15();
        long startTime = System.currentTimeMillis();
        var data = task015.getCached();
        long endTime = System.currentTimeMillis();
        System.out.println("First calculation");
        System.out.println(endTime - startTime);
        startTime = System.currentTimeMillis();
        data = task015.getCached();
        endTime = System.currentTimeMillis();
        System.out.println("Use the cached value");
        System.out.println(endTime - startTime);
    }
}
