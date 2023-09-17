package decorator;
/**
 * Smiley Face
 * @author Gavin Orme
 */
public class Smile extends VehicleDecorator
{
    public Smile(Vehicle vehicle)
    {
        super(FileReader.getLines("decorator/txt/Smile.txt"));
        // lines.get(5);
        // lines.get(6);
    }
}