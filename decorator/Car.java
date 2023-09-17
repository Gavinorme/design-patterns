package decorator;
/**
 * Car
 * @author Gavin Orme
 */

public class Car extends Vehicle 
{
    public Car()
    {
    super(FileReader.getLines("decorator/txt/car.txt"));
    }
}
