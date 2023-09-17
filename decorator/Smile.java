package decorator;

public class Smile extends VehicleDecorator{
    public Smile(Vehicle vehicle)
    {
        super(FileReader.getLines("decorator/txt/Smile.txt"));
    }
    
}






//ArrayList<String> lines = FileReader.getLines();
        //"decorator/txt/car.txt"
        //lines.get(0);
