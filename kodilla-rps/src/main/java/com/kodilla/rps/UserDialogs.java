package com.kodilla.rps;

import java.util.Scanner;

public class UserDialogs {
    public static UserSelection getUserSelection() {     // enum    zwraca wartość UserSelection zdefiniowaną w enum
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your selectiom: (R)ock, (S)cisors, (P)aper, e(X)it, (N)ew game");
            String s = scanner.nextLine().toUpperCase();
            switch (s) {
                case "R":
                    return UserSelection.ROCK;
                case "S":
                    return UserSelection.SCISORS;
                case "P":
                    return UserSelection.PAPER;
                case "X":
                    return UserSelection.EXIT;
                case "N":
                    return UserSelection.NEW_GAME;
                default:
                    System.out.println("Wrong selection try again.");
            }
        }
    }

    public static int getGameNumber() {
        System.out.println("choose how many times do you want to play and confirm by press 'enter'");
        Scanner scanGameNumbers = new Scanner(System.in);
        int gameNumber = scanGameNumbers.nextInt();
        System.out.println("your choice: " + gameNumber);
        return gameNumber;
    }
}
