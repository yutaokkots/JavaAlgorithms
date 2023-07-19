package org.example.codeChallengeLevel1;
import java.util.Scanner;

public class Challenge01PasswordComplexity {

    public static boolean isPasswordComplex(String password){
        // enter code below
        // String.toCharArray()
        // must have at least six characters //.length()
        // must have one uppercase letter // isUpperCase()
        // must have one lowercase letter // isLowerCase()
        // must have one number

        return false;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a password: ");
        // .nextLine():
        // Scanner class scans from the current position until it finds a line separator delimiter.
        // The method returns the String from the current position to the end of the line.
        String userInput = scanner.nextLine();

        System.out.println("Is the password complex? " + isPasswordComplex(userInput));

        scanner.close();
    }

}
