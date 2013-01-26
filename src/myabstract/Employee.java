/*
 * @author Dawn Bykowski - Advanced Java Programming 152-135-20746-13
 */
package myabstract;

public abstract class Employee {

    // Employee Class fields 
    private String eNum;        // Employee number
    private String eLastName;   // Employee last name 
    private String eFirstName;  // Employee first name
    private String eDept;       // Employee department

    // Constructor: Accepts as arguments the employee's number, last name, first
    // name, and department.
    public Employee(String num, String lName, String fName, String dept) {
        this.eNum = num;
        this.eLastName = lName;
        this.eFirstName = fName;
        this.eDept = dept;
    }

    // No-arg Constructor    
    public Employee() {
    }

    // Method toString(): represents the state of an object
    @Override
    public String toString() {

        String employee;
        employee = " Employee Number: \t" + eNum
                + "\n Employee Last Name: \t" + eLastName
                + "\n Employee First Name: \t" + eFirstName
                + "\n Employee Department: \t" + eDept;
        // Return the string.
        return employee;
    }
}
