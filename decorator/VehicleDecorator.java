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

    public VehicleDecorator(ArrayList<String> decoratorLines, Vehicle vehicle)
    {
        this.decoratorLines = decoratorLines;
        this.vehicle = vehicle;
        //integrateDecor(decoratorLines);
    }

    abstract protected void integrateDecor(ArrayList<String> decor);
    // {
    //    vehicle.vehicleLines.addAll(decoratorLines);
    // }
}
