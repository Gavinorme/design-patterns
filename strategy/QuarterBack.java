package strategy;

import java.util.Random;

public class QuarterBack extends Player
{
    public QuarterBack(String firstName, String lastName, boolean offense)
    {
        super(firstName, lastName, offense);
        setOffenseBehavior();
        setDefenseBehavior();
       
    }
    
    public void setOffenseBehavior()
    {
        Random rand = new Random();
        int db = rand.nextInt(1);
        if(db==0)
        {
            OffenseBehavior = new RunBehavior();
        }
        else if(db==1)
        {
            OffenseBehavior = new PassBehavior();
        }
    }
    public void setDefenseBehavior()
    {
        DefenseBehavior = null; 
    }


}
