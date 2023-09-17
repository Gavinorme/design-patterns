package decorator;
import java.util.ArrayList;

public abstract class VehicleDecorator 
{
    protected ArrayList<String> lines;
    private String vehicleString = "";

    public VehicleDecorator(ArrayList<String> lines)
    {
        for(String line : lines)
        {
            vehicleString += line;
            vehicleString += "\n";
        }
    }

    protected void integrateDecor(ArrayList<String> decor)
    {
       getColor();
    }
    
}
