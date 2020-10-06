package com.zelinskiyrk.maven.console;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.zelinskiyrk.maven.core.Person;
import com.zelinskiyrk.maven.service.*;

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

    }
}
