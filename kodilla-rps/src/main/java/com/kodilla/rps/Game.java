package com.kodilla.rps;

import java.util.Random;

public class Game {

    private int finish;
    private boolean end;


    public void playGame() {
        int gameNumber = UserDialogs.getGameNumber();

        getInformationAboutGame();
        beginningTheGame();

        while (!end) {
            UserSelection userMove = UserDialogs.getUserSelection();
            switch (userMove) {
                case ROCK:
                case PAPER:
                case SCISORS:
                    doUserMove(userMove);
                    break;                  // musi byyć przerwany przez break, żeby nie wykonać new game
                case NEW_GAME:
                    newGame();
                    break;
                case EXIT:
                    end = true;
            }
            if (finish > gameNumber) {
                end = true;
            }
        }
    }


    private void newGame() {
        // tu wszystko zresetować i 0 do nr rundy
    }

    private void doUserMove(UserSelection userMove) {
        finish++;
        UserSelection computerMove = getComputerSelection();
        System.out.println("ruch gracza: " + userMove + " ruch komputera: " + computerMove);
        // tu sprawdzić kto wygrał rundę
    }

    private UserSelection getComputerSelection() {
        Random random = new Random();
        int n = random.nextInt(100);
        if (n < 34) {
            return UserSelection.PAPER;
        } else if (n < 67) {
            return UserSelection.ROCK;
        } else {
            return UserSelection.SCISORS;
        }
    }

    public static void getInformationAboutGame() {
        System.out.println("Game's info: press '1' to stone, press '2' to paper, press '1' to shears, press 'x' to end game, press 'n' to new session");
    }

    public static void beginningTheGame() {
        System.out.println("game has been begone");
    }
}
