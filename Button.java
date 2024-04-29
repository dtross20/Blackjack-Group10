import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private boolean isPressed;
    
    public Button(){
        isPressed = false;
    }
    
    public boolean isPressed()
    {
        return isPressed;
    }
    
    public void reset() 
    {
        isPressed = false;
    }
    
    public void BackPressed()
    {
        isPressed = false;
        
    }
    
    
    /**
     * Act - do whatever the Hit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(this)){
            isPressed = true;
        }
    }
}
