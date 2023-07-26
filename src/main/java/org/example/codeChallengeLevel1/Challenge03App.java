package org.example.codeChallengeLevel1;

public class Challenge03App {
    public static void main(String[] args){
        Challenge03DoubleOrNothing game = new Challenge03DoubleOrNothing();

        while (game.getIsStillPlaying()) {
            game.playGame();
        }

    }
}
