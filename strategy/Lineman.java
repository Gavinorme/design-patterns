package strategy;
/**
 * Linemen
 * @author Gavin Orme
 */
import java.util.Random;

public class Lineman extends Player
{
    /**
     * Creates a lineman player name and whether they are on offense or not
     * @param firstName grabs the first name of the seahawks linemen player
     * @param lastName grabs the last name of the seahawks linemen player
     * @param offense determines if the seahawks O-line players are on the field or not
     */
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
