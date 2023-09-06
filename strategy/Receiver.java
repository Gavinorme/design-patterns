package strategy;
/**
 * Receiving
 * @author Gavin Orme
 */
public class Receiver extends Player
{
    /**
     * Creates a receiver's name and whether they are on the field or not
     * @param firstName grabs the first name of the seahawks receivers
     * @param lastName grabs the last name of the seahawks receivers
     * @param offense determines if the seahawks receivers are on the field or not
     */
    public Receiver(String firstName, String lastName, boolean offense)
    {
        super(firstName, lastName, offense);
        setOffenseBehavior();
        setDefenseBehavior();
    }
    public void setOffenseBehavior()
    {
        OffenseBehavior = new ReceiveBehavior();
    }
    public void setDefenseBehavior()
    {
        DefenseBehavior = null;
    }
}
