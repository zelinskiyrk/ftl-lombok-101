package com.zelinskiyrk.maven.service;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

public class Task006 {
    public static class GetterSetterExample {
        @Getter @Setter private int age = 10;

        @Setter  private String name;
        @Setter (AccessLevel.PROTECTED) private String lastName;

        @Override public String toString () {
            return String.format("%s (age: %d)", name, age);
        }
    }
}
