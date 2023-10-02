package singleton;
/**
 * Anagram Game
 * @author Gavin Orme
 */
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;


public class Game
{
    private Random rand = new Random();
    private Difficulty level = Difficulty.EASY;
    private int correctAnswers;

    //Hash maps
    //Stores items in pairs
    //One index is a key and the object is a value
    private HashMap<Difficulty, ArrayList<Anagram>> anagramsByDifficulty = new HashMap<Difficulty, ArrayList<Anagram>>();
    private Anagram currentAnagram;
    private static Game game;

    private Game() {}

    /**
     * The getInstance method creates each level of the game
     * @return Returns game which makes the entire game
     */
    public static Game getInstance()
    {
        if(game == null)
        {
            game = new Game();
            game.anagramsByDifficulty.put(Difficulty.EASY, singleton.FileReader.getAnagrams(Difficulty.EASY));
            game.anagramsByDifficulty.put(Difficulty.MEDIUM, singleton.FileReader.getAnagrams(Difficulty.MEDIUM));
            game.anagramsByDifficulty.put(Difficulty.HARD, singleton.FileReader.getAnagrams(Difficulty.HARD));
        }
        return game;
    }

    /**
     * Creates a string representation of randomly getting a question from the array list
     * @return Returns the string to the left of the dash which is the question
     */
    public String getQuestion()
    {
        int i = rand.nextInt(8);
        ArrayList<Anagram> anagrams = game.anagramsByDifficulty.get(level);
        currentAnagram = anagrams.get(i);
        return currentAnagram.getQuestion();
    }

    //if the userAnswer equals one of the strings on the array list then the user is correct and 
    //score goes up one and after a certain amount the difficulty goes up
    /**
     * This is a boolean that adds the user's score if they get the anagram right and subtracts the score if they get it wrong
     * @param userAnswer This is the user's input
     * @return Returns if the user's input matches a correct answer in the txt file
     */
    public boolean isCorrect(String userAnswer)
    {
        boolean isCorrect = currentAnagram.isCorrect(userAnswer);
        if(isCorrect == true)
        {
            correctAnswers++;
        }
        if(isCorrect == false)
        {
            correctAnswers--;
        }
        if(correctAnswers == 3)
        {
            level = Difficulty.EASY;
        }
        else if(correctAnswers == 7)
        {
            level = Difficulty.MEDIUM;
        }
        if(correctAnswers == 4) //comparing
        {
            level = Difficulty.MEDIUM;
        }
        if(correctAnswers == 8)
        {
            level = Difficulty.HARD;
        }
        return isCorrect;
    }

    /**
     * Adds up the total of the anagrams the user got right
     * @return Returns the total score of the amount of anagrams that the user got right and wrong
     */
    public int getScore()
    {
        return correctAnswers; // add each levels
    }
}