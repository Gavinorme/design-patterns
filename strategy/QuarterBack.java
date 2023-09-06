package strategy;
/**
 * Quarterback
 * @author Gavin Orme
 */
import java.util.Random;

public class QuarterBack extends Player
{
    /**
     * Creates the quarterback name and whether they are playing or not
     * @param firstName grabs the first name of the seahawks quarterback
     * @param lastName grabs the last name of the seahawks quarterback
     * @param offense determines if the seahawks quarterback is on the field or not
     */
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
