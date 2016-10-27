import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    String text;
    
    public Button()
    {
        text = "Default";
    }
    
    public Button(String label)
    {
        text = label;
    }
    
    public void act() 
    {
        getWorld().showText( text, getX(), getY() );     
        
        if ( Greenfoot.mouseClicked( this ) )
        {
            if ( text.equals( "Help" ) )
            {
                MenuWorld world = (MenuWorld)getWorld();
                world.gotoHelp();
            }
            else if ( text.equals( "Play" ) )
            {
                MenuWorld world = (MenuWorld)getWorld();
                world.gotoGame();                
            }
            else if ( text.equals( "Go Back" ) )
            {
                HelpWorld world = (HelpWorld)getWorld();
                world.gotoMenu();
            }
            else if ( text.equals( "Back to menu" ) )
            {
                GameWorld world = (GameWorld)getWorld();
                world.gotoMenu();
            }
        }// Add your action code here.
    }    
}
