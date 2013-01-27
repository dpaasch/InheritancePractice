/*
 * @author Dawn Bykowski - Advanced Java Programming 152-135-20746-13
 */
package myinterface;

import java.text.DecimalFormat;

public class SalaryPlusBonusEmployee extends SalariedEmployee {
    
    // SalariedPlusBonusEmployee class fields
    private String eNum;        // Employee number in the format XXX-L
    private String eLastName;   // Employee last name 
    private String eFirstName;  // Employee first name
    private String eDept;       // Employee department
    private double eBonus;      // Salaried employee bonus
    
    // Constructor: Accepts salaried employee bonus, along with the SalariedEmployee
    // inherited field salary and the Employee inherited fields.
    public SalaryPlusBonusEmployee(double bonus, double salary, String num, 
            String lName, String fName, String dept) {
        super(salary, num, lName, fName, dept);
        this.eBonus = bonus;
    }
    
    // Constructor: Accepts only the Employee inherited fields.
    public SalaryPlusBonusEmployee(String num, String lName, String fName, String dept) {
        super(num, lName, fName, dept);
    }

    // Method toString(): represents the state of an object
    @Override
    public String toString() {

        // Create a DecimalFormat object to better display the salary
        DecimalFormat dollar = new DecimalFormat("###,##0.00");

        String salaryPlusBonusEmployee;
        salaryPlusBonusEmployee = super.toString() 
         + "\n   Salaried Employee Bonus: $" + dollar.format(eBonus);
        // Return the string.
        return salaryPlusBonusEmployee;
    }
    
    // Accessor & Mutator methods:
    public double geteBonus() {
        return eBonus;
    }

    public void seteBonus(double eBonus) {
        this.eBonus = eBonus;
    }
}
