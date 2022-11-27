package com.godoro.OF010.human;

public class Employee {
    private int employeeId;
    private String employeeName;
    private double monthlySalary;

    private Department department;


    public Employee() {
    }

    public Employee(int employeeId, String employeeName, double monthlySalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.monthlySalary = monthlySalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }



}
