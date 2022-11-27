package com.godoro.OF011.test;

import com.godoro.OF011.person.Person;

public class Mailer {

    public void send (Person person) {
        System.out.println("--------------------");
        System.out.println("Kime: "+ person.getEmailAddress());
        System.out.println("Konu: "+ person.getGreetings());
        System.out.println("Gövde: "+ person.getGreetings() + " " + person.getFullName());
    }
}
