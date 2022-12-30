package com.godoro.book_streams;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class TestStream {

    public static void main(String[] args) {

        List<Integer> list1 = Arrays.asList(3, 6, 9, 12, 15);
        List<Integer> list2 = Arrays.asList(4, 7, 10, 13, 16);
        List<Integer> list3 = Arrays.asList(41, 71, 101, 131, 161);
        List<Integer> list4 = Arrays.asList(42, 72, 102, 132, 162);
        List<List<Integer>> listOfLists = new ArrayList();
        listOfLists.add(list1);
        listOfLists.add(list2);
        listOfLists.add(list3);
        listOfLists.add(list4);
        listOfLists.stream()
                .flatMap(l -> l.stream())
                .sorted()
                .forEach(System.out::println);


    }



}
