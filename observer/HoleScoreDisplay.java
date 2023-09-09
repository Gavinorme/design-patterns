package observer;

public class HoleScoreDisplay implements Observer
{
    private Subject golfer;
    private int strokes;
    private int par;
    /**
     * 
     * @param golfer
     */
    public HoleScoreDisplay(Subject golfer)
    {
        this.golfer = golfer;
        golfer.registerObserver(this);
    }

    @Override
    /**
     * 
     * @param strokes
     * @param par
     */
    public void update(int strokes, int par)
    {
        this.strokes = strokes;
        this.par = par;
    }
/**
 * 
 * @return
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