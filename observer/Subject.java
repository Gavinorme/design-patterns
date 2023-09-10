package observer;
/**
 * Adding and removing stats
 * @author Gavin Orme
 */
public interface Subject
{
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(int strokes, int par);
    
}