package decorator;

import java.util.ArrayList;
/**
 * Vehicle
 * @author Gavin Orme
 */
public abstract class Vehicle 
{
    protected ArrayList<String> vehicleLines;
    private String vehicleString = "";

    /**
     * This creates an array list for the vehicle lines printed out
     * @param lines These are all the lines that the file reads
     */
    public Vehicle(ArrayList<String> lines) 
    {
        this.vehicleLines = lines;
    }
    
     /**
     * This prints out the car vertically from line 0-9
     * @return returns a line if theres no whitespace and breaks after the entire line
     */
    public String toString()
    {
        for(String line : vehicleLines)
        {
            vehicleString += line;
            vehicleString += "\n";
        }
        return vehicleString;
    }
}
