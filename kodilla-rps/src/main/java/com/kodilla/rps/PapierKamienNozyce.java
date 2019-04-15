package com.kodilla.rps;
import java.util.Random;
import java.util.Scanner;

public class PapierKamienNozyce {
    public static void main(String[] args) {

        int finish = 0;
        boolean end = false;
        int max = 3;
        int min = 1;

        System.out.println("please, give your name and confirm by press 'enter'");
        Scanner scanName = new Scanner(System.in);
        String userName = scanName.nextLine();
        System.out.println("helo: " + userName);

        System.out.println("choose how many times do you want to play and confirm by press 'enter'");
        Scanner scanGameNumbers = new Scanner(System.in);
        int gameNumber = scanGameNumbers.nextInt();
        System.out.println("your choice: " + gameNumber);

        getInformationAboutGame();
        beginningTheGame();
        System.out.println("select your choice");
        Scanner scanner1 = new Scanner(System.in);

        while(!end){
            int userMove = scanner1.nextInt();
            if (userMove >= 1 && userMove <= 3){
                finish++;
                Random generator = new Random();
                int computerMove = generator.nextInt((max - min) + 1) + min;
                System.out.println("ruch gracza: " + userMove + " ruch komputera: " + computerMove);
                if (finish == gameNumber) {
                    end = true;
                }
            }
        }
    }

    public static void getInformationAboutGame(){
        System.out.println("Game's info: press '1' to stone, press '2' to paper, press '1' to shears, press 'x' to end game, press 'n' to new session");
    }

    public static void beginningTheGame() {
        System.out.println("game has been begone");
    }
}
