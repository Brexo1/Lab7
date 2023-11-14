package ie.atu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Please enter a number between 0 - 9: ");
            Scanner myscan = new Scanner(System.in);

            //read user input as a string
            String input = myscan.nextLine();

            //pass the input to an integer
            int myNum = Integer.parseInt(input);

            //check if the number entered is between 0 and 9
            if (myNum >= 0 && myNum <= 9) {
                System.out.println("You entered " + myNum);
            } else {

                System.out.println("Not a valid Number");
            }
        } catch (NumberFormatException e) {
            System.out.println("Enter a valid numeric value: ");
        }
    }
}