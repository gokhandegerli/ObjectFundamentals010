package com.godoro.OF15.enums;

public class Test {


    private static void printEnumDay(Day day) {
        System.out.println("Sıra gün sayısı: "+day.ordinal());
        switch (day) {
            case MONDAY : System.out.println("PAZARTESİ"); break;
            case TUESDAY : System.out.println("SALI"); break;
            case WEDNESDAY : System.out.println("ÇARŞAMBA"); break;
        }
    }

    private  static  void  printEnumDays (Days days) {
        System.out.println("Sıra Gün sayısı: "+days.getNumber());
        System.out.println("Gün etiketi: "+days.getLabel());
    }

    public static void main(String[] args) {
        Day day2 = Day.MONDAY;
        printEnumDay(day2);
        printEnumDay(Day.TUESDAY);
        //printEnumDay(45); yapamıyoruz.

        for (Day day : Day.values()) {
            System.out.println("--"+day);
        }

        Day dayFromString = Day.valueOf("TUESDAY");
        System.out.println("Stringden gün: " + dayFromString);

        Day dayFromOrdinal = Day.values()[2];
        System.out.println(dayFromOrdinal);

        System.out.println("---Days ile olan örnekler başlangıç ---");

        Days day3 = Days.MONDAY;
        printEnumDays(day3);
        printEnumDays(Days.TUESDAY);
        //printEnumDay(45); yapamıyoruz.

        for (Days days : Days.values()) {
            System.out.println("--"+days);
        }

        Days daysFromString = Days.valueOf("TUESDAY");
        System.out.println("Stringden gün: " + daysFromString);

        Days daysFromOrdinal = Days.values()[2];
        System.out.println(daysFromOrdinal);


    }

}
