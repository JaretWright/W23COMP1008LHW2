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
        setFaceName(faceName);
    }

    public String getSuit() {
        return suit;
    }

    /**
     * Validates the argument and sets the instance variable
     * @param suit "hearts","clubs","spades","diamonds"
     */
    public void setSuit(String suit) {
        suit = suit.toLowerCase();

        //check for s in the final position of the string, if not add one
        if (suit.charAt(suit.length()-1) != 's')
            suit = suit+"s";

        List<String> validSuits = getValidSuits();

        //test if the argument is in the list of valid suits
        if (validSuits.contains(suit))
            this.suit = suit;
        else
            throw new IllegalArgumentException(suit + " was not in the list of "+
                    validSuits);
    }

    /**
     * This method returns a list of all the valid suits
     * @return
     */
    public static List<String> getValidSuits()
    {
        return Arrays.asList("hearts","clubs","spades","diamonds");
    }

    public String getFaceName() {
        return faceName;
    }

    public static List<String> getFaceNames()
    {
        return Arrays.asList("2","3","4",
                "5","6","7","8","9","10","jack","queen","king","ace");
    }

    /**
     * validates the argument and sets the instance variable
     * @param faceName "2","3","4",..."jack","queen","king","ace"
     */
    public void setFaceName(String faceName) {
        List<String> validFaceNames = getFaceNames();
        faceName = faceName.toLowerCase();

        if (validFaceNames.contains(faceName))
            this.faceName = faceName;
        else
            throw new IllegalArgumentException(faceName + " must be from the list "
                                            + validFaceNames);
    }

    @Override
    public String toString()
    {
        return faceName + " of " + suit;
    }

    /**
     * This method returns the colour of the suit.  Red = hearts or diamonds
     * Black = clubs or spades
     */
    public String getColour()
    {
        if (suit.equals("hearts") || suit.equals("diamonds"))
            return "red";
        else
            return "black";
    }

    /**
     * This returns the value of the card
     * index    ->  0 , 1 , 2,  3 , 4 , 5 , 6,  7,  8,    9,    10,      11,   12
     * faceName -> "2","3","4","5","6","7","8","9","10","jack","queen","king","ace"
     * value    ->  2 , 3,  4,  5,  6,  7,  8, 9,  10,   11,    12,     13,    14
     */
    public int getCardValue()
    {
        List<String> faceNames = getFaceNames();
        int indexPosition = faceNames.indexOf(faceName);
        return indexPosition+2;
    }
}
