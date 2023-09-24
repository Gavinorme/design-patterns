package factory;
/**
 * Creating Bike
 * @author Gavin Orme
 */

public abstract class Bike 
{
    protected String name;
    protected double price;
    protected int numWheels;
    protected boolean hasPedals;
    protected boolean hasTrainingWheels;
    
    /**
     * This creates a class that returns every class outside of assembleBike
     * @return Returns the classes createFrame, addWheels, addPedals, and getPrice to fully assemble the bike
     */
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

    /**
     * Creates the class createFrame to grab the name of the bike
     * @return returns the String name from the protected String above
     */
    private String createFrame()
    {
        return ("- Assembling "+name + " frame");
    }

    /**
     * Returns the class addWheels by giving each bike a string of the number of wheels it has from each child's class
     * @return Returns the number of wheels the different bikes have
     */
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

    /**
     * Creates the class addPedals by making the boolean hasPedals true if the bike has pedals 
     * @return Returns Adding pedals if the bike has pedals 
     */
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
            return("");
        }
        return ("- Adding pedals");
    }

    /**
     * Creates a double representation of the price of each bike
     * @return Returns the price of the bike from each different bike's class
     */
    public double getPrice()
    {
        return price;
    }
}