package com.godoro.OF21;

public class MyThread extends Thread {
    //Thread yapmanın bir yolu Thread'i extend ederek yapmaktır. Bu sınıf artık bir threadtir.
    //Run metodu yazarak da neyin çalışacağı vs belirtiyoruz. Thread'deki run metodunu override ediyoruz aslında.

    public void run(){
        try {
            Thread.sleep(750);
            System.out.println("Çalışıyor..");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



}
