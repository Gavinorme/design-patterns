package strategy;

import java.util.Random;

public class PassBehavior implements offenseBehavior
{
    public String play()
    {
        return("throws a " + arr[select]);
    }

    String [] arr = {"slant route", "out route", "seam route", "screen pass", "hail mary"};
    Random rand = new Random();
    int select = rand.nextInt(arr.length);

}
