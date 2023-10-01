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

public Anagram(String question, ArrayList<String> answers)
{
    super();
    this.question = question;
    this.answers = answers;
}

public String getQuestion()
{
    return question;
}

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