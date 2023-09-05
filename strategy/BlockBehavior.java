package strategy;

import java.util.Random;

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

