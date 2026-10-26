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
        Employee employee1 = new Employee("EMP001", "Andi Pratama", "Backend Developer", "IT", gaji1);
        employee1.ShowInfo();
    }
}
