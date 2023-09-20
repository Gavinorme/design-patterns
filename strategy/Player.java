package strategy;
/**
 * A football coach
 * @author Gavin Orme
 */
public class Player 
{
    private String firstName;
    private String lastName;
    private boolean offense;

    protected offenseBehavior OffenseBehavior;
    protected defenseBehavior DefenseBehavior;

/**
 * Creates a player name and whether they are on offense or not
 * @param firstName grabs the first name of the seahawks player
 * @param lastName grabs the last name of the seahawks player
 * @param offense determines if the seahawks players are on offense or defense
 */
public Player(String firstName, String lastName, boolean offense)
{
    this.firstName = firstName;
    this.lastName = lastName;
    this.offense = offense;
    
}  

    public void setOffenseBehavior()
    { 
    }
    public void setDefenseBehavior()
    {  
    }
    
    /**
     * Creates string represenations of the plays on the field
     * @return A string representation of if the offense is playing or not  
     */
    public String play()
    {
        setDefenseBehavior();
        setOffenseBehavior();
        if(this.offense)
        {
        if(offense && OffenseBehavior != null)
        {
            return this.OffenseBehavior.play();
        }
        else
        {
            return("not playing");
        }
        }
        else
        {
        if(DefenseBehavior != null)
        {
            return this.DefenseBehavior.play();
        }
        else
        {
            return("not playing");
        }
        } 
    }
    // public abstract void setDefenseBehavior();
    // public abstract void setOffenseBehavior(); 

    public void turnover()
    {
        offense = false;
    }
    
    /**
     * Creates a string that displays the player's name 
     * @return A string representation of the name of the player
     */
    public String toString()
    {
       return(firstName+" "+lastName+"");
    }
}


