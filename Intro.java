import greenfoot.*;
import java.io.IOException;
import greenfoot.World;

public class Intro extends World
{
    private static final String AUDIO_FILE = "Nick.mp3";
    private static final String GREENFOOT_PROGRAM = "BlackjackWorld"; //class name for your main world
    private GreenfootSound sound;

    public Intro()
    {
        super(1100, 800, 1); 
        sound = new GreenfootSound(AUDIO_FILE);
        sound.play();
        addObject(new StartButton(),596,568);
    }

    public void act() {
        if (!sound.isPlaying()) {
            World myWorld = new BlackjackWorld(); 
            Greenfoot.setWorld(myWorld); // Set MyWorld as the new world
        }
    }
}