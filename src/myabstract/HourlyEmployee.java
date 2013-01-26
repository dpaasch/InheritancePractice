/*
 * @author Dawn Bykowski - Advanced Java Programming 152-135-20746-13
 */
package myabstract;

import java.text.DecimalFormat;

public class HourlyEmployee extends Employee {

    // HourlyEmployee Class fields 
    private double eHourlyRate;     // Employee hourly rate

    // Constructor: Accepts as arguments the employee's hourly rate, along with
    // the inherited fields employee number, last name, first name, and department.
    public HourlyEmployee(double hourlyRate, String num, String lName, String fName,
            String dept) {
        // Call the superclass constructor
        super(num, lName, fName, dept);
        // Set the eSalary field.
        eHourlyRate = hourlyRate;
    }

    // No-arg Constructor
    public HourlyEmployee(String num, String lName, String fName,
            String dept) {
        super(num, lName, fName, dept);
    }

    // Method toString(): represents the state of an object
    @Override
    public String toString() {

        // Create a DecimalFormat object to better display the pay rate
        DecimalFormat dollar = new DecimalFormat("#,##0.00");

        String hourlyEmployee;
        hourlyEmployee = super.toString()
                + "\n  Hourly Employee Pay Rate: \t$" + dollar.format(eHourlyRate);
        // Return the string.
        return hourlyEmployee;
    }

    // Accessor/Mutator Methods
    public double geteHourlyRate() {
        return eHourlyRate;
    }

    public void seteHourlyRate(double eHourlyRate) {
        this.eHourlyRate = eHourlyRate;
    }
}
