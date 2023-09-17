package decorator;

public class Paint extends VehicleDecorator{
    
    
    public Paint(Vehicle vehicle, String color)
    {
        super(FileReader.getLines("decorator/txt/Smile.txt"));
    }

    //before printing car print it red than print it black to reset
    //red at beginning of arraylist and black at the end
}
