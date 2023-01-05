package com.godoro.interview;

import java.util.Arrays;

public class Interview {

    public static boolean isPalindrome(String text) {

        String s = "";

        boolean check = false;

        for (int i = text.length() - 1; i >= 0; i--) {
            s = s + text.charAt(i);
        }

        // Checking if both the strings are equal
        if (text.equals(s)) {
            check = true;
        }
        return check;
    }

    public static String reverseText(String text) {

        String reverseText = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverseText = reverseText + text.charAt(i);
        }

        return reverseText;
    }

    public static int countLetterInString(String text, char search) {

        int count = 0;

        int length = text.length();

        for (int i = 0; i < length; i++) {

            if (text.charAt(i) == search) {

                count++;

            }

        }
        return count;
    }


    public static boolean isAnagram(String t1, String t2) {


        boolean b = false;

        if (t1.length() != t2.length()) {
            System.out.println(t1 + " and " + t2 + " not anagrams string");
        } else {

            char[] anagram1 = t1.toCharArray();
            char[] anagram2 = t2.toCharArray();
            Arrays.sort(anagram1);
            Arrays.sort(anagram2);
            b = Arrays.equals(anagram1, anagram2);
        }

        if (b == true) {
            System.out.println("anagrams string");
        } else {
            System.out.println("not anagrams string");
        }
        return b;
    }


    public static void vowelsConsonants ( String text) {

        int vowels = 0;
        int consonants = 0;

        for (int k = 0; k < text.length(); k++) {
            char c = text.charAt(k);
            if (c == 'a' || c == 'e' || c == 'ı' || c == 'i' || c == 'o' || c == 'ö' || c == 'u' || c == 'ü')
                vowels++;
            else
                consonants++;
        }

        System.out.println("Vowel count is " + vowels);
        System.out.println("Consonant count is: " + consonants);

    }






}

