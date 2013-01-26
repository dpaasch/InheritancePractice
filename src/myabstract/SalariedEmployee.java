/*
 * @author Dawn Bykowski - Advanced Java Programming 152-135-20746-13
 */
package myabstract;

import java.text.DecimalFormat;

public class SalariedEmployee extends Employee {

    // SalariedEmployee class fields
    private double eSalary;     // Employee annual salary

    // Constructor: Accepts as arguments the employee's annual salary, along with
    // the inherited fields employee number, last name, first name, and department.
    public SalariedEmployee(double salary, String num, String lName, String fName,
            String dept) {
        // Call the superclass constructor
        super(num, lName, fName, dept);
        // Set the eSalary field.
        this.eSalary = salary;
    }

    // no-arg constructor
    public SalariedEmployee(String num, String lName, String fName, String dept) {
        super(num, lName, fName, dept);
    }

    // Method toString(): represents the state of an object
    @Override
    public String toString() {

        // Create a DecimalFormat object to better display the salary
        DecimalFormat dollar = new DecimalFormat("###,##0.00");

        String salariedEmployee;
        salariedEmployee = super.toString()
                + "\n  Salaried Employee Annual Salary: $" + dollar.format(eSalary);
        // Return the string.
        return salariedEmployee;
    }

    // Accessor & Mutator Methods
    public double geteSalary() {
        return eSalary;
    }

    public void seteSalary(double eSalary) {
        this.eSalary = eSalary;
    }
}
