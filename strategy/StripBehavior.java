package strategy;
/**
 * A football coach
 * @author Gavin Orme
 */
public class StripBehavior implements defenseBehavior
{
    /**
     * Creates a string for the defense stripping the ball
     * @return returns when the defense strips the ball
     */
    public String play()
    {
        return("Strips the ball from the runner's hands");
    }    
}
