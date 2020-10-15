package com.zelinskiyrk.maven.service.task012;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MyBuilder {
    public static void run() {
        Task012 task012 = Task012.builder().name("Roman").age(34).
                occupations(Arrays.asList("First", "Second", "Third")).build();
        System.out.println(task012);
        Task012 task012V2 = Task012.builder().name("Petr").age(23).occupation("Phoenix").build();
        System.out.println(task012V2);
    }
}
