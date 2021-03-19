package com.JavaProjects;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    Deck deckOfCards = new Deck();
	    deckOfCards.createDeck();
	    Player playerOne = new Player(1, deckOfCards.cards);
	    Player playerTwo = new Player(2, deckOfCards.cards);
	    int winner = ScoreKeeper.winnerOfGame(playerOne.cards, playerTwo.cards, true);
	    if (winner == -1) System.out.println("There was a tie");
        else System.out.println("Player Number " + winner + " is the winner of the game!");
    }
}
