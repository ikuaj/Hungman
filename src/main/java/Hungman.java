import java.io.*;
import java.util.Random;

public class Hungman {

    private char[] word;

    public static char[] star;
        public static void main (String args[])
        {   
            Hungman randomWord = new Hungman();
            randomWord.selectCountry();
            randomWord.playHungman();

        
    }

    public void selectCountry(){
        Random r = new Random();
        String[] country = { "pakistan", "india", "germany", "america", "russia", "iran", "iraq", "japan", "sudan", "canada"};
            int x = r.nextInt(country.length);
            String countrySelected = country[x];
            word = countrySelected.toCharArray();
            System.out.println("A random country has been selected. Guess the country:");
    }

    public void playHungman(){
        int length = word.length;
        System.out.println("CLUE: The word length is " + length + " characters long.");
    }
}