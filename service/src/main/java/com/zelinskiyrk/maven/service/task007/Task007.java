package com.zelinskiyrk.maven.service.task007;

import lombok.ToString;
@ToString
public class Task007 {
    public static class ToStringExample {
        private static final int STATIC_VAR = 10;
        private String name = "Example";
        private Shape shape = new Square(5, 10);
        private String[] tags;
        @ToString.Exclude
        private int id;

        public String getName() {
            return this.name;
        }

        @ToString(callSuper = true, includeFieldNames = true)
        public static class Square extends Shape {
            private final int width, height;

            public Square(int width, int height) {
                this.width = width;
                this.height = height;
            }
        }
    }
}
