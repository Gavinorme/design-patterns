package observer;
/**
 * Round Stats
 * @author Gavin Orme
 */
public class RoundScoreDisplay implements Observer
{
    private Subject golfer;
    private int strokesTotal;
    private int parTotal;

    public RoundScoreDisplay(Subject golfer)
    {
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    public void update(int strokes, int par)
    {
        this.strokesTotal += strokes;
        this.parTotal += par;
    }

    /**
     * Creates a string representation of the total round strokes and par so that the golfer can see if he is over or under par
     * @return A string represntation of the par total and strokes total and compares them
     */
    public String toString()
    {
        if(parTotal == strokesTotal)
        {
            return("Overall Stats: Par(" + parTotal + ")" + " Strokes(" + strokesTotal + ")" + ", making par");
        }
        else if(parTotal > strokesTotal)
        {
            
            return("Overall Stats: Par(" + parTotal + ")" + " Strokes(" + strokesTotal + ")" + " " +(parTotal -= strokesTotal) + ", under par");
        }
        else
        {
            return("Overall Stats: Par(" + parTotal + ")" + " Strokes(" + strokesTotal + ")" + " " + (strokesTotal -= parTotal) + ", over par");
        }
    }
}