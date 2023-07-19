package org.example.codeChallengeLevel1;
import java.util.Scanner;

public class Challenge01EvenOrOdd {
    public static boolean isEven(int n){
        // implement functionality
        return n % 2 == 0;
    }
    public static void main(String[] args){
        // instantiate Scanner class
        Scanner scanner = new Scanner(System.in);

        // print line out
        System.out.println("Enter a number: ");
        // expect an integer from scanner, and save as int variable, 'userNum'
        int userNum = scanner.nextInt();
        System.out.println("Is the number even? " + isEven(userNum));

        scanner.close();
    }

}
