import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int speed;
    
    public Enemy()
    {
        speed = Greenfoot.getRandomNumber(5) + 1;
    }
    
    public void act() 
    {
        setLocation(getX()-speed, getY());
        turn(1);
        
        if (getX() == 0) 
        {
            GameWorld gameworld = (GameWorld)getWorld();
            gameworld.removeObject(this);
        }// Add your action code here.
    }    
}
