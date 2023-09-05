package strategy;

import java.util.Random;

public class RunBehavior implements offenseBehavior 
{
    public String play()
    {
        return("runs a " + arr[select]);
    }   

    String [] arr = {"drive(up the gut)", "draw", "pitch", "reverse"};
    Random rand = new Random();
    int select = rand.nextInt(arr.length);
}
