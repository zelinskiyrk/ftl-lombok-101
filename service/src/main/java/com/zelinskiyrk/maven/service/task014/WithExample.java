package com.zelinskiyrk.maven.service.task014;

public class WithExample {
    public static void run() {
        Task014 task014 = new Task014("Roman", 34);
        System.out.println(task014);
        task014.withAge(22);
        task014.withName("Petr");
        System.out.println(task014);
        System.out.println(task014.withName("Petr"));
        System.out.println(task014.withAge(22));
        Task014 task014With = task014.withName("Joe").withAge(85);
        System.out.println(task014);
        System.out.println(task014With);
    }
}
