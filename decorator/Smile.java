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
        integrateDecor(FileReader.getLines("decorator/txt/Smile.txt"));
    }
        
    public String toString()
    {
        return super.toString();
    }
}