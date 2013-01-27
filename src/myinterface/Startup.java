/*
 * @author Dawn Bykowski - Advanced Java Programming 152-135-20746-13
 */
package myinterface;

public class Startup {

    public static void main(String args[]) {
        
        // Get the employee number and validate it
        System.out.println("Enter the employee number in the format of XXX-L");
        String num;
        do {
            System.out.println("Employee Number: ");
        num = input.nextLine();
        } while (!Employee.validateENum(num));
    }
}
