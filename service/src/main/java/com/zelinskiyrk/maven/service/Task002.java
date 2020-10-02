package com.zelinskiyrk.maven.service;

import lombok.val;

import java.util.ArrayList;
import java.util.HashMap;

public class Task002 {
    public static class ValExample {
        public String example() {
            val example = new ArrayList<String>();
            example.add("Hello, world!");
            val foo = example.get(0);
            return foo.toLowerCase();
        }
    }

    public static void example2 () {
        val map = new HashMap<Integer, String>();
        map.put(0, "zero");
        map.put(5, "five");
        for (val entry : map.entrySet()) {
            System.out.printf ("%d: %s\n", entry.getKey(), entry.getValue());
        }
    }
}
