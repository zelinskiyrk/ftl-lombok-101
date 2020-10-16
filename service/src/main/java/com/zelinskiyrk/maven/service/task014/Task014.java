package com.zelinskiyrk.maven.service.task014;

import lombok.AccessLevel;
import lombok.NonNull;
import lombok.ToString;
import lombok.With;

@ToString
public class Task014 {
    @With (AccessLevel.PROTECTED) @NonNull private final String name;
    @With private final int age;

    public Task014 (String name, int age) {
        if (name == null) throw new NullPointerException();
        this.name = name;
        this.age = age;
    }
}
