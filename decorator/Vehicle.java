package decorator;

import java.util.ArrayList;

public abstract class Vehicle 
{
    protected ArrayList<String> lines;
    private String arrayList;

    public Vehicle(ArrayList<String> lines) {
        this.lines = lines;
    }
    
    public String toString()
    {
            for(String i : lines)
            {
                if(lines != null)
                {
                System.out.println(arrayList = i.toString()); 
                }
                arrayList= i.toString();
            }
            return arrayList;
    }
    
}
