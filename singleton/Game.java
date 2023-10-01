package singleton;

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

    //grabs anagram from mixing up the txt's using an arraylist and the rand
    public String getQuestion()
    {
        int i = rand.nextInt(8);
        ArrayList<Anagram> anagrams = game.anagramsByDifficulty.get(level);
        currentAnagram = anagrams.get(i);
        return currentAnagram.getQuestion();
    }

    //if the userAnswer equals one of the strings on the array list then the user is correct and 
    //score goes up one and after a certain amount the difficulty goes up
    private int totalAnswers = 0;
    public boolean isCorrect(String userAnswer)
    {
        boolean isCorrect = currentAnagram.isCorrect(userAnswer);
        if(isCorrect == true)
        {
            correctAnswers++;
        }
        else
        {
            isCorrect = false;
        }

        if(isCorrect == false)
        {
            correctAnswers--;
        }
        
        if(correctAnswers == 4) //comparing
        {
            if(level == Difficulty.EASY)
            {
                level = Difficulty.MEDIUM;
                totalAnswers = correctAnswers;
                
            }
        }  
            if(level == Difficulty.MEDIUM)
            {
                level = Difficulty.HARD;
                correctAnswers = 0;
                totalAnswers = 8 + correctAnswers;
            }
        
        return isCorrect;
    }

    //adds up the user's score so the difficulty can go up
    public int getScore()
    {
        return totalAnswers; // add each levels
    }
}






//Notes
//random rand
//difficulty is based on score
//easy tied to three
//
//get question returns random anagram
//if correct add to score and factor in difficulty
