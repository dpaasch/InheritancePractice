/*
 * @author Dawn Bykowski - Advanced Java Programming 152-135-20746-13
 */
package myinterface;

import java.text.DecimalFormat;

public class HourlyEmployee implements Employee {
    
    // HourlyEmployee class fields
    private String eNum;        // Employee number in the format XXX-L
    private String eLastName;   // Employee last name 
    private String eFirstName;  // Employee first name
    private String eDept;       // Employee department
    private double eHourlyRate; // Employee hourly rate

    // Constructor: Accepts as arguments the employee's hourly rate, along with
    // the inherited fields employee number, last name, first name, and department.
    public HourlyEmployee(double hourlyRate, String num, String lName, String fName,
            String dept) {
        // Set the employee fields.
        this.eNum = num;
        this.eLastName = lName;
        this.eFirstName = fName;
        this.eDept = dept;
        // Set the eHourlyRate field.
        eHourlyRate = hourlyRate;
    }

    // Constructor: Accepts as arguments, only the employee fields
    public HourlyEmployee(String num, String lName, String fName, String dept) {
        this.eNum = num;
        this.eLastName = lName;
        this.eFirstName = fName;
        this.eDept = dept;
    }
    
    // No-arg constructor
    public HourlyEmployee(){
        
    }

    // Method toString(): represents the state of an object
    @Override
    public String toString() {

        // Create a DecimalFormat object to better display the pay rate
        DecimalFormat dollar = new DecimalFormat("#,##0.00");

        String hourlyEmployee;
        hourlyEmployee = " Employee Number: \t" + eNum
                + "\n Employee Last Name: \t" + eLastName
                + "\n Employee First Name: \t" + eFirstName
                + "\n Employee Department: \t" + eDept
                + "\n  Hourly Employee Pay Rate: \t$" + dollar.format(eHourlyRate);
        // Return the string.
        return hourlyEmployee;
    }

    // Method: validateENum() validates employee number
    public static boolean validateENum(String num) {
        boolean status = true;
        if (num.length() != 5) {
            status = false;
        } else if (Character.isDigit(num.charAt(0))
                && (Character.isDigit(num.charAt(1))
                && (Character.isDigit(num.charAt(2))
                && (num.charAt(3) == '-')
                && ((Character.isLetter(num.charAt(4))))
                && (num.charAt(4) >= 'A' && num.charAt(4) <= 'Z')))) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }
        
    // Method added due to the abstract package requirement for one abstract method 
    @Override
    public double computePay() {
        return eHourlyRate;
    }
    
    // Accessor/Mutator Methods
    public String geteNum() {
        return eNum;
    }

    public void seteNum(String eNum) {
        this.eNum = eNum;
    }

    public String geteLastName() {
        return eLastName;
    }

    public void seteLastName(String eLastName) {
        this.eLastName = eLastName;
    }

    public String geteFirstName() {
        return eFirstName;
    }

    public void seteFirstName(String eFirstName) {
        this.eFirstName = eFirstName;
    }

    public String geteDept() {
        return eDept;
    }

    public void seteDept(String eDept) {
        this.eDept = eDept;
    }

    public double geteHourlyRate() {
        return eHourlyRate;
    }

    public void seteHourlyRate(double eHourlyRate) {
        this.eHourlyRate = eHourlyRate;
    }
   
}
