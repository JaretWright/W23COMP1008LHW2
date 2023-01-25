package com.example.w23comp1008lhw2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        Card card1 = new Card("spades","jack");
//        System.out.println(card1);
//
//        System.out.println(card1 + " colour: "+card1.getColour());
//        System.out.println(card1.getCardValue());
        ArrayList<Card> player1Hand = new ArrayList<>();
        ArrayList<Card> player2Hand = new ArrayList<>();
        ArrayList<Card> player3Hand = new ArrayList<>();
        ArrayList<Card> player4Hand = new ArrayList<>();

        DeckOfCards deck = new DeckOfCards();
        deck.shuffle();

        for (int i=1 ; i<=5 ; i++)
        {
            player1Hand.add(deck.dealTopCard());
            player2Hand.add(deck.dealTopCard());
            player3Hand.add(deck.dealTopCard());
            player4Hand.add(deck.dealTopCard());
        }

        System.out.println("player 1: "+player1Hand);
        System.out.println("player 2: "+player2Hand);
        System.out.println("player 3: "+player3Hand);
        System.out.println("Cards left in the deck : " + deck.getNumOfCards());
    }
}
