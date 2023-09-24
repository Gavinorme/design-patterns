package factory;
/**
 * Tricycle
 * @author Gavin Orme
 */

public class Tricycle extends Bike
{
    public Tricycle()
    {
        name = "tricycle";
        price = 50.0;
        numWheels = 3;
        hasPedals = true;
        hasTrainingWheels = false;
    }    
}