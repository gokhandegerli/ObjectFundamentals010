package com.godoro.interface_examples;

public class RepositoryImpl implements Repository{

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

        return message +"Mesaj setlendi";
    }
}
