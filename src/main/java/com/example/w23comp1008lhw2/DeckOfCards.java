package com.example.w23comp1008lhw2;

import java.util.ArrayList;
import java.util.List;

public class DeckOfCards {
    //This is the instance variable that holds all of the Card objects.
    //You can think of it sort of like the box that holds all the Card's
    private ArrayList<Card> deck;

    /**
     * This is the constructor.  It will allocate system memory for the
     * ArrayList to hold Card objects.  It will also create 52 Card objects
     * and put them in the ArrayList
     */
    public DeckOfCards()
    {
        deck = new ArrayList<>();
        //"hearts","clubs","spades","diamonds"
        //   0         1       2        3
        List<String> suits = Card.getValidSuits();
        List<String> faceNames = Card.getFaceNames();

        for (int i=0 ; i< suits.size(); i++)
        {
            for (int x=0; x <faceNames.size() ; x++){
                deck.add(new Card(suits.get(i),faceNames.get(x)));
            }
        }
    }

    /**
     * This method returns the top Card from the deck or null if the
     * deck is empty
     */
    public Card dealTopCard()
    {
        if (deck.size()>0)
            return deck.remove(0);
        return null;
    }

    /**
     * This method returns the number of card objects remaining in the deck
     */
    public int getNumOfCards()
    {
        return deck.size();
    }
}
