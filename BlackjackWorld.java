import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackjackWorld extends World
{
    private int index;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public BlackjackWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(1100, 800, 1); 
        Deck gameDeck = new Deck(4);
        Player1 player1 = new Player1("player 1");
        Player2 player2 = new Player2("player 2");
        Player3 player3 = new Player3("player 3");

        index =0;
        //BlackjackHand[] players = new BlackjackHand[2];
        
        Greenfoot.playSound(" Kenean.mp3");
        addObject(new  Hit(),576,728);
        addObject(new Stand(),576,680);
        addObject(gameDeck,550,120);
        addObject(player1,250, 530);
        addObject(player2,450,586);
        addObject(player3,650,580);
        
        
        
        //player1.add(gameDeck.shuffle(true));
        player1.add(gameDeck.deal(true));
        player2.add(gameDeck.deal(true));
        player3.add(gameDeck.deal(true));
    }
    
    public void act()
    {
        
    }
    
}
