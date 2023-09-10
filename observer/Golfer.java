package observer;
/**
 * Golfer
 * @author Gavin Orme
 */
import java.util.ArrayList;

public class Golfer implements Subject
{
    private String name;
    ArrayList<Observer> observers;

        /**
         * Creates a new golfer with its name
         * @param name The name of the golfer
         */
        public Golfer(String name)
        {
            observers = new ArrayList<Observer>();
            this.name = name;
        }

        @Override
        /**
         * Adds the observer from the array list 
         * @param observer Put into the array list
         */
        public void registerObserver(Observer observer)
        {
            observers.add(observer);
        }

        @Override
        public void removeObserver(Observer observer)
        {
            observers.remove(observer);
        }
        
        @Override
        /**
         * Updates the stats for strokes and par values
         * @param strokes Updates the value for strokes
         * @param par Updates the value for par
         */
        public void notifyObservers(int strokes, int par)
        {
            for(Observer observer : observers)
            {
                observer.update(strokes, par);
            }
        }
        
        public void enterScore(int strokes, int par)
        {
            for(Observer observer : observers)
            {
                observer.update(strokes, par);
            }
        }
        /**
         * Creates a string representation of the golfer's name
         * @return The golfer's name 
         */
        public String getName()
        {
            return name;
        }
}