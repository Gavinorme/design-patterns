package decorator;
import java.util.ArrayList;
/**
 * Decor
 * @author Gavin Orme
 */
public abstract class VehicleDecorator extends Vehicle
{
    protected ArrayList<String> decoratorLines;

    // public VehicleDecorator(ArrayList<String> decoratorLines, ArrayList<String> vehicleLines)
    // {
    //     super(vehicleLines);
    //     this.decoratorLines = decoratorLines;
    //     integrateDecor(decoratorLines);
    // }
    public VehicleDecorator(ArrayList<String> vehicleLines)
    {
        super(vehicleLines);
        // this.decoratorLines = decoratorLines;
        integrateDecor(decoratorLines);
    }
    abstract protected void integrateDecor(ArrayList<String> decor);

}
