package com.example.w23comp1008lhw2;

public class Main {
    public static void main(String[] args) {
//        Card card1 = new Card("spades","jack");
//        System.out.println(card1);
//
//        System.out.println(card1 + " colour: "+card1.getColour());
//        System.out.println(card1.getCardValue());
        DeckOfCards deck = new DeckOfCards();
        for (int i=1 ; i<=10 ; i++)
            System.out.println(deck.dealTopCard());
    }
}
