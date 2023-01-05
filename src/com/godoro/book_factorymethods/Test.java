package com.godoro.book_factorymethods;

import java.util.ArrayList;
import java.util.List;



public class Test {

    public static void printList(List<String> list) {
        for (String text:list) {
            System.out.println(text);
        }
    }



    public static void main(String[] args) {


        FactMethods factMethods = new FactMethods();

        List<String> list2 = List.of("1","2","3","4");

        printList(list2);
        //list2.add(String.valueOf(5));
        //printList(list2);

        factMethods.list = List.of("1","2","3");
        //factMethods.list.add("1"); List.of'a ekleme yapılamaz, çünkü final.
        printList(factMethods.list);
        System.out.println(factMethods.getClass());



        //list2.stream().map(String:System.out.println();

    }

}
