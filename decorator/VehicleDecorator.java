package decorator;
import java.util.ArrayList;
/**
 * Decor
 * @author Gavin Orme
 */
public abstract class VehicleDecorator extends Vehicle
{
    public VehicleDecorator(ArrayList<String> vehicleLines)
    {
        super(vehicleLines);
    }

    protected void integrateDecor(ArrayList<String> decoratorLines) 
    {
        for(int i = 0; i < this.vehicleLines.size(); i++) 
        {
            String decoratorLine = decoratorLines.get(i);
            StringBuilder newVehicleLine = new StringBuilder(vehicleLines.get(i));
            boolean vehicleLineModified = false;

            for(int j = 0; j < decoratorLine.length(); j++) 
            {
                if(!Character.isWhitespace(decoratorLine.charAt(j))) {
                        newVehicleLine.setCharAt(j, decoratorLine.charAt(j));
                        vehicleLineModified = true;
                }
                if(vehicleLineModified) {
                    this.vehicleLines.set(i,newVehicleLine.toString());
                }
            }
        }
    }     
}
