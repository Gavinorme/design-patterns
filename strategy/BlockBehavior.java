package strategy;
/**
 * Blocking
 * @author Gavin Orme
 */
import java.util.Random;
/**
 * returns a random play from the String array to get the blocking play
 * @return returns the array using int select
 */
public class BlockBehavior implements defenseBehavior
{
    public String play()
    {
        return "Block a " + blocks+rand.nextInt(blocks.length);
    }

    
    Random rand = new Random();
    private String[] blocks = {"kick", "punt", "pass", "catch"};


}

