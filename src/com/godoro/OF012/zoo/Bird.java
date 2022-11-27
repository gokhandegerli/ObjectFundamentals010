package com.godoro.OF012.zoo;

import com.godoro.OF012.features.Flyable;

abstract public class Bird extends Animal implements Flyable {


    public Bird(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Kuş " +getName() +" uçuyor..."); //ya da Animal'deki name field'ı protected yaparak
        // direkt "name" (getName() değil) şeklinde de kullanılabilirdi.
    }

    @Override
    public void land() {
        System.out.println("Kuş " +getName() +" konuyor...");
    }
}
