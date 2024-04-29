import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stand here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stand extends Button
{
    private boolean isPressed;
    
    public void pressed(){
        isPressed = !isPressed;
    }
      
    public boolean is_pressed(){
        return isPressed;
    }
    
    public void act(){
        if(Greenfoot.mouseClicked(this)){
            pressed();
        }
    }
}
   
