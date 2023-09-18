package decorator;
import java.util.ArrayList;
/**
 * Rims for Car
 * @author Gavin Orme
 */
public class Rims extends VehicleDecorator 
{
    /**
     * This reads the smile.txt and adds the rims to the car
     * @param vehicle This is the car that is printed out
     */
    public Rims(Vehicle vehicle)
    {
        super(vehicle.vehicleLines);
        integrateDecor(FileReader.getLines("decorator/txt/Rims.txt"));
    }
}
