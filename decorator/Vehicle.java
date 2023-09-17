package decorator;

import java.util.ArrayList;

public abstract class Vehicle 
{
    protected ArrayList<String> vehicleLines;
    private String vehicleString = "";

    public Vehicle(ArrayList<String> lines) {
        this.vehicleLines = lines;
    }
    
    public String toString()
    {
        for(String line : vehicleLines)
        {
            vehicleString += line;
            vehicleString += "\n";
        }
        return vehicleString;
    }
    public Vehicle()
    {
        
    }
    
}
