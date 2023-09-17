package decorator;
import java.util.ArrayList;

public abstract class VehicleDecorator extends Vehicle
{
    protected ArrayList<String> decoratorLines;

    public VehicleDecorator(ArrayList<String> decoratorLines)
    {
        this.decoratorLines = decoratorLines;
    }

    protected void integrateDecor(ArrayList<String> decor)
    {
       vehicleLines.addAll(decoratorLines);
    }
    
}
