package com.JavaProjects;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Player {
    public int number;
    public ArrayList<Card> cards;

    public Player(int playerNumber, ArrayList<Card> deckOfCards) {
        if (playerNumber == 1)
//          subList sadly returns a List so I had to cast that list to an ArrayList
            cards = UtilityFunctions.subArrayList(0, 25, deckOfCards);
        else {
        cards = UtilityFunctions.subArrayList(26, 51, deckOfCards);
        }
    }

}
