package com.godoro.trial;

import java.lang.reflect.Method;
import java.util.Arrays;

public class JavaReflection {

    public static void main(String[] args) {

        Class<?> stringClass = String.class; // double, float, char, Object, System, String vb.

        System.out.println(stringClass.getName());
        System.out.println(stringClass.getSimpleName());
        System.out.println(stringClass.getPackage());
        System.out.println("----------------------------");

        Method[] methods = stringClass.getMethods();
        System.out.println("Metot sayısı: " + methods.length);
        for (Method method : methods) {
            System.out.println(method.getName() + " " + method.getParameterCount());
        }


    }

}
