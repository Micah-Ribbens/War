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
            int higherCard = playerOnesCard.higherCard(playerOnesCard, playerTwosCard);

            if (higherCard == playerOnesCard.number) playerOnesScore++;
            if (higherCard == playerTwosCard.number) playerTwosScore++;

            System.out.println();
            System.out.println("pos: "+ playerOnesScore + " pos2: "+ playerTwosScore);

        }
//      Im not sure if this is technically right but it doesn't matter because it is a
//      50/50 chance either way.
        if (playerOnesScore > playerTwosScore) return 1;
        if (playerOnesScore < playerTwosScore) return 2;
        return -1;
    }
}
