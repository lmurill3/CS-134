import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Player extends MovableObject
{
    int bulletCooldown;
    
    public Player()
    {
     speed = 5;
     bulletCooldown = 0;
    }
    
    public void act() 
    {
        int x = getX();
        int y = getY();
        
        if ( Greenfoot.isKeyDown( "left" ) )
        {
            x -= speed;
        }
        else if ( Greenfoot.isKeyDown( "right" ) )
        {
            x += speed;
        }
        
        if (Greenfoot.isKeyDown( "space" ) && bulletCooldown == 0 )
        {
            SpaceWorld world = (SpaceWorld)getWorld();
            world.addBullet( x, y );
            bulletCooldown = 50;
        }
        
        if ( bulletCooldown > 0 )
        {
            bulletCooldown--;
        }
        
        setLocation( x, y );
    }    
}
