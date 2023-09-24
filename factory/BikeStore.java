package factory;
/**
 * Different Bikes
 * @author Gavin Orme
 */

public class BikeStore 
{
    Bike bike;
    /**
     * Creates a string representation of the different types of bikes
     * @param type The type of the three bikes
     * @return Returns the bike that is called
     */
    public Bike createBike(String type)
    {
        if(type.equalsIgnoreCase("Tricycle"))
        {
            bike = new Tricycle();
        }
        else if(type.equalsIgnoreCase("Kids Bike"))
        {
            bike = new KidsBike();
        }
        else if(type.equalsIgnoreCase("Strider"))
        {
            bike = new Strider();
        }
        return bike;
    }
}