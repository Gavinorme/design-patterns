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
        super(vehicle.vehicleLines);
        decoratorLines = FileReader.getLines("decorator/txt/Smile.txt");
        integrateDecor(decoratorLines);
    }
        
    public String toString()
    {
        return super.toString();
    }
}