import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Flower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flower extends Actor
{
    public Flower(){
        GreenfootImage flower = new GreenfootImage("pngegg.png");
        flower.scale(50,50);
        this.setImage(flower);
    }
    
    public void act()
    {
        turn(1);
    }
}
