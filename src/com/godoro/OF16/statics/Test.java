package com.godoro.OF16.statics;

public class Test {

    public static void main(String[] args) {

/*        Outer outer = new Outer();
        outer.setExternal(3);*/ //Inner class oluşturmak için outer instance'nı oluşturmamıza gerek yok.
        Outer.Inner inner = new Outer.Inner();
        Outer.externalStatic=3; //printValues() metodunda kullandığımız için tanımlıyoruz.
        inner.internal=4;
        inner.printValues();

    }
}
