package com.godoro.book_options;

import java.util.Optional;

public class OptionalOrElseTest {

    public void printOrElse(Optional<String> optional, String defaults) {
        String value = optional.orElse(defaults);
        System.out.println("Ya da değilse değer: "+value);
    }

    public int deneme;





}
