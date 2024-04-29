import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartButton extends Button
{
    public static boolean gameStart = false;

    public StartButton(){
        setImage("StartButton.png");
        gameStart = false;
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/2, image.getHeight()/2);
    }

     /**
     * Act - do whatever the DirectionsButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new BlackjackWorld());
            
        }
    }
    
}