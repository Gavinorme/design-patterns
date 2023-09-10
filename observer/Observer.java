package observer;
/**
 * Updates stats
 * @author Gavin Orme
 */
public interface Observer 
{
    public void update(int strokes, int par);
    public String toString();
}
