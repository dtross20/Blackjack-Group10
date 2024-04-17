import greenfoot.*;  // (World, Actor, GreenfootImage, Color, Font)

public class EndScreen extends World {
    private GreenfootImage bg;

    public EndScreen(String message, boolean slimed) {
        super(600, 400, 1); 
        prepare(message, slimed);
        showOptions();
    }

    private void prepare(String message, boolean slimed) {
        if (slimed) {
            bg = new GreenfootImage("GetSlimed.png");
        } else {
            bg = new GreenfootImage("GameOver.jpg");
        }
        bg.scale(getWidth(), getHeight());
        setBackground(bg);

        GreenfootImage text = new GreenfootImage(message, 24, Color.WHITE, new Color(0, 0, 0, 0));
        bg.drawImage(text, (getWidth() - text.getWidth()) / 2, (getHeight() - text.getHeight()) / 2);
    }

    private void showOptions() {
        Button playAgain = new Button("Play Again");
        Button exit = new Button("Exit");
        addObject(playAgain, getWidth() / 2 - 100, getHeight() / 2 + 50);
        addObject(exit, getWidth() / 2 + 100, getHeight() / 2 + 50);
    }
    
    public void act() {
        if (Greenfoot.mouseClicked(findObject(Button.class, "Play Again"))) {
            Greenfoot.setWorld(new BlackJackGame());
        } else if (Greenfoot.mouseClicked(findObject(Button.class, "Exit"))) {
            Greenfoot.stop();
        }
    }
}

