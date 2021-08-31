import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FlowerEater here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlowerEater extends Actor
{
    private int score;
    private int speed;
    /**
     * Act - do whatever the FlowerEater wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public FlowerEater()
    {
        this.score = 0;
        this.speed = 4;
    }
    
    public void act()
    {
        this.makeMeMove();
        if(this.isTouching(Flower.class))
        {
            this.removeTouching(Flower.class);
            this.score++;
            
        }
    }
    
    public void makeMeMove(){
        if(Greenfoot.isKeyDown("up"))
        {
            this.setRotation(270);
            this.move(this.speed);
            if(this.getY() == 0){
                    this.setLocation(this.getX(), this.getWorld().getHeight());
            }
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            this.setRotation(90);
            this.move(this.speed);
            if(this.getY() == this.getWorld().getHeight()-1){
                    this.setLocation(this.getX(), 0);
            }
        }
        else if(Greenfoot.isKeyDown("left"))
        {
            this.setRotation(180);
            this.move(this.speed);
            if(this.getX() == 0){
                this.setLocation(this.getWorld().getWidth(), this.getY());
            }
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            this.setRotation(0);
            this.move(this.speed);
            if(this.getX() == this.getWorld().getWidth()-1){
                this.setLocation(0, this.getY());
            }
        }
    }
    
    public int getScore(){
        return this.score;
    }
}
