package com.koda;

public class Employee {
    private String _employeeID;
    private String _name;
    private String _position;
    private String _department;
    private Salary _salary;

    public Employee(String employeeID, String name, String position, String department, Salary salary) {
        _employeeID = employeeID;
        _name = name;
        _position = position;
        _department = department;
        _salary = salary;
    }

    public void ShowInfo() {
        System.out.println("=======================");
        System.out.println("     KODA ENTERPRISE    ");
        System.out.println("=======================");
        System.out.println("Employee ID : " + _employeeID);
        System.out.println("Name        : " + _name);
        System.out.println("Position    : " + _position);
        System.out.println("Department  : " + _department);
        System.out.println("Salary      : Rp. " + _salary.getSalary());
        _salary.salaryIncrease(150000);
    }
}
