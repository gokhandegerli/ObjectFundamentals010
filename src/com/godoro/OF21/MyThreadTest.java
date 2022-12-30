package com.godoro.OF21;

public class MyThreadTest {

    public static void main(String[] args) {

        /*MyThread thread = new MyThread();
        thread.run();
        System.out.println("Sürüyor..");
        Bu kısım thread olmuş olmadı, bunu normal bir class'ın metodunu çalıştırarak gibi yaptık, bu thread değildir.
        */

        MyThread thread = new MyThread();
        thread.start(); // bu sınıfı bilahare(vakit buldukça)çalıştır demek, yani thread aslında, önce main metodu
        // çalıştırdı (Sürüyor..) sonra da bizim thread (Çalışıyor..) çalıştı. Hangi sıra olduğunu bilemeyiz.
        System.out.println("Sürüyor..");


        //kalan kodu videodan izleyebilirsin.

    }
}
