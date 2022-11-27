package com.godoro.OF010.human;

import java.util.List;

public class Department {
    private int departmentId;
    private String departmentName;

    private List<Employee> employeeList;



    public Department() {
    }

    public Department(int departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Employee addEmployee (int Id, String name, double salary) {

        Employee employee = new Employee(Id, name, salary);
        employee.setDepartment(this);
        employeeList.add(employee);
        return employee;


    }

}
