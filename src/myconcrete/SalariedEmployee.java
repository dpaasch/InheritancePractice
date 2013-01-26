/*
 * @author Dawn Bykowski - Advanced Java Programming 152-135-20746-13
 */
package myconcrete;

import java.text.DecimalFormat;

public class SalariedEmployee extends Employee {

    // SalariedEmployee Class fields 
    private double EmployeeSalary;     // Employee salary

    // Constructor: Accepts as arguments the employee salary, along with 
    // the inherited fields from the Employee class: employee number, last
    // name, first name, hire date, and department.
    public SalariedEmployee(double salary, String num, String lName, String fName, 
            String dept) {
        // Call the superclass constructor
        super(num, lName, fName, dept);
        // Set the eSalary field.
        EmployeeSalary = salary;
    }
    
    // Constructor: Accepts as arguments the employee's salary
    public SalariedEmployee(double salary) {
        EmployeeSalary = salary;
    }

    // No-arg Constructor: 
    public SalariedEmployee() {
    }

    // Method toString(): represents the state of an object
    @Override
    public String toString() {

        // Create a DecimalFormat object to better display the salary
        DecimalFormat dollar = new DecimalFormat("###,##0.00");

        String salariedEmployee;
        salariedEmployee = super.toString() 
         + "\n  Salaried Employee Annual Salary: $" + dollar.format(EmployeeSalary);
        // Return the string.
        return salariedEmployee;
    }
    
    // Accessor & Mutator Methods
    public double getEmployeeSalary() {
        return EmployeeSalary;
    }

    public void setEmployeeSalary(double EmployeeSalary) {
        this.EmployeeSalary = EmployeeSalary;
    }

}
