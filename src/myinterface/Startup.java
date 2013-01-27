/*
 * @author Dawn Bykowski - Advanced Java Programming 152-135-20746-13
 */
package myinterface;

import java.util.Scanner;

public class Startup {

    public static void main(String args[]) {

        // Create a Scanner object for keyboard input.
        Scanner input = new Scanner(System.in);

        // Get the employee number and validate it
        System.out.println("Enter the employee number in the format of XXX-L");
        String num;
        do {
            System.out.println("Employee Number: ");
            num = input.nextLine();
        } while (!SalariedEmployee.validateENum(num));

        // Get the employee last name, first name
        System.out.println("Employee Last Name: ");
        String lName = input.nextLine();
        System.out.println("Employee First Name: ");
        String fName = input.nextLine();

        // Get the employee department
        System.out.println("Employee Department: ");
        String dept = input.nextLine();

        // Query Employee status - Salaried or hourly
        System.out.println("Is Employee Salaried (Yes or No)? ");
        String choice = input.nextLine();   // Holds answer to Salary question
        if ("yes".equals(choice) || "Yes".equals(choice)) {
            // Get the Salaried employee information
            System.out.println("Employee Annual Salary: ");
            double salary = input.nextDouble();

//            // Create a SalariedEmployee object
//            SalariedEmployee sEmployee = new SalariedEmployee(salary, num, lName,
//                    fName, dept);

            // Create a SalaryPlusBonusEmployee object
            double bonus = 0;
            SalaryPlusBonusEmployee sPlusEmployee = new SalaryPlusBonusEmployee(bonus, salary, num, lName, fName, dept);
            sPlusEmployee.seteBonus(salary * .05);

            // Display Employee/SalariedEmployee/SalaryPlusBonusEmployee information
            System.out.println("\n\n\n\n");
            System.out.println("******Employee Information******");
            System.out.println(sPlusEmployee.toString());
            sPlusEmployee.computePay();
        } else {
            // Get the Hourly employee information
            System.out.println("Employee Hourly Rate: ");
            double rate = input.nextDouble();

            // Create an HourlyEmployee object
            HourlyEmployee hEmployee = new HourlyEmployee(rate, num, lName,
                    fName, dept);

            // Display Employee/HourlyEmployee information
            System.out.println("\n\n\n\n");
            System.out.println("******Employee Information******");
            System.out.println(hEmployee);
        }
    }
}