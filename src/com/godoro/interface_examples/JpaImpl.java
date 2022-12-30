package com.godoro.interface_examples;

public class JpaImpl implements Jpa {


    @Override
    public void greeting() {
        System.out.println("Selamlar!");
    }

    @Override
    public String getMessage(String message) {
        return message;
    }

    @Override
    public String setMessage(String message) {
        System.out.println("Mesaj set edildi ve dönüyor!");
        return message;
    }
}
