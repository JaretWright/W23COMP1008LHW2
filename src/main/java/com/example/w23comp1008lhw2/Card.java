package com.example.w23comp1008lhw2;

public class Card {
    private String suit;
    private String faceName;

    /**
     * This is the constructor, it will create a new Card object in system
     * memory.  It will validate the suit and faceName are found in standard
     * playing cards
     * @param suit "hearts","clubs","spades","diamonds"
     * @param faceName "2","3","4",..."jack","queen","king","ace"
     */
    public Card(String suit, String faceName) {
        this.suit = suit;
        this.faceName = faceName;
    }
}
