package factory;

public class BikeStore 
{
    Bike bike;
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