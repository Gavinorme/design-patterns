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
        super(FileReader.getLines("decorator/txt/Rims.txt"), vehicle.vehicleLines);
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
        
    public String toString()
    {
        //integrateDecor(decoratorLines);
        return super.toString();
    }
}
