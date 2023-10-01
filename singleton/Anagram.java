package singleton;
/**
 * Questions and Answers
 * @author Gavin Orme
 */
import java.util.ArrayList;

public class Anagram 
{
    private String question;
    ArrayList<String> answers;

/**
 * 
 * @param question String before the -
 * @param answers String after the -
 */
public Anagram(String question, ArrayList<String> answers)
{
    super();
    this.question = question;
    this.answers = answers;
}

/**
 * Grabs the question for the user to solve
 * @return Returns the anagram that the user has to solve
 */
public String getQuestion()
{
    return question;
}

/**
 * Determines whether the user's input is correct or not
 * @param userAnswer This is the user's input
 * @return Returns true if the user's input matches the answers array list and returns false if it doesn't
 */
public boolean isCorrect(String userAnswer)
{
    if(answers.contains(userAnswer))
    {
        return true;
    }
    else 
    {
        return false;
    }
}
}