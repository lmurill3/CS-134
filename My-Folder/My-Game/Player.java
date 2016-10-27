import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        checkCollision();
        
        if ( Greenfoot.isKeyDown( "left" ) )
        {
            turn( -5 );
        }
        
        else if ( Greenfoot.isKeyDown( "right") )
        {
            turn( 5 );
        }
        
        if ( Greenfoot.isKeyDown( "up" ) )
        {
            move( 10 );
        } 
        
        if ( Greenfoot.isKeyDown( "down" ) )
        {
            move( -10 );
        }
    }
       
    private void checkCollision()
        {
            if (isTouching(Enemy.class))
            {
                removeTouching(Enemy.class);
                GameWorld gameworld = (GameWorld)getWorld();
                gameworld.addScore(-10);
                Greenfoot.playSound("Explosion.wav");
            }
            
            if (isTouching(Energy.class))
            {
                removeTouching(Energy.class);
                GameWorld gameworld = (GameWorld)getWorld();
                gameworld.addEnergy(1);
                Greenfoot.playSound("EnergyGun.wav");
            }
        }
    }    
