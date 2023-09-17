package decorator;
/**
 * Painting Car
 * @author Gavin Orme
 */

public class Paint extends VehicleDecorator
{
    public Paint(Vehicle vehicle, String color)
    {
        super(color, vehicle);
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
        return color();
    }
    //before printing car print it red than print it black to reset
    //red at beginning of arraylist and black at the end
}
