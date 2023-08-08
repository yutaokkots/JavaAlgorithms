package org.example.codeChallengeLevel2;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Challenge03LetterPoints {
    public static final Map<Character, Integer> letterPoints = Map.ofEntries(Map.entry('A', 1),
            Map.entry('B', 3), Map.entry('C', 3), Map.entry('D', 2), Map.entry('E', 1),
            Map.entry('F', 4), Map.entry('G', 2), Map.entry('H', 4), Map.entry('I', 1),
            Map.entry('J', 8), Map.entry('K', 5), Map.entry('L', 1), Map.entry('M', 3),
            Map.entry('N', 1), Map.entry('O', 1), Map.entry('P', 3), Map.entry('Q', 10),
            Map.entry('R', 1), Map.entry('S', 1), Map.entry('T', 1), Map.entry('U', 1),
            Map.entry('W', 4), Map.entry('V', 4), Map.entry('X', 8), Map.entry('Y', 4),
            Map.entry('Z', 10));

    public static int wordScoreCalculator(String word) {
//        int accumulator = 0;
//        for (int i = 0; i < word.length(); i++){
//            char c = word.charAt(i);
//            int val = letterPoints.getOrDefault(Character.toUpperCase(c), 0);
//            accumulator += val;
//        }
//
//        return accumulator;
        String normalized = word.toUpperCase();
        AtomicInteger score = new AtomicInteger(0);
        // Using the AtomicInteger is faster and more readable than performing the same using synchronization.
        normalized.chars()
                .filter(Character::isAlphabetic)
                .mapToObj(n -> (char) n)
                .forEachOrdered(letter -> {
                        if (letterPoints.containsKey(letter)){
                            score.getAndAdd(letterPoints.get(letter));
                        } else {
                            System.out.println("looks like we need to add " + letter);
                        }
                });
        return score.get();
    }

    public static void main(String[] args) {
        System.out.println("Enter a word and we'll tell you how many " +
                "points it will earn!");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println("Your word " + word + " will earn "
                + wordScoreCalculator(word));
        sc.close();
    }
}
