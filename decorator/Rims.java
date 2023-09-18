package decorator;
import java.util.ArrayList;
/**
 * Rims for Car
 * @author Gavin Orme
 */
public class Rims extends VehicleDecorator 
{
    /**
     * 
     * @param vehicle
     */
    public Rims(Vehicle vehicle)
    {
        super(vehicle.vehicleLines);
        integrateDecor(FileReader.getLines("decorator/txt/Rims.txt"));
    }
    
    public String toString()
    {
        return super.toString();
    }
}
