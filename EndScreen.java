import greenfoot.*;  // (World, Actor, GreenfootImage, Color, Font)

public class EndScreen extends World {
    private GreenfootImage bg;

    public EndScreen( boolean slimed) {
        super(1100, 800, 1); 
        prepare( slimed);
        showOptions();
    }

    private void prepare(boolean slimed) {
        
        if (slimed) {
            bg = new GreenfootImage("GetSlimed.png");
        } else {
            bg = new GreenfootImage("GameOver.jpg");
        }
    }

    private void showOptions() {
        //Button playAgain = new Button("Play Again");
        //Button exit = new Button("Exit");
        //addObject(playAgain, getWidth() / 2 - 100, getHeight() / 2 + 50);
        //addObject(exit, getWidth() / 2 + 100, getHeight() / 2 + 50);
    }
    
    public void act() {
        //if (Greenfoot.mouseClicked(findObject(Button.class, "Play Again"))) {
            //Greenfoot.setWorld(new BlackJackGame());
        } //else if (Greenfoot.mouseClicked(findObject(Button.class, "Exit"))) {
            //Greenfoot.stop();
        }
    //}
//}

