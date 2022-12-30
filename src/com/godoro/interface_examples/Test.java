package com.godoro.interface_examples;

public class Test {

    public static void main(String[] args) {


        Service service = new Service();

        Repository repository = new RepositoryImpl();

        service.repository =repository;
        service.repository.greeting();
        System.out.println(service.repository.getMessage("Mesaj1"));
        System.out.println(service.repository.setMessage("Setlenen mesaj"));
        System.out.println("--------------------------------------");

        //Repository repository1 = new JpaImpl();



        /*Jpa jpa = new JpaImpl();

        service.jpa = jpa;
        service.jpa.greeting();
        System.out.println(service.jpa.getMessage("Mesaj1"));
        System.out.println(service.jpa.setMessage("Setlenen mesaj"));*/






    }
}
