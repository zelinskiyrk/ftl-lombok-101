package com.zelinskiyrk.maven.service;

import com.zelinskiyrk.maven.core.Person;
import lombok.NonNull;

public class Task004 {
    public static class NonNullExample extends Person {
        private String name;

        public NonNullExample (@NonNull Person person) {
            super("Hello");
            this.name = person.getName();
        }
    }
}
