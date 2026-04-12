package com.example.lld.tictactoe;


public class Board {

    private int size = 3;
    private Shape[][] board = new Shape[size][size];

    Board() {
        resetBoard();
    }

    public boolean isFilled() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == Shape.EMPTY) return false;
            }
        }
        return true;
    }

    public boolean isValid(int row, int col) {
        if (row < 0 || col < 0 || row >= size || col >= size) return false;
        return board[row][col] == Shape.EMPTY;
    }

    boolean placeShape(int row, int col, Shape shape) {
        if (!isValid(row, col)) return false;
        board[row][col] = shape;
        return true;
    }

    void resetBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = Shape.EMPTY;
            }
        }
    }

    boolean checkWin(int row, int col, Shape shape) {

        boolean win = true;

        // row
        for (int j = 0; j < size; j++) {
            if (board[row][j] != shape) {
                win = false;
                break;
            }
        }
        if (win) return true;

        // col
        win = true;
        for (int i = 0; i < size; i++) {
            if (board[i][col] != shape) {
                win = false;
                break;
            }
        }
        if (win) return true;

        // main diagonal
        if (row == col) {
            win = true;
            for (int i = 0; i < size; i++) {
                if (board[i][i] != shape) {
                    win = false;
                    break;
                }
            }
            if (win) return true;
        }

        // anti-diagonal
        if (row + col == size - 1) {
            win = true;
            for (int i = 0; i < size; i++) {
                if (board[i][size - i - 1] != shape) {
                    win = false;
                    break;
                }
            }
            if (win) return true;
        }

        return false;
    }

    void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == Shape.EMPTY) {
                    System.out.print("_ ");
                } else {
                    System.out.print(board[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}