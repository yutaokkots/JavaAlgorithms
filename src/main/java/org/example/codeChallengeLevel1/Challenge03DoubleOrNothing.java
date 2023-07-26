package org.example.codeChallengeLevel1;
import java.util.Random;
import java.util.Scanner;
public class Challenge03DoubleOrNothing {
    private int userScore = 10;
    public void playGame(){
        // user starts with 10 points
        // user can take a chance to double score or get nothing
        // if user takes chance, randomness decides

        System.out.println("You have 10 points. Double or nothing? (type 'd' or 'n'; 'q' to quit: ");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();
        Random random = new Random();
        if (userInput.trim().equalsIgnoreCase("d")){
            if (random.nextBoolean() == true){
                userScore *= 2;
            }
            System.out.println("Your score is " + userScore);
        } else if (userInput.trim().equalsIgnoreCase("n")){
            System.out.println("Your score is " + userScore);
        } else{
            System.out.println("enter a valid value");
        }
    }

    public boolean getIsStillPlaying(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(askUserToContinue());
        String userStillPlaying = scanner.nextLine();
        return userStillPlaying.trim().equalsIgnoreCase("yes");
    }
    public String askUserToContinue(){
        String prompt = "Would you like to continue and try to double your winnings? Enter YES to continue\n";
        return prompt;
    }
}
