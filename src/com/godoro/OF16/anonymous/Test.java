package com.godoro.OF16.anonymous;

public class Test {
    public static void main(String[] args) {
        MyInterface myInterface = new MyInterface() {
            @Override
            public void perform() {
                System.out.println("Gerçekleşti");
            }
        };

        myInterface.perform();

    }
}
