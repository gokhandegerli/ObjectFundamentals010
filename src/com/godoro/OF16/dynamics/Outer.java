package com.godoro.OF16.dynamics;

public class Outer {


    private int external;

    public int getExternal() {
        return external;
    }

    public void setExternal(int external) {
        this.external = external;
    }

    public class Inner {
        int internal;

        public void printValues() {
            System.out.println("İç: "+internal);
            System.out.println("Dış: "+external);
        }

    }
}
