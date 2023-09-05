package strategy;

import java.util.Random;

public class Lineman extends Player
{
    public Lineman(String firstName, String lastName, boolean offense)
    {
        super(firstName, lastName, offense);
        setOffenseBehavior();
        setDefenseBehavior();
    }

    public void setOffenseBehavior()
    {
        OffenseBehavior = new OBlockBehavior();
    }
    public void setDefenseBehavior()
    {
        Random rand = new Random();
        int db = rand.nextInt(2);
        if(db==0)
        {
            DefenseBehavior = new BlockBehavior();
        }
        else if(db==1)
        {
            DefenseBehavior = new StripBehavior();
        }
        else if(db==2)
        {
            DefenseBehavior = new SackBehavior();
        }
    }

    
    
}
