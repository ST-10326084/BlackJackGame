package com.blackjack.cards;

/**
 *
 * @author Fungho Baloyi - ST10405022
 */

// Concrete subclass for playing cards
public class PlayingCard extends Card {
    public PlayingCard(Rank rank, Suit suit)
    {
        super(rank, suit);
    }
    
    @Override
    public int getValue()
    {
        // determine the value of the card in Blackjack
        switch (getRank()) {
            case ACE:
                return 11; // Ace can be 11 or 1 in Blackjack.
            case KING:
            case QUEEN:
            case JACK:
                return 10; // Face cards are 10
            default:
                return getRank().ordinal() + 1; // Assuming numbered cards have values corresponding to their ranks.
        }
    }
}
