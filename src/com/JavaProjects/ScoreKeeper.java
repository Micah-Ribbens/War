package com.JavaProjects;

import java.util.ArrayList;

public class ScoreKeeper {
    public static int winnerOfGame(ArrayList<Card> playerOnesHand,
                            ArrayList<Card> playerTwosHand, boolean printCardsPlayed) {
//      the hand of player one and the hand of player two are the same length
        int playerOnesScore = 0;
        int playerTwosScore = 0;
        for (var i = 0; i < playerOnesHand.size(); i++) {
            Card playerOnesCard = playerOnesHand.get(i);
            Card playerTwosCard = playerTwosHand.get(i);
            if (printCardsPlayed) {
                System.out.println("Player One: " + playerOnesCard.toCardName());
                System.out.println("Player Two: " + playerTwosCard.toCardName());
            }

            if (playerOnesCard.number > playerTwosCard.number) {
                playerOnesScore++;

            } else {
                playerTwosScore++;
            }
        }
//      Im not sure if this is technically right but it doesn't matter because it is a
//      50/50 chance either way.
        return playerOnesScore > playerTwosScore ? 1 : 2;
    }
}
