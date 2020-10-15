package com.zelinskiyrk.maven.service;

import com.zelinskiyrk.maven.service.task007.Shape;
import lombok.EqualsAndHashCode;
import lombok.Setter;

@EqualsAndHashCode
@Setter
public class EqualsAndHashCodeExample {
    private transient int transientVar = 10;
    private String name;
    private double score;
    @EqualsAndHashCode.Exclude private Shape shape = new Square(5, 10);
    private String[] tags;
    @EqualsAndHashCode.Exclude private int id;

    public String getName() {
        return this.name;
    }

    @EqualsAndHashCode (callSuper = true)
    public static class Square extends Shape {
        private final int width, height;

        public Square (int width, int height) {
            this.width = width;
            this.height = height;
        }
    }
}
