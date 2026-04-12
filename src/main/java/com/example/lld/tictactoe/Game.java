package com.example.lld.tictactoe;

import java.util.Scanner;

public class Game {
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Board board;

    public Game() {
        player1=new Player(1,Shape.X);
        player2=new Player(2,Shape.O);
        currentPlayer=player1;
        board=new Board();
    }

    void start(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Player " + currentPlayer.getPlayer_id() + " (" + currentPlayer.getShape() + ") turn");

            System.out.print("Enter row and column: ");
            int row = sc.nextInt();
            int col = sc.nextInt();

            if(!board.placeShape(row,col,currentPlayer.getShape())){
                System.out.println("Invalid");
                continue;
            }

            board.printBoard();
            if(board.checkWin(row,col,currentPlayer.getShape())){
                System.out.println(currentPlayer.getPlayer_id()+"wins");
                break;
            }

            if(board.isFilled()){
                System.out.println("Draw");
                break;
            }

            switchTurn();
        }
    }

    void switchTurn(){
        currentPlayer=(currentPlayer==player1)?player2:player1;
    }
}
