import java.util.Arrays;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        // 1. Print Welcome to Hangman
        // 2. Salveaza un cuvand random intr-o variab.
        // 3. Afiseaza nr stelute = numar caractere
        // 4. Cere litera de la user
        // 5. Daca litera se regasete se inlocuieste fiecare steluta cu acea litera de la acelasi index

        System.out.println(">>>>>> Welcome to Hangman game! <<<<<<");
        Scanner sc = new Scanner(System.in);
        String word = "airplane";
        int wordLength = word.length();
        char[] stars = new char[wordLength];

//        for (int i = 0; i < stars.length; i++) {
//            stars[i] = '*';
//        }

        Arrays.fill(stars,'*');
        System.out.println(stars);
        System.out.print("Enter a letter: ");
        char guessedLetter = sc.next().charAt(0);
    }
}
