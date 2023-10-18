import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {    
        super(700, 350, 1); 
        addObject(new Flappybird(), 100, 300);
        addObject(new Pipe(), 300, 150);
        addObject(new Pipe(), 600, 150);
        addObject(new Score(), 300, 100);
        addObject(new Helicopter(), 200, 200); 
    }
}
