package com.godoro.trial;

public class Test {

    //pass by reference
    public static Trial trialTest(Trial trial10, Trial trial20) {
        trial10.name = trial20.name;
        trial10.number = trial20.number;
        return trial10;
    }

    public static void main(String[] args) {

        Trial trial1 = new Trial("Ali", 12);
        Trial trial2 = trial1;

        Trial trial3 = new Trial("Mehmet", 3);

        System.out.println("Trial1: " + trial1.name + " " + trial1.number);
        System.out.println("Trial2: " + trial2.name + " " + trial2.number);
        System.out.println("Trial3: " + trial3.name + " " + trial3.number);
        System.out.println("-------------------");

        trialTest(trial1, trial3);

        System.out.println("Trial1: " + trial1.name + " " + trial1.number);
        System.out.println("Trial2: " + trial2.name + " " + trial2.number);
        System.out.println("Trial3: " + trial3.name + " " + trial3.number);
        System.out.println("-------------------");
        // Tüm trialler trial3'ün gösterdiği yeri gösteriyor.

    }
}
