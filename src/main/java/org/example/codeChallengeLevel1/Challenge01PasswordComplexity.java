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
        int charLimit = 0;
        boolean isUpper = false;
        boolean isLower = false;
        boolean isNum = false;

        char[] pswd = password.toCharArray();

        for (int i = 0; i < pswd.length; i++){
            charLimit ++;
            // also can use password.charAt[i]
            if (pswd[i] >= 'a' && pswd[i] <= 'z'){
                isUpper = true;
            }
            if (pswd[i] >= 'A' && pswd[i] <= 'Z'){
                isLower = true;
            }
            if (pswd[i] >= '0' & pswd[i] <= '9'){
                isNum = true;
            }
        }
        return charLimit > 6 && isUpper && isLower && isNum;
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
