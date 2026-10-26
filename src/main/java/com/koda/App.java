package com.koda;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Salary gaji1 = new Salary(5000000);
        Salary gaji2 = new Salary(7000000);
        Employee employee1 = new Employee("EMP001", "Andi Pratama", "Backend Developer", "IT", gaji1);
        Employee employee2 = new Employee("EMP002", "Rio Dijenoro", "Frontend Developer", "IT", gaji2);
        employee1.ShowInfo();
        employee2.ShowInfo();
    }
}
