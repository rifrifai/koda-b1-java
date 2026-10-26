package com.koda;

public class Salary {
    private int _currentSalary;

    public Salary(int currentSalary){
        _currentSalary = currentSalary;
    }

    public int getSalary() {
        return _currentSalary;
    }

    public void salaryIncrease(int salary) {
        if (salary <= 0) {
            System.out.println("Salary Increase = Rp. " + salary);
            System.out.println("Error: Kenaikan Gaji harus lebih dari 0!");
        } else {
            _currentSalary += salary;
            System.out.println("Salary Increase = Rp. " + salary);
            System.out.println("Current Salary = Rp. " + _currentSalary);
        }
    }
}
