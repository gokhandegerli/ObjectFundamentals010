package com.godoro.OF16.dynamics;

public class Test {

    public static void main(String[] args) {

        Outer outer = new Outer();
        outer.setExternal(3);
        Outer.Inner inner = outer.new Inner();
        inner.internal=4;
        inner.printValues();

    }
}
