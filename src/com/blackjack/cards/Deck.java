package com.blackjack.cards;
import java.util.*;

/**
 *
 * @author Fungho Baloyi - ST10405022
 */
public class Deck {
    private ArrayList<Card> cards; // ArrayList to store the cards in the deck
    
    // Constructor to initialize a deck with standard cards and shuffle them
    public Deck()
    {
        cards = new ArrayList<>();
        for (Suit suit : Suit.values())
        {
            for (Rank rank : Rank.values())
            {
                cards.add(new PlayingCard(rank, suit)); // Create cards without values
            }
        }
        shuffle(); // Shuffle the deck when it's created
    }
    
    public void shuffle() 
    {
        Collections.shuffle(cards); // This method provides an efficient and random shuffle of the cards.
    }
    
    public Card dealCard() 
    {
        if (cards.isEmpty()) 
        {
            throw new IllegalStateException("Deck is empty."); // Handle the case when the deck is empty
        }
        
        return cards.remove(0); // Remove and return the card at index 0, which represents the top card in the deck.
    }
}
