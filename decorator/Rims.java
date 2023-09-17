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
        super(FileReader.getLines("decorator/txt/Rims.txt"), vehicle);
        //this.vehicle = vehicle;
    }
    protected void integrateDecor(ArrayList<String> decor)
    {
       vehicle.vehicleLines.addAll(decor);
    }
    public String toString()
    {
        integrateDecor(decoratorLines);
        return vehicle.toString();
    }
}
