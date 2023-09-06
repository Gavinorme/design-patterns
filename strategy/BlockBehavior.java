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
        return("Block a " + arr[select]);
    }

    String [] arr = {"kick", "punt", "pass", "catch"};
    Random rand = new Random();
    int select = rand.nextInt(arr.length);

}

