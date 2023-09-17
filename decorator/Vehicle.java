package decorator;

import java.util.ArrayList;

public abstract class Vehicle 
{
    protected ArrayList<String> lines;
    private String vehicleString;

    public Vehicle(ArrayList<String> lines) {
        this.lines = lines;
    }
    
    public String toString()
    {
            for(String line : lines)
            {
                
                    vehicleString += line;
                    vehicleString += "\n";
                
            }
            return vehicleString;
    }
    
}
