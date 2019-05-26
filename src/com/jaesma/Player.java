package com.jaesma;

import static com.jaesma.Hangman.scan;

public class Player {
    private String guessWord;

    public void guess() {
        guessWord = scan.nextLine();
        guessWord.toLowerCase();
    }

    public String getGuessWord() {
        return guessWord;
    }


}
