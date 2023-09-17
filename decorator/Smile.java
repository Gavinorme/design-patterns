package decorator;

import java.util.ArrayList;

/**
 * Smiley Face
 * @author Gavin Orme
 */
public class Smile extends VehicleDecorator
{
    public Smile(Vehicle vehicle)
    {
        super(FileReader.getLines("decorator/txt/Smile.txt"), vehicle);
    }
    // protected void integrateDecor(ArrayList<String> decor)
    // {
    //    vehicle.vehicleLines.addAll(decor);
    // }
    // public String toString()
    // {
    //     integrateDecor(decoratorLines);
    //     return vehicle.toString();
    // }
}