package com.zelinskiyrk.maven.service;

import lombok.AccessLevel;
import lombok.ToString;
import lombok.Value;
import lombok.With;
import lombok.experimental.NonFinal;

@Value public class Task011 {
    String name;
    @With(AccessLevel.PUBLIC) @NonFinal int age;
    double score;
    protected String[] tags;

    @ToString (includeFieldNames = true)
    @Value(staticConstructor = "of")
    public static class Exercise<T> {
        String name;
        T value;
    }
}
