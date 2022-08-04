package org.example;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;

        System.out.println("Welcome Number Guessing Game");
        System.out.println("Number Random : " +  randomNumber);


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your guess (1 - 100) : ");

            int playerGuess = scanner.nextInt();


            if (playerGuess == randomNumber) {
                System.out.println("Correct ! You win");
                break;
            } else if (randomNumber > playerGuess) {
                System.out.println("The number is higher, Guess again.");
            } else {
                System.out.println("The number is lower, Guess again.");
            }

        }
    }
}
