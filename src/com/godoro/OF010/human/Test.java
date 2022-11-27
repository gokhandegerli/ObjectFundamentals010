package com.godoro.OF010.human;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {


        Department departmentA = new Department(340, "Muhasebe");

        departmentA.setEmployeeList(new ArrayList<Employee>());

        //Alttaki yoruma alınan 9 satırlık kodu, yazılan addEmployee metodu sayesinde 3 satırda hallettik.
        /*Employee employee0 = new Employee(900,"Barış Manço",3400);
        employee0.setDepartment(departmentA);
        departmentA.getEmployeeList().add(employee0);

        Employee employee1 = new Employee(901,"Cem Karaca",2900);
        employee1.setDepartment(departmentA);
        departmentA.getEmployeeList().add(employee1);

        Employee employee2 = new Employee(902,"Fikret Kızılok",1700);
        employee2.setDepartment(departmentA);
        departmentA.getEmployeeList().add(employee2);*/

        Employee employee0 = departmentA.addEmployee(900,"Barış Manço",3400);
        departmentA.addEmployee(901,"Cem Karaca",2900);
        departmentA.addEmployee(902,"Fikret Kızılok",1700);
        //return değeri almak zorunda değiliz, ama Employee employee0 yapıp bu metodun returnunu alabilirdik, ki
        //sadece ilk employee için aldık (employee0) ve alandaki employeeName aşağıda yazdırdık.

        System.out.println("Departman No: " + departmentA.getDepartmentId());
        System.out.println("Departman Adı: "+ departmentA.getDepartmentName());
        System.out.println("--------------------");
        System.out.println(employee0.getEmployeeName());
        System.out.println("--------------------");

        for (Employee employee : departmentA.getEmployeeList()) {
            System.out.println("Çalışan Id: " + employee.getEmployeeId());
            System.out.println("Çalışan Adı: " + employee.getEmployeeName());
            System.out.println("Çalışan Mayışı: " + employee.getMonthlySalary());
            System.out.println("Çalışan Bölümü: " + employee.getDepartment().getDepartmentName());
            System.out.println("-------------------");
        }






    }


}
