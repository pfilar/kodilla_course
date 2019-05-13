package com.kodilla.javafx;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        Random computerMoveRandom = new Random();
        int computerMove = computerMoveRandom.nextInt(9)+1;
        System.out.println(computerMove);

        int computerRowMove = computerMoveRandom.nextInt(3);
        int computerColumnMove = computerMoveRandom.nextInt(3);
        System.out.println("row: " + computerRowMove );
        System.out.println("column: " + computerColumnMove );
    }
}
