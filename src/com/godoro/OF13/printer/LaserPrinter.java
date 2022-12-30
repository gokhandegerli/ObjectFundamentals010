package com.godoro.OF13.printer;

import com.godoro.OF13.computer.Usb;

public class LaserPrinter extends Printer implements Usb {


    @Override
    public void connect() {
        System.out.println("Yazıcıya bağlanılıyor");
    }

    @Override
    public void disconnect() {
        System.out.println("Fare bağlantısı koparılıyor");
    }

    @Override
    public String read() {
        System.out.println("Yazıcıdan veri alınıyor");
        return "READY"; //mesela printer hazır durumu, temsili
    }

    @Override
    public void write(String data) {
        System.out.println("Yazıcıya veri yazılıyor:");
        System.out.println("Veri: " + data);
    }
}
