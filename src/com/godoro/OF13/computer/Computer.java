package com.godoro.OF13.computer;

import com.godoro.OF13.printer.LaserPrinter;

import java.util.ArrayList;
import java.util.List;

public class Computer {

/*    private Usb usb; //Tek Usb'si olduğunu varsaydık.
    public Usb getUsb() {
        return usb;
    }
    public void setUsb(Usb usb) {
        this.usb = usb;
    }*/

    private List<Usb> usbList = new ArrayList<>();

    public List<Usb> getUsbList() {
        return usbList;
    }
    public void setUsbList(List<Usb> usbList) {
        this.usbList = usbList;
    }

    public void testUsbList() {
        System.out.println("\r\nTESTING USB LIST....");
        for (Usb usb : usbList){
            testUsb(usb);
        }
    }

    public void testUsb(Usb usb) {
        System.out.println("\r\nTESTING....");
        usb.connect();
        String data = usb.read();
        System.out.println("USB'den okunan veri" + data);
        usb.write("Bir veri");
        usb.disconnect();
    }

/*   public void testUsb() {
        System.out.println("\r\nTESTING....");
        usb.connect();
        String data = usb.read();
        System.out.println("USB'den okunan veri" + data);
        usb.write("Bir veri");
        usb.disconnect();
    }*/




}
