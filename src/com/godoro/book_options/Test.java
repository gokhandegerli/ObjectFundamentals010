package com.godoro.book_options;

import java.util.Optional;

public class Test {


    public static void main(String[] args) {

        OptionalBasicTests optionalBasicTests = new OptionalBasicTests();

        OptionalBasicTests.testOptional();
        //OptionalBasicTests.testNull();
        OptionalBasicTests.testNullable();
        OptionalBasicTests.testEmpty();

        Optional<String> optional = Optional.ofNullable(null);
        OptionalBasicTests.testOrElse(optional);
        OptionalBasicTests.printvalue(Optional.of(null));



    }
}
