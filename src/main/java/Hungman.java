import java.io.*;
import java.util.Random;

public class Hungman {
    public static char[] star;
        public static void main (String args[])
        {   
            Hungman randomWord = new Hungman();
            randomWord.selectCountry();

        
    }

    public void selectCountry(){
        Random r = new Random();
        String[] country = { "pakistan", "india", "jarmany", "america", "rashia", "iran", "iraq", "japan", "sudan", "canada"};
            int x = r.nextInt(country.length);
            String countrySelected = country[x];
            char[] word = countrySelected.toCharArray();
            System.out.println("Start Game");
    }
}