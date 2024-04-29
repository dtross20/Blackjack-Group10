import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;
/**
 * Write a description of class Deal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Deal extends Actor
{
    private Deck gameDeck;
    
    /**
     * Act - do whatever the Deal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }

    public Deal(Deck deck) {
        this.gameDeck = deck; // Assuming a Deck class that handles card operations
    }
    
    /**
     * Deals a specified number of cards to each hand in the array of players.
     * @param players Array of Hand, each representing a player's hand.
     * @param cardsPerHand Number of cards to deal to each player.
     */
    public void deal(Hand[] players, int cardsPerHand) {
        for (int i = 0; i < cardsPerHand; i++) {
            for (Hand player : players) {
                if (player != null && gameDeck.hasCards()) {
                    player.add(gameDeck.deal(true));
                }
            }
        }
    }
}
