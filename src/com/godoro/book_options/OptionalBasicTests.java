package com.godoro.book_options;

import java.util.Optional;

public class OptionalBasicTests {

    public static void printvalue(Optional<String> optional) {
        if (optional.isPresent()) {
            String value = optional.get();
            System.out.println("Değer var: " + value);
        } else {
            System.out.println("Değer yok");
        }
        System.out.println("Seçimli değer var mı?: " + optional.isPresent());
        System.out.println("Seçimli değer boş mu?: " + optional.isPresent());
        System.out.println("Seçimli değer String hali: " + optional.toString());
    }

    public static void testOptional() {
        Optional<String> optional = Optional.of("Godoro");
        printvalue(optional);
    }

    public static void testNull() {
        try {
            Optional<String> optional = Optional.of(null);
            printvalue(optional);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testNullable() {
        Optional<String> optional = Optional.ofNullable(null);
        printvalue(optional);
    }

    public static void testEmpty() {
        Optional<String> optional = Optional.empty();
        printvalue(optional);
    }

    public static void testOrElse(Optional<String> optional) {
        System.out.println(optional.map(String::toString).orElse(Optional.of("Deneme").get()));
    }

}
