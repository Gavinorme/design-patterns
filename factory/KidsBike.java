package factory;
/**
 * Kids Bike
 * @author Gavin Orme
 */
public class KidsBike extends Bike
{
    public KidsBike()
    {
        name = "Kids Bike";
        price = 40.0;
        numWheels = 4;
        hasPedals = true;
        hasTrainingWheels = true;
    }    
}