

import java.io.*;
import java.util.Random;

public class Hungman {

    private char[] word;
    Console myConsole = System.console();
    int guessesMade;
    int score;

    public static char[] star;
        public static void main (String args[])
        {   
            Hungman randomWord = new Hungman();
            randomWord.selectCountry();
            randomWord.startGame();

        
    }

    public void selectCountry(){
        Random r = new Random();
        String[] country = { "pakistan", "india", "germany", "america", "russia", "iran", "iraq", "japan", "sudan", "canada"};
            int x = r.nextInt(country.length);
            String countrySelected = country[x];
            word = countrySelected.toCharArray();
            System.out.println("A random country has been selected. Guess the country:");
    }

    public void startGame(){
        int length = word.length;
        System.out.println("CLUE: The word length is " + length + " characters long.");
        
        // Starts Game
        guessesMade = 0;
        int lengthOfWord = word.length;
        score = 0;
        char[] country = new char[lengthOfWord];
        for(int i=0;i<lengthOfWord;i++){
            country[i] = '*'; 
        }
        String correct = new String(country);
        StringBuilder output = new StringBuilder(correct);
        for(int e=0;e<9;e++){
            System.out.println("Please guess a letter in the word: ");
            String guessedLetter = myConsole.readLine();
            char firstLetter = guessedLetter.charAt(0);
            System.out.println("Letter selected: " + firstLetter);
        }

    }
}