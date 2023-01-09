package com.godoro.interview;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Interview2 {

    // string.charAt(index), returns char.
    // string.equals(other string), returns boolean
    // char[] charList1 = text1.toCharArray(); String'i char array olarak döner.
    // Arrays.sort(charList1); Diziyi sıralar.
    // Arrays.equals(charList1, charList2); iki listeye eşitlik kontrolü yapar, boolean döner.
    //
    //

    public static boolean isPalindrome(String text) {

        String str = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            str = str + text.charAt(i);
        }
        if (text.equals(str)) {
            return true;
        }
        return false;
    }

    public static String reverseText(String text) {

        String str = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            str = str + text.charAt(i);
        }
        return str;
    }

    public static int countLetterInString(String text, char letter) {

        int count = 0;

        for (int i = text.length() - 1; i >= 0; i--) {
            if (text.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }

    public static boolean isAnagram(String text1, String text2) {

        boolean response;

        if (text1.length() != text2.length()) {
            response = false;
        } else {
            //for (int i=0;i<text1.length();i++) {
            char[] charList1 = text1.toCharArray();
            char[] charList2 = text2.toCharArray();

            Arrays.sort(charList1);
            Arrays.sort(charList2);

            if (Arrays.equals(charList1, charList2)) {
                response = true;
            } else {
                response = false;
            }
        }
        return response;
    }

    public static void vowelsConsonants(String text) {

        int vowel = 0;
        int consonant = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c == 'a' || c == 'e' || c == 'ı' || c == 'i' || c == 'o' || c == 'ö' || c == 'u' || c == 'ü') {
                vowel++;
            } else {
                consonant++;
            }
        }
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);

    }

    public static String swap(StringBuilder s) {

        char first = s.charAt(0);
        int lastIndex = s.length() - 1;
        char last = s.charAt(s.length() - 1);

        s = s.deleteCharAt(lastIndex);
        s = s.deleteCharAt(0);

        String newText;

        newText = last + s.toString() + first;

        return newText;

    }

    public static void checkContainIndexes(List<String> list, String text) {
        List<Integer> indexes = new ArrayList<>();
        //list.stream().filter(v -> v==text).map(v -> list.indexOf(v)).toList();

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i) == text) {
                indexes.add(i);
            }
        }

        List<String> matchedValues = list.stream().filter(l -> l.contains(text)).toList();

        indexes.forEach(System.out::println); // prints [0, 4]
        matchedValues.forEach(System.out::println);
    }

    public static void fibonacciNumbers(int fibonacciIter) {

        int f0 = 1;
        int f1 = 1;
        int fibonacciNumber;

        System.out.format("%8d", f0);
        System.out.format("%8d", f1);

        for (int i = 3; i <= fibonacciIter; i++) {
            fibonacciNumber = f0 + f1;
            System.out.format("%8d", fibonacciNumber);

            f0 = f1;
            f1 = fibonacciNumber;

            if (i % 10 == 0) {
                System.out.println();
            }
        }

    }


}
