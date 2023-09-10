package observer;
/**
 * Current Hole Stats
 * @author Gavin Orme
 */
public class HoleScoreDisplay implements Observer
{
    private Subject golfer;
    private int strokes;
    private int par;
    /**
     * Creates the golfer with its name
     * @param golfer registers the golfer with its name
     */
    public HoleScoreDisplay(Subject golfer)
    {
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    @Override
    /**
     * Creates a number for the amount of strokes and the par value
     * @param strokes The amount of strokes the golfer hit
     * @param par The par on that hole
     */
    public void update(int strokes, int par)
    {
        this.strokes = strokes;
        this.par = par;
    }
/**
 * Creates a string representation of par and strokes
 * @return A string representation of the golfer's current hole stats
 */
    public String toString()
    {
        if(par == strokes)
        {
            return("Current Hole Stats: Par(" + par + ")" + " Strokes(" + strokes + ")" + ", making par");
        }
        else if(par > strokes)
        {
            return("Current Hole Stats: Par(" + par + ")" + " Strokes(" + strokes + ")" + " " +(par -= strokes) + ", under par");
        }
        else 
        {
            return("Current Hole Stats: Par(" + par + ")" + " Strokes(" + strokes + ")" + " " + (strokes -= par) + ", over par");
        }
    }
}