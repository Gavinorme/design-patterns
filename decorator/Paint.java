package decorator;

import java.util.ArrayList;

/**
 * Painting Car
 * @author Gavin Orme
 */

public class Paint extends VehicleDecorator
{
    public Paint(Vehicle vehicle, String color)
    {
        super(null,vehicle.vehicleLines);
    }

    private String colorMap;
    private String lines;
    private void colorVehicle(String color)
    {
        // if(colorMap.contains(color.toLowerCase()))
        // {
        //     final String colorCode = colorMap.get(color.toLowerCase());
        //     String firstLine = lines.get(0);
        //     lines.set(0, colorCode + firstLine);
        //     String lastLine = lines.get(lines.size()-1);
        //     lines.set(lines.size()-1,lastLine+TEXT_RESET);
        // }
    }

    private String color()
    {
        final String black = "\u001B[0m";
        final String red = "\u001B[31m";
        final String green = "\u001B[32m";
        final String yellow = "\u001B[33m";
        final String blue = "\u001B[34m";
        final String purple = "/u001B[35m";
        final String cyan = "\u001B[36m";
        final String RESET = "\033[0m";
        return color();
    }
    //before printing car print it red than print it black to reset
    //red at beginning of arraylist and black at the end

    @Override
    protected void integrateDecor(ArrayList<String> decor) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'integrateDecor'");
    }
}
