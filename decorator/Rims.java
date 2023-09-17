package decorator;
import java.util.ArrayList;
/**
 * Rims for Car
 * @author Gavin Orme
 */
public class Rims extends VehicleDecorator 
{
   
    public Rims(Vehicle vehicle)
    {
        super(FileReader.getLines("decorator/txt/Rims.txt"));
        this.vehicle = vehicle;
    }
    protected void integrateDecor(ArrayList<String> decor)
    {
       vehicle.vehicleLines.addAll(decoratorLines);
    }
}
