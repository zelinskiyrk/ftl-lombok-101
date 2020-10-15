package com.zelinskiyrk.maven.console;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.zelinskiyrk.maven.core.Person;
import com.zelinskiyrk.maven.service.*;
import com.zelinskiyrk.maven.service.task007.Task007;

import java.io.IOException;

public class App {
    private static PersonService personService = new PersonService();

    public static void main(String args[]) throws IOException {
        Person person = new Person();
        person.setLastName("Smith");
        person.setFirstName("Jon");
        System.out.println(person);

        String json = personService.convert(person);
        System.out.println(json);

        Person afterParse = personService.parse(json);
        System.out.println(afterParse);
        
        System.out.println(new Task002.ValExample().example());
        Task002.example2();

        System.out.println("-------= Task 3 =-------");
        System.out.println(new Task003.ValExample().example());

        System.out.println("-------= Task 4 =-------");
        System.out.println(new Task004.NonNullExample(person));

        System.out.println("-------= Task 5 =-------");
        Task005.CleanupExample.run();

        System.out.println("-------= Task 6 =-------");
        Task006.GetterSetterExample gSExample = new Task006.GetterSetterExample();
        System.out.println(gSExample.getAge());
        gSExample.setName("Vasiliy");
        System.out.println(gSExample);

        System.out.println("-------= Task 7 =-------");
        System.out.println(new Task007.ToStringExample().getName());

        System.out.println("-------= Task 8 =-------");
        EqualsAndHashCodeExample a = new EqualsAndHashCodeExample();
        EqualsAndHashCodeExample b = new EqualsAndHashCodeExample();
        System.out.println(a.equals(b));
        System.out.println(a.hashCode() == b.hashCode());
        b.setName("Igor");
        System.out.println(a.equals(b));
        System.out.println(a.hashCode() == b.hashCode());
        a.setName("Igor");
        System.out.println(a.equals(b));
        System.out.println(a.hashCode() == b.hashCode());

        System.out.println("-------= Task 9 =-------");
        Task009 example1 = new Task009(2, 8,"example1");
        Task009.NoArgsExample c = new Task009.NoArgsExample();
        System.out.println(example1.toString());
        System.out.println(c.toString());

        System.out.println("-------= Task 10 =-------");
        Task010 dataAnnotation = new Task010("noName");
        System.out.println(dataAnnotation.toString());
        dataAnnotation.setScore(4.9);
        System.out.println(dataAnnotation.toString());
        System.out.println(dataAnnotation.getName());
    }
}
