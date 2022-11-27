package com.godoro.OF012.zoo;

import com.godoro.OF012.features.Flyable;

public class Bat extends Mammal implements Flyable {

    public Bat(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Yarasa: " + getName() +" uçuyor..");
    }

    @Override
    public void land() {
        System.out.println("Yarasa: " + getName() +" konuyor..");
    }
}
