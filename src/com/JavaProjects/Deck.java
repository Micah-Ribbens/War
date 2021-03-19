package com.JavaProjects;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> cards = new ArrayList<>();

    public void createDeck() {
        final int CARDS_LENGTH = 52;
        for (var i = 1; i <= CARDS_LENGTH; i++)
            cards.add(new Card(i));

        Collections.shuffle(cards);
    }
}
