package com.example.w23comp1008lhw2;

import java.util.Arrays;
import java.util.List;

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
        setSuit(suit);
        this.faceName = faceName;
    }

    public String getSuit() {
        return suit;
    }

    /**
     * Validates the argument and sets the instance variable
     * @param suit "hearts","clubs","spades","diamonds"
     */
    public void setSuit(String suit) {
        List<String> validSuits = Arrays.asList("hearts","clubs","spades","diamonds");

        //test if the argument is in the list of valid suits
        if (validSuits.contains(suit))
            this.suit = suit;
        else
            throw new IllegalArgumentException(suit + " was not in the list of "+
                    validSuits);
    }

    public String getFaceName() {
        return faceName;
    }

    public void setFaceName(String faceName) {
        this.faceName = faceName;
    }

    @Override
    public String toString()
    {
        return faceName + " of " + suit;
    }
}
