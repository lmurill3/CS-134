import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameWorld extends World
{
    private int score;
    private int energy;
   
    
    /**
     * Constructor for objects of class GameWorld.
     * 
     */
    public GameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject( new Player(), 10, 200 );
        addObject( new Energy(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        score = 100;
        energy = 0;
        showScore();
        showEnergy();
        
    }
    
    public void act()
    {
           
        if (Greenfoot.getRandomNumber(300) < 3)
        {
            addObject(new Enemy(), 779, Greenfoot.getRandomNumber(360));
        }
        
        if ( energy == 1 )
        {
            addNewEnergy();
        }
        
        if (energy == 2 )
        {
            addNewEnergy();
        }
        
        if (energy == 3 )
        {
            addNewEnergy();
        }
        
        if (energy == 4 )
        {
            addNewEnergy();
        }
        
        if (energy == 5 )
        {
            addNewEnergy();
        }
        
        if (energy == 6 )
        {
            addNewEnergy();
        }
        
        if (energy == 7 )
        {
            addNewEnergy();
        }
        
        if (energy == 8 )
        {
            addNewEnergy();
        }
        
        if (energy == 9 )
        {
            addNewEnergy();
        }
        
        if (energy == 10 )
        {
            addNewEnergy();
        }
        
        if (energy == 11 )
        {
            addNewEnergy();
        }
        
        if (energy == 12 )
        {
            addNewEnergy();
        }
        
        if (energy == 13 )
        {
            addNewEnergy();
        }
        
        if (energy == 14 )
        {
            addNewEnergy();
        }
        
        if (energy == 15 )
        {
            addNewEnergy();
        }
        
        if (energy == 16 )
        {
            addNewEnergy();
        }
        
        if (energy == 17 )
        {
            addNewEnergy();
        }
        
        if (energy == 18 )
        {
            addNewEnergy();
        }
        
        if (energy == 19 )
        {
            addNewEnergy();
        }
        
        if (energy == 20 )
        {
            addNewEnergy();
        }
    }
    
    public void gotoMenu()
    {
        MenuWorld nextState = new MenuWorld();
        Greenfoot.setWorld( nextState );
    }
    
    private void showScore()
    {
        showText("Life: " + score, 80, 25);
    }
    
    public void addScore(int points)
    {
        score = score + points;
        showScore();
        if (score == 0)
        {
            Greenfoot.stop();
            showText( "Ship Completely Damaged YOU LOSE", 300, 250);
        }
    }
    
    private void showEnergy()
    {
        showText("Energy: " + energy, 400, 25);
    }
    
    public void addEnergy(int points)
    {
        energy = energy + points;
        showEnergy();
        if (energy == 20)
        {
            Greenfoot.stop();
            showText( "Energy Level: 100% YOU DID IT!", 300, 250);
        }
    }
    
    public void addNewEnergy()
    {
      if (Greenfoot.getRandomNumber(400) < 1)
        {
        addObject( new Energy(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
      }
     }
}
