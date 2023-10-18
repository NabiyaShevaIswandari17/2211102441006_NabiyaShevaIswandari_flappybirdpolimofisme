import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class helicopter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Helicopter extends Pipe
{
    public Helicopter(){
        GreenfootImage image = getImage();
        image.scale(70,50);
    }
    /**
     * Act - do whatever the Pipe wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX() + 1, getY()); // Move the plane to the right

        if (getX() >= getWorld().getWidth() - 1) {
            // Wrap around to the left edge with a random Y position
            setLocation(1, Greenfoot.getRandomNumber(getWorld().getHeight() - 100) + 50);
    }
    }

}

