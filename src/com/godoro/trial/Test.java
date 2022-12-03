package com.godoro.trial;

import java.util.ArrayList;
import java.util.List;

public class Test {

    //pass by reference
    public static Trial trialTest(Trial trial10, Trial trial20) {
        trial10.name = trial20.name;
        trial10.number = trial20.number;
        return trial10;
    }

    public static void main(String[] args) {

/*        Trial trial1 = new Trial("Ali", 12);
        Trial trial2 = trial1;

        Trial trial3 = new Trial("Mehmet", 3);

        System.out.println("Trial1: " + trial1.name + " " + trial1.number);
        System.out.println("Trial2: " + trial2.name + " " + trial2.number);
        System.out.println("Trial3: " + trial3.name + " " + trial3.number);
        System.out.println("-------------------");

        trialTest(trial1, trial3);

        System.out.println("Trial1: " + trial1.name + " " + trial1.number);
        System.out.println("Trial2: " + trial2.name + " " + trial2.number);
        System.out.println("Trial3: " + trial3.name + " " + trial3.number);
        System.out.println("-------------------");*/
        // Tüm trialler trial3'ün gösterdiği yeri gösteriyor.

        // ----------------------------------------------------

        Employee employee1 = new Employee("Ali", "Ali", "25");
        Employee employee2 = new Employee("Veli", "Veli", "32");
        Employee employee3 = new Employee("Osman", "Osman", null);
        Employee employee4 = new Employee("Tayyar", "Tayyar", "40");
        Employee employee5 = new Employee("Esin", "Esin", null);
        Employee employee6 = new Employee("Ayşe", "Ayşe", "23");

        Department department = new Department();
        department.employeeList = new ArrayList<>();
        department.employeeList.add(employee1);
        department.employeeList.add(employee2);
        department.employeeList.add(employee3);
        department.employeeList.add(employee4);
        department.employeeList.add(employee5);
        department.employeeList.add(employee6);

       List<Employee> employeeList2 = department.employeeList.stream().
               filter(employee -> employee.age==null).toList();

       for (Employee employee: employeeList2) {
           System.out.println(employee.name);
       }




    }
}
