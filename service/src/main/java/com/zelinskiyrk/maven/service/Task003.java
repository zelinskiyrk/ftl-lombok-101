package com.zelinskiyrk.maven.service;

import lombok.var;

import java.util.Random;

public class Task003 {
    public static class ValExample {
        public String example() {
            var foo = "Случайное число: ";
            Random r = new Random();
            foo = foo + r.nextInt();
            return foo;
        }
    }
}
