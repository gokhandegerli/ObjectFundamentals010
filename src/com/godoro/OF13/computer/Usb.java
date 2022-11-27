package com.godoro.OF13.computer;

public interface Usb {

    //Biz burada Usbli bir cihazda neler olması gerektiğini tanımlamış olduk.
    void connect();
    void disconnect();
    String read();
    void write(String data);
}
