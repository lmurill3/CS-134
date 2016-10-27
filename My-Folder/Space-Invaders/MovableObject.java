import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MovableObject extends Actor
{
    protected int speed;
    
    public void act() 
    {
        // Add your action code here.
    }  
    
    void moveLeft()
    {
        setLocation( getX() - speed, getY() );
    }
    
    void moveRight()
    {
        setLocation( getX() + speed, getY() );
    }
    
    void moveUp()
    {
        setLocation( getX(), getY() - speed );
    }
    
    void moveDown()
    {
        setLocation( getX(), getY() + speed );
    }
}
