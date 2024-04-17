import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class BlackJackGame extends World {
    private Player player;
    private Dealer dealer;

    public BlackJackGame() {
        super(1100, 800, 1);
        player = new Player(); 
        dealer = new Dealer();
        addObject(player, 300, 200);
        addObject(dealer, 300, 350); 
    }

    public void act() {
        checkEndGameConditions();
    }

    private void checkEndGameConditions() {
        // Check if player busts
        if (playerBusts()) {
            Greenfoot.setWorld(new EndScreen("You busted with a score of " + player.getScore(), false));
        }
        // Check if player wins
        else if (playerWins()) { 
            Greenfoot.setWorld(new EndScreen("Congratulations! You win with a score of " + player.getScore(), false));
        } 
        // Check if player loses
        else if (playerLoses()) {
            Greenfoot.setWorld(new EndScreen("You lost with a score of " + player.getScore() + ", dealer had " + dealer.getHandValue(), true));
        }
    }

    private boolean playerBusts() {
        return player.getHandValue() > 21;
    }

    private boolean playerWins() {
        return player.getHandValue() > dealer.getHandValue() && dealer.getHandValue() <= 21;
    }

    private boolean playerLoses() {
        return player.getHandValue() < dealer.getHandValue() && dealer.getHandValue() <= 21;
    }
}
