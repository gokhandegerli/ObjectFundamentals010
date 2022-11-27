package com.godoro.OF012.toys;

import com.godoro.OF012.features.Flyable;

public class Plane extends Toy implements Flyable {

    public Plane(String name, double price) {
        super(name, price);
    }

    @Override
    public void fly() {
        System.out.println("Uçak: " + getName() + "uçuyor");
    }

    @Override
    public void land() {
        System.out.println("Uçak: " + getName() + "iniyor");
    }
}
