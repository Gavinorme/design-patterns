package strategy;
/**
 * Receiving routes
 * @author Gavin Orme
 */
import java.util.Random;

public class ReceiveBehavior implements offenseBehavior
{
    /**
     * Creates a string to run a random pass play from the array list
     * @return returns a random pass play using the string array
     */
    public String play()
    {
        return("runs a " + arr[select]);
    }

    String [] arr = {"slant route", "out route", "seam route", "screen pass", "hail mary"};
    Random rand = new Random();
    int select = rand.nextInt(arr.length);
}
