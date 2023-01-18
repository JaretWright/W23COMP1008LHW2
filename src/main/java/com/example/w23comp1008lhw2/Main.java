package com.example.w23comp1008lhw2;

public class Main {
    public static void main(String[] args) {
        Card card1 = new Card("spades","jack");
        System.out.println(card1);

        System.out.println(card1 + " colour: "+card1.getColour());
        System.out.println(card1.getCardValue());
    }
}
