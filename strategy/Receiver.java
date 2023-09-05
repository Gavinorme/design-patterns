package strategy;

public class Receiver extends Player
{
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
