package factory;

public abstract class Bike 
{
    protected String name;
    protected double price;
    protected int numWheels;
    protected boolean hasPedals;
    protected boolean hasTrainingWheels;
    
    public String assembleBike()
    {   
        createFrame();
        addWheels();
        addPedals();
        getPrice();
        
        return ("Creating a Kid's Bike " + 
        "\n" + createFrame() +
         "\n" + addWheels() + 
         "\n" + addPedals() + 
         "\n" + "Price: " + 
         getPrice());
    }

    private String createFrame()
    {
        return ("- Assembling "+name + " frame");
    }

    private String addWheels()
    {
        String numWheels = "0";
        if(name.equalsIgnoreCase("Kids Bike"))
        {
            numWheels = "4";
            return("- Adding " +numWheels+ " wheels" + "\n" +"- Adding training wheels");
        }
        else if(name.equalsIgnoreCase("strider"))
        {
            numWheels = "2";
        }
        else if(name.equalsIgnoreCase("tricycle"))
        {
            numWheels = "3";
        }
        return ("- Adding " +numWheels+ " wheels");
    }

    private String addPedals()
    {
        String pedals = "0";
        if(hasPedals == true)
        {
            pedals = "2";
        }
        else if(hasPedals == false)
        {
            pedals = "0";
            return("- No pedals");
        }
        return ("- Adding pedals");
    }

    public double getPrice()
    {
        return price;
    }
}