package com.JavaProjects;

import java.util.HashMap;

public class Card {
    public int number;

    public Card(int number) {
        this.number = number;
    }

    public String toCardName() {
        HashMap<Number, String> numberToSuit = new HashMap<>();
        numberToSuit.put(1, "Hearts");
        numberToSuit.put(2, "Spades");
        numberToSuit.put(3, "Diamonds");
        numberToSuit.put(4, "Clubs");

        HashMap<Number, String> numberToCard = new HashMap<>();
        numberToCard.put(1, "Ace");
        numberToCard.put(2, "Two");
        numberToCard.put(3, "Three");
        numberToCard.put(4, "Four");
        numberToCard.put(5, "Five");
        numberToCard.put(6, "Six");
        numberToCard.put(7, "Seven");
        numberToCard.put(8, "Eight");
        numberToCard.put(9, "Nine");
        numberToCard.put(10, "Ten");
        numberToCard.put(11, "Jack");
        numberToCard.put(12, "Queen");
        numberToCard.put(13, "King");

        int suitNumber = (int) Math.floor(number / 13) + 1;
//        52 / 13 + 1 -> 4 + 1 -> 5 -> Five is an impossible suit number
        if (suitNumber == 5) suitNumber = 4;
//      13 % 13 + 1 -> 0 + 1 -> 1, 1 % 13 + 1 -> 1 + 1 -> 2
//      Basically shifts everything to the right one number
        return numberToCard.get((number % 13) + 1) + " of " + numberToSuit.get(suitNumber);
    }
    public int higherCard(Card card1, Card card2) {
//      Ace being 13 -> King being 12 -> Queen being 11 etc.
        int card1Power = (card1.number % 13) + 1;
        int card2Power = (card2.number % 13) + 1;

        if (card1Power == 1 && card2Power == 1) return -1;
        
        if (card1Power == 1) return card1.number;
        if (card2Power == 1) return card2.number;

        if (card1Power > card2Power) return card1.number;
        if (card2Power > card1Power) return card2.number;
        return -1;
    }
    @Override
    public String toString() {
//      To convert the number into a string
        return "" + number;
    }

}
