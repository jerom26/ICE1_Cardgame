/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

import java.util.Random;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * @modifier Jerom Jiju
 * student id: 991711144
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        Random randomGen = new Random();
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            c.setValue(randomGen.nextInt(13)+1);//c.setValue(insert call to random number generator here)
            c.setSuit(Card.SUITS[randomGen.nextInt(4)]);
            magicHand[i] = c;
        }
        
        Card luckyCard = new Card();
        luckyCard.setValue(6);
        luckyCard.setSuit("Spade");
        
        for (Card c: magicHand) {
            if (c.getValue() == luckyCard.getvalue() && c.getSuit().equals(luckyCard.getsuit())) {
                System.out.println("Congratulations, Your lucky card is found in the magic hand!");
                return;
            }
        }
        
        System.out.println("Sorry! Your lucky card is not in the magic hand.");
    }
}

    }
    
}
