package decorator;
import java.util.ArrayList;
/**
 * Decor
 * @author Gavin Orme
 */
public abstract class VehicleDecorator extends Vehicle
{
    /**
     * This creates an array list for the vehicle lines printed out
     * @param lines These are all the lines that the file reads and prints out to the console
     */
    public VehicleDecorator(ArrayList<String> vehicleLines)
    {
        super(vehicleLines);
    }
    /**
     * This creates an array list for the decorator lines which are the rims and smile so that it can be added to the car
     * @param decoratorLines These are the smile and rims lines
     */
    protected void integrateDecor(ArrayList<String> decoratorLines) 
    {
        for(int i = 0; i < this.vehicleLines.size(); i++) 
        {
            String decoratorLine = decoratorLines.get(i);
            StringBuilder newVehicleLine = new StringBuilder(vehicleLines.get(i));
            boolean vehicleLineModified = false;

            for(int j = 0; j < decoratorLine.length(); j++) 
            {
                if(!Character.isWhitespace(decoratorLine.charAt(j))) 
                {
                    newVehicleLine.setCharAt(j, decoratorLine.charAt(j));
                    vehicleLineModified = true;
                }
            }
            if(vehicleLineModified) 
            {
                this.vehicleLines.set(i,newVehicleLine.toString());
            }
        }
    }     
}

//Nested for loop
//outer for loop- iterates over vehicle lines
//line 18- on line 0 give me decorator line
//line 19- give me vehicle line
//line 22- iterating decorating line chars
//lines 24- if j isn't whitespace it is added to vehicle line (rims and smile adding)
//string builder you can modify

