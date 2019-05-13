package com.kodilla.game;

import static com.kodilla.game.Winner.*;

public class Game {
    private int boardSize = 3;
    private Hit currentSymbol = Hit.X;
    private Hit[][] board = new Hit[boardSize][boardSize];

    public boolean setValue(int x, int y, Hit hit) {
        if (board[x][y] == null) {
            board[x][y] = hit;
            currentSymbol = hit;

            return true;
        }

        return false;
    }

    public Hit getValue(int x, int y) {
        return board[x][y];
    }

    public boolean checkLastMove() {
        int moves = 9;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] != null) {
                    moves--;
                }
            }
        }

        return moves == 0;
    }

    public void reset() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = null;
            }
        }
        currentSymbol = Hit.X;
    }

    public boolean checkRow(int index) {

        for (int i = 1; i < board.length; i++) {
            if (board[i - 1][index] != board[i][index] || board[i][index] == null) {
                return false;
            }
        }
        return true;


    }

    public boolean checkCol(int index) {
        for (int i = 1; i < board.length; i++) {
            if (board[index][i - 1] != board[index][i] || board[index][i] == null) {
                return false;
            }
        }
        return true;


    }

    // Takes the row and column coordinates of the last move made
    // and checks to see if that move causes the player to win
    public Winner isWinner() {
        Winner winner = Winner.NONE;
        winner = checkHorizontal();
        if(winner == NONE)
            winner = checkVertical();
        if (winner == NONE)
            winner = checkDiagonal();
        return winner;
    }

    private Winner checkDiagonal() {
        Winner winner = NONE;
        winner = checkDiagonal(COMPUTER) ? COMPUTER : NONE;
        if(winner == NONE)
            winner = checkDiagonal(HUMAN) ? HUMAN : NONE;
        return winner;
    }

    private boolean checkDiagonal(Winner winner) {
        Hit hit = (winner == HUMAN) ? Hit.X : Hit.O;
        return (board[0][0] == hit && board[1][1] == hit && board[2][2] == hit) ||
                (board[2][0] == hit && board[1][1] == hit && board[0][2] == hit);
    }

    private Winner checkVertical() {
        Winner winner = Winner.NONE;
        for (int n = 0; n < 3; n++) {
            if(checkColForWinner(n, COMPUTER))
                winner = COMPUTER;
            else if (checkColForWinner(n, HUMAN))
                winner = HUMAN;
        }
        return winner;
    }

    private boolean checkColForWinner(int col, Winner winner) {
        Hit hit = (winner == HUMAN) ? Hit.X : Hit.O;
        return board[0][col] == hit && board[1][col] == hit && board[2][col] == hit;
    }

    private Winner checkHorizontal() {
        Winner winner = Winner.NONE;
        for (int n = 0; n < 3; n++) {
            if(checkRowForWinner(n, COMPUTER))
                winner = COMPUTER;
            else if (checkRowForWinner(n, HUMAN))
                winner = HUMAN;
        }
        return winner;
    }

    private boolean checkRowForWinner(int row, Winner winner) {
        Hit hit = (winner == HUMAN) ? Hit.X : Hit.O;                // zamiast if else
        return board[row][0] == hit && board[row][1] == hit && board[row][2] == hit;
    }

}
