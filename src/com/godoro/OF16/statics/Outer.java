package com.godoro.OF16.statics;

public class Outer {


    private int external;
    static int externalStatic;

    public int getExternal() {
        return external;
    }

    public void setExternal(int external) {
        this.external = external;
    }

    public static class Inner {
        int internal;

        public void printValues() {
            System.out.println("İç: "+internal);
            //System.out.println("Dış: "+external);
            System.out.println("Dış static: "+externalStatic);
        }

    }
}
