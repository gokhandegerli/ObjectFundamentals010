package com.godoro.OF13.test;

import com.godoro.OF13.computer.Computer;
import com.godoro.OF13.computer.Usb;
import com.godoro.OF13.mouse.AdvancedMouse;
import com.godoro.OF13.printer.LaserPrinter;

public class Test {

    public static void main(String[] args) {

/*      Tek fare ya da printer için yapılan örnek
        Computer computer = new Computer();
        AdvancedMouse mouse = new AdvancedMouse();
        computer.setUsb(mouse);
        computer.testUsb();

        LaserPrinter printer = new LaserPrinter();
        computer.setUsb(printer);
        computer.testUsb();*/

        //Liste ile olan örnek için
        Computer computer = new Computer();
        Usb mouse = new AdvancedMouse(); //AdvancedMouse mouse = new AdvancedMouse(); desek de olurdu.
        computer.getUsbList().add(mouse);
        computer.testUsb(mouse); // tek olarak fareyi test ediyor.

        LaserPrinter printer = new LaserPrinter();
        computer.getUsbList().add(printer);
        computer.testUsb(printer); // tek olarak printer test ediyor


        computer.testUsbList(); // tüm Usblerin test metodunu çağırıyor sırayla.




    }
}
