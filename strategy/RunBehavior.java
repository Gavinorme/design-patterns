package strategy;
/**
 * Running
 * @author Gavin Orme
 */
import java.util.Random;

public class RunBehavior implements offenseBehavior 
{
    /**
     * Creates a string that runs a random run play from the array
     * @return returns a run play at random using the variable select
     */
    public String play()
    {
        return("runs a " + arr[select]);
    }   

    String [] arr = {"drive(up the gut)", "draw", "pitch", "reverse"};
    Random rand = new Random();
    int select = rand.nextInt(arr.length);
}
