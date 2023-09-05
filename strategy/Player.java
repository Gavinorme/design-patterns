package strategy;

public class Player 
{
    private String firstName;
    private String lastName;
    private boolean offense;

    protected offenseBehavior OffenseBehavior;
    protected defenseBehavior DefenseBehavior;


public Player(String firstName, String lastName, boolean offense)
{
    this.firstName = firstName;
    this.lastName = lastName;
    this.offense = offense;
    setDefenseBehavior();
    setOffenseBehavior();
}  

    public void setOffenseBehavior()
    { 
    }
    public void setDefenseBehavior()
    {  
    }
    /**
     * 
     * @return
     */
    public String play()
    {
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
     
    public void turnover()
    {
        offense = false;
    }
    public String toString()
    {
       return(firstName+" "+lastName+"");
    }
}


