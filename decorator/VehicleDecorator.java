package decorator;
import java.util.ArrayList;
/**
 * Decor
 * @author Gavin Orme
 */
public abstract class VehicleDecorator extends Vehicle
{
    protected ArrayList<String> decoratorLines;
    protected Vehicle vehicle;

    public VehicleDecorator(ArrayList<String> decoratorLines)
    {
        //this.decoratorLines = decoratorLines;
        integrateDecor(decoratorLines);
    }

    protected void integrateDecor(ArrayList<String> decor)
    {
       vehicle.vehicleLines.addAll(decoratorLines);
    }
}
