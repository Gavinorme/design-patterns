package decorator;

import java.util.Map;

/**
 * Painting Car
 * @author Gavin Orme
 */

public class Paint extends VehicleDecorator
{
    private String colorCode;
    private Map<String, String> colorMap = Map.of(
        "black", "\u001B[0m",
        "red", "\u001B[31m",
        "green", "\u001B[32m",
        "yellow", "\u001B[33m",
        "blue","\u001B[34m",
        "purple", "\u001B[35m",
            "cyan", "\u001B[36m");
    /**
     * Grabs color from the color map and changes the color of the car
     * @param vehicle This is the car printed out
     * @param color This changes the color of the car
     */
    public Paint(Vehicle vehicle, String color)
    {
        super(vehicle.vehicleLines);
        colorCode = colorMap.get(color);
        System.out.println(colorCode);
    }
}

//Map- maps out one value to another
//mapping string black to color code
//each entry in map has key and value (black, color code)