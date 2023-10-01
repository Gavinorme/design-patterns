package singleton;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class FileReader {

    /**
     * Reads in the file and creates a list of anagorams
     * 
     * @param Difficulty Easy, Medium, or Hard
     * @return A list of Anagorams
     */
    public static ArrayList<Anagram> getAnagrams(Difficulty difficulty) {
        ArrayList<Anagram> anagrams = new ArrayList<Anagram>();

        try {
            File file = new File(difficulty.fileName);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine(); //reads line from file
                String[] data = line.split("-"); //splits the line on the dash char and puts the results of split in array
                String question = data[0].trim().toLowerCase(); //name = question
                String[] answers = data[1].split(","); //one overall string but splits after each comma
                ArrayList<String> flexAnswers = new ArrayList<>(); //trims and makes it lower case

                for (int i = 0; i < answers.length; i++) {
                    flexAnswers.add(answers[i].trim().toLowerCase());
                }

                anagrams.add(new Anagram(question, flexAnswers));
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }

        return anagrams;
    }
}

//Notes 
//get anagrams 
//return arraylist of anagrams
//loop through arraylist and see if answer matches one of the answers
//learn fileReader
