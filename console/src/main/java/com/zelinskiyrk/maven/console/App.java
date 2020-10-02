package com.zelinskiyrk.maven.console;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.zelinskiyrk.maven.core.Person;
import com.zelinskiyrk.maven.service.PersonService;
import com.zelinskiyrk.maven.service.Task002;

public class App {
    private static PersonService personService = new PersonService();

    public static void main(String args[]) throws JsonProcessingException {
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
    }
}
