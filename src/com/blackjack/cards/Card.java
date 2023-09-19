/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.blackjack.cards;

/**
 *
 * @author Fungho Baloyi - ST10405022
 */
public abstract class Card {
    protected Rank rank;
    protected Suit suit;
    
    public Card(Rank rank, Suit suit)
    {
        this.rank = rank;
        this.suit = suit;
    }
    
    @Override
    public String toString()
    {
        return rank + " of " + suit;
    }
}
