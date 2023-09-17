package decorator;
import java.util.ArrayList;

public abstract class VehicleDecorator 
{
    protected ArrayList<String> lines;
    private String arrayList;

    public VehicleDecorator(ArrayList<String> lines)
    {
        for(String i : lines)
            {
                if(lines != null)
                {
                System.out.println(arrayList = i.toString()); 
                }
                arrayList= i.toString();
            }
    }

    protected void integrateDecor(ArrayList<String> decor)
    {
       getColor();
    }
    private String getColor()
    {
        final String black = "\u001B[0m";
        final String red = "\u001B[31m";
        final String green = "\u001B[32m";
        final String yellow = "\u001B[33m";
        final String blue = "\u001B[34m";
        final String purple = "/u001B[35m";
        final String cyan = "\u001B[36m";
        return getColor();
    }
}
