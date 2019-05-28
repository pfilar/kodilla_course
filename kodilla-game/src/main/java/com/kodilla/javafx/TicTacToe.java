package com.kodilla.javafx;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {        // gra oparta na współżędnych / plansza zbudowana ze zmiennej char
    private static final char COMPUTER_MOVE_SYMBOL = 'O';

    public static void main(String[] args) {
        int boardSize = 3;
        char currentSymbol = 'X';
        char[][] board = new char[boardSize][boardSize];

        while (true) {
            boolean rightMove = makeMove(board, boardSize, currentSymbol);
            if (rightMove) {
                boolean winVerses = checkVerses(board, currentSymbol);
                boolean winColumns = checkColumns(board, currentSymbol);
                boolean winCrossOne = checkCrossOne(board, currentSymbol);
                boolean winCrossTwo = checkCrossTwo(board, currentSymbol);

                if (winVerses || winColumns || winCrossOne || winCrossTwo) {
                    printBoard(board, boardSize);
                    System.out.println("you win: " + currentSymbol);
                    break;
                }

                currentSymbol = currentSymbol == 'X' ? 'O' : 'X';      // operator ternarny
            }
        }
    }

    public static void printBoard(char[][] board, int boardSize) {      // metoda odpowiedzialna za drukowanie planszy

        for (int i = 0; i < boardSize; i++) {        //  drukowanie nagłówków kolumn  albo System.out.println("\t0 \t1 \t2");
            System.out.print("\t" + i);
        }
        System.out.println();

        for (int verse = 0; verse < board.length; verse++) {              // drukowanie zawartości planszy
            System.out.print(verse + ": \t");
            for (int column = 0; column < board[verse].length; column++) {
                System.out.print(board[verse][column] + "\t");
            }
            System.out.println();
        }
    }

    public static boolean makeMove(char[][] board, int boardSize, char currentSymbol) {
        printBoard(board, boardSize);                           // wydruk planszy

        int row = 0;
        int column = 0;

        if (currentSymbol == COMPUTER_MOVE_SYMBOL) {
            Random computerMoveRandom = new Random();
            row = computerMoveRandom.nextInt(3);
            column = computerMoveRandom.nextInt(3);
            System.out.printf("computer move, row: %d, column: %d%n", row, column);
        } else {
            System.out.println(currentSymbol + " your move");
            System.out.println("give index of verse");              // podanie wiersza z klawiatury
            row = new Scanner(System.in).nextInt();
            System.out.println("give index of column");             // podanie kolumny z klawiatury
            column = new Scanner(System.in).nextInt();
        }

        boolean rightMove = board[row][column] == 0;          // zbanowanie niedozwolonego ruchu
        if (!rightMove) {
            System.out.println("Not allowed move, try again");
            //continue;
            return false;
        }
        board[row][column] = currentSymbol;                   // umieszczenie symbolu na planszy
        return true;
    }

    public static boolean checkVerses(char[][] board, char currentSymbol) {
        for (int verse = 0; verse < board.length; verse++) {
            boolean win = true;
            for (int column = 0; column < board[verse].length; column++) {
                if (board[verse][column] != currentSymbol) {
                    win = false;
                    break;
                }
            }
            if (win) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkColumns(char[][] board, char currentSymbol) {
        for (int column = 0; column < board.length; column++) {
            boolean win = true;
            for (int verse = 0; verse < board.length; verse++) {
                if (board[verse][column] != currentSymbol) {
                    win = false;
                    break;
                }
            }
            if (win) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkCrossOne(char[][] board, char currentSymbol) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] != currentSymbol) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkCrossTwo(char[][] board, char currentSymbol) {
        for (int i = 0; i < +2; i++) {
            for (int j = 2; j >= 0; j--) {
                if (board[i][j] != currentSymbol) {
                    return false;
                }
            }
        }
        return true;
    }
}
