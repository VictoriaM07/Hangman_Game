import java.util.Arrays;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        // 1. Print Welcome to Hangman
        // 2. Salveaza un cuvand random intr-o variab.
        // 3. Afiseaza nr stelute = numar caractere
        // 4. Cere litera de la user
        // 5. Daca litera se regasete se inlocuieste fiecare steluta cu acea litera de la acelasi index
        // 6. Repeta la infinit cererea si validarea literei
        // 7. Opreste repetitia cand cuvantul este complet

        System.out.println(">>>>>> Welcome to Hangman game! <<<<<<");
        Scanner sc = new Scanner(System.in);
        String word = "dog";
        int wordLength = word.length();
        char[] stars = new char[wordLength];

//        for (int i = 0; i < stars.length; i++) {
//            stars[i] = '*';
//        }

        Arrays.fill(stars, '*');
        System.out.println(stars);

        while (true) {
            System.out.print("Enter a letter: ");
            char guessedLetter = sc.next().charAt(0);

            for (int i = 0; i < wordLength; i++) {
                if (word.charAt(i) == guessedLetter) {
                    stars[i] = guessedLetter;
                }
            }
            System.out.println(stars);

            if (!String.valueOf(stars).contains("*")) {
                System.out.println("Congrats");
                break;
            }
        }
    }
}
