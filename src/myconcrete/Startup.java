/*
 * @author Dawn Bykowski - Advanced Java Programming 152-135-20746-13
 */
package myconcrete;

import java.util.Scanner;

public class Startup {

    public static void main(String args[]) {

        // Create a Scanner object for keyboard input.
        Scanner input = new Scanner(System.in);

        // Get the emmployee number
        System.out.println("Enter the employee number in the format of XX");
        System.out.println("Employee Number: ");
        String num = input.nextLine();

        // Get the employee last name, first name
        System.out.println("Employee Last Name: ");
        String lName = input.nextLine();
        System.out.println("Employee First Name: ");
        String fName = input.nextLine();

        // Get the employee department
        System.out.println("Employee Department: ");
        String dept = input.nextLine();

        // Get the Salaried employee information
        System.out.println("Employee Annual Salary: ");
        double salary = input.nextDouble();

        // Create a new Salaried Employee object.
        SalariedEmployee salariedEmployee = new SalariedEmployee(salary, num, lName,
                fName, dept);

        // Display Employee/SalariedEmployee information
        System.out.println("\n\n\n\n");
        System.out.println("******Employee Information******");
        System.out.println(salariedEmployee);


    }
}
