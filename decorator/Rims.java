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
        decoratorLines = FileReader.getLines("decorator/txt/Rims.txt");
        integrateDecor(decoratorLines);
    }
    
    public String toString()
    {
        return super.toString();
    }
}
