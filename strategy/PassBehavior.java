package strategy;
/**
 * Pass routes
 * @author Gavin Orme
 */
import java.util.Random;

public class PassBehavior implements offenseBehavior
{
    /**
     * Creates a string that determines the pass play at random
     * @return A string that returns a random pass play from the array list
     */
    public String play()
    {
        return("throws a " + arr[select]);
    }

    String [] arr = {"slant route", "out route", "seam route", "screen pass", "hail mary"};
    Random rand = new Random();
    int select = rand.nextInt(arr.length);

}
