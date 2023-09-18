package decorator;

import java.util.ArrayList;

/**
 * Smiley Face
 * @author Gavin Orme
 */
public class Smile extends VehicleDecorator
{
    /**
     * This reads the smile.txt and adds the smile to the car
     * @param vehicle This is the car that is printed out
     */
    public Smile(Vehicle vehicle)
    {
        super(vehicle.vehicleLines);
        integrateDecor(FileReader.getLines("decorator/txt/Smile.txt"));
    }
}