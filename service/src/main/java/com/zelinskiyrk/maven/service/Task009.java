package com.zelinskiyrk.maven.service;

import lombok.*;

@Getter
@Setter

@ToString

@RequiredArgsConstructor (staticName = "of")
@AllArgsConstructor (access = AccessLevel.PUBLIC)
public class Task009<T> {
    private int x, y;
    @NonNull private T description;

    @NoArgsConstructor
    @ToString
    public static class NoArgsExample {
        @NonNull private String field;
    }
}
