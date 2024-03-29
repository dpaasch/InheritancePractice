/*
 * @author Dawn Bykowski - Advanced Java Programming 152-135-20746-13
 */
package myconcrete;

public class Employee {

    // Employee Class fields 
    private String eNum;        // Employee number in the format XXX-L
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
    
    // Method: validateENum() validates employee number
    public static boolean validateENum(String num) {
        boolean status = true;
        if(num.length() != 5 ) {
            status = false;
        } else if 
               (Character.isDigit(num.charAt(0))
            && (Character.isDigit(num.charAt(1)) 
            && (Character.isDigit(num.charAt(2)) 
            && (num.charAt(3) == '-') 
            && ((Character.isLetter(num.charAt(4))))
            && (num.charAt(4) >= 'A' && num.charAt(4) <= 'Z')))){            
            status = true;
        } else {
            status = false;
        }
        return status;
    }
    
    // Accessor & Mutator Methods: 
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
}