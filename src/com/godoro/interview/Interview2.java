package com.godoro.interview;

import java.util.Arrays;

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

    public static void vowelsConsonants ( String text) {

        int vowel=0;
        int consonant=0;

        for (int i=0;i<text.length();i++) {
            char c = text.charAt(i);
            if (c=='a' || c =='e' || c == 'ı' || c == 'i' || c == 'o' || c == 'ö' || c == 'u' || c == 'ü') {
                vowel++;
            } else {
                consonant++;
            }
        }
        System.out.println("Vowels: " + vowel);
        System.out.println("Consonants: " + consonant);

    }


}
