package com.godoro.OF13.mouse;

import com.godoro.OF13.computer.Usb;

public class AdvancedMouse extends Mouse implements Usb {
    //Gelişmiş fare, Usb vs birçok özelliği var mesela.


    @Override
    public void connect() {
        System.out.println("Fareye bağlanılıyor");
    }

    @Override
    public void disconnect() {
        System.out.println("Fare bağlantısı koparılıyor");
    }

    @Override
    public String read() {
        System.out.println("Fareden okunuyor");
        return "[345,654]"; //mesela farenin konumu, temsili
    }

    @Override
    public void write(String data) {
        System.out.println("Fareye yazılıyor:");
        System.out.println("Veri: " + data);
    }
}
