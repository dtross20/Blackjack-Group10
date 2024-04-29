import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackjackWorld extends World
{
    private boolean playerTurn = true;
    private Deck gameDeck;
    private BlackjackHand player;
    private BlackjackHand dealer;
    private String[]BlackjackHand = {"player1","player2","player3"};
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public BlackjackWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1100, 800, 1);
        gameDeck = new Deck(4);
        int player = 0;
        Player1 player1 = new Player1("player 1");
        boolean player1Turn = true;
        Player2 player2 = new Player2("player 2");
        boolean player2Turn = false;
        Player3 player3 = new Player3("player 3");
        boolean player3Turn = false;
        dealer = new BlackjackHand("dealer");
        int index = 0;
        
        Greenfoot.playSound(" Kenean.mp3");
        Hit hit = new Hit();
        Stand stand = new Stand();
        addObject(hit, 576, 728);
        addObject(stand, 576, 680);
        addObject(gameDeck, 550, 120);
        addObject(player1, 250, 530);
        addObject(player2, 450, 586);
        addObject(player3, 650, 580);
        
        player1.add(gameDeck.deal(true));
        player2.add(gameDeck.deal(true));
        player3.add(gameDeck.deal(true));
        if (hit.isPressed()){
        player1.add(gameDeck.deal(true));
        hit.reset();
    }
    }

    public void act() {
        
        if (playerTurn) {
            if (Greenfoot.mouseClicked(null)) {
                Actor clicked = Greenfoot.getMouseInfo().getActor();
                if (clicked instanceof Hit) {
                    //Deck.deal(new BlackjackHand[]{player}, 1, true);
                    player.add(gameDeck.deal(true));
                    if (player.getWeight() >= 21) { 
                        playerTurn = false;
                    }
                } else if (clicked instanceof Stand) {
                    playerTurn = false;
                    dealerTurn();
                }
            }
        } else {
            
            while (dealer.getWeight() < 17) {
                dealer.add(gameDeck.deal(true));
            }
            // Once the dealers hand reaches 17 it ends their end the turn
            playerTurn = false;
        }
    }
    
    private void dealerTurn() {
        while (dealer.getWeight() < 17) {
            dealer.add(gameDeck.deal(true));
        }
        //  end the turn
        playerTurn = false;
    }
    }
       

    
     
