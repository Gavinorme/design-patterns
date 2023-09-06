package strategy;
/**
 * A football coach
 * @author Gavin Orme
 */
public class SackBehavior implements defenseBehavior
{
    /**
     * Creates a string for the defense to sack the quarterback
     * @return returns when the defense sacks the quarterback
     */
    public String play()
    {
        return("Sack the Quarterback");
    }    
}
