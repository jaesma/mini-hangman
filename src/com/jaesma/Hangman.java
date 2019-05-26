package com.jaesma;

import java.util.Scanner;

public class Hangman {
    static Scanner scan = new Scanner(System.in);

    Player player;
    String[] words = {"sun", "moon", "chair", "ball", "mouse", "cup", "spoon", "fork", "key", "ring"};
    int random = (int) (Math.random() * 10);
    public void startGame() {
        player = new Player();
        String targetWord = words[random];
        int guessCount = 0;
        int guessLimit = 10;
        boolean isRight = false;

        System.out.println("Let's play a guessing word game! ");
        while (true) {
            System.out.print("I'm thinking of a word. The possible words are: [");
            for (String word : words) {
                System.out.print(word + " ");
            }
            System.out.println("]");
            System.out.println("Guess remaining: " + (guessLimit - guessCount));

            player.guess();
            if (player.getGuessWord().equals(targetWord)) {
                guessCount++;
                System.out.println(" ********* Correct! You Won! Congratulations! ********");
                break;
            } else {
                guessCount++;
                System.out.println("Wrong! Guess again! ");
                if (guessCount == guessLimit) {
                    System.out.println("** Game Over ** ");
                    System.out.println("The word is: " + targetWord);
                    break;
                }
            }
        }
    }
}
