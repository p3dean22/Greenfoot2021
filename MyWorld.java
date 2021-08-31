import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Simple world
 * 
 * @author Stevie
 * @version 8/24/2021
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private int counter;
    private FlowerEater fE = new FlowerEater();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        counter = 0;
        this.addObject(fE, 100, 100);
        
    }
    
    public void act(){
        counter++;
        if(counter%100 == 0){
            this.addObject(new Flower(), (int) (Math.random()*600), (int) (Math.random()*400));
        }
        this.showText("Score: " + fE.getScore(), 50, 20);
    }
}
