import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hit extends Button
{
    public boolean isPressed;
    
    
    public boolean isPressed(){
        
        boolean isPressed = this.isPressed;
        this.isPressed = false;
        return isPressed;
    
    }
    
    
    public void act()
    {if(Greenfoot.mouseClicked(this)){
        
        isPressed = true;
        
    }
    
    
  
}
}
