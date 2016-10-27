import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenfootLab01World here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenfootLab01World extends World
{

    /**
     * Constructor for objects of class GreenfootLab01World.
     * 
     */
    public GreenfootLab01World()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Butterfly(),40,80);
        addObject(new Butterfly(),440,100);
        addObject(new Sunflower(),275,300);
        addObject(new Sunflower(),460,250);
         addObject(new Sunflower(),160,100);
        addObject(new Sunflower(),20,350);
    }
}
