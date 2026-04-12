package com.example.lld.snake_and_ladder.models;

import com.example.lld.snake_and_ladder.interfaces.DiceStrategy;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Game {
    private Queue<Player> playerQueue;
    private final Board board;
    private final DiceStrategy dice;

    public Game(GameBuilder builder) {
        this.board = builder.board;
        this.playerQueue = builder.playerQueue;
        this.dice = builder.dice;
    }

    public static GameBuilder builder(){
        return new GameBuilder();
    }

    public Queue<Player> getPlayerQueue() {
        return playerQueue;
    }

    public boolean getWiningCondition(int currentPosition){
        return currentPosition == board.getFinalPosition();
    }

    public void startGame(){
        while(true){
            Player currentPlayer = playerQueue.poll();
            int diceValue = dice.roll();
            int possiblePosition = currentPlayer.getPosition() + diceValue;
            // if player overshoots
            if(possiblePosition> board.getFinalPosition()){
                playerQueue.offer(currentPlayer);
                continue;
            }
            int newPosition=board.getNextPosition(possiblePosition);
            currentPlayer.setPosition(newPosition);
            System.out.println(currentPlayer.toString());

            if(getWiningCondition(newPosition)){
                System.out.println(currentPlayer.toString() + "Wins!!!");
                break;
            }
            playerQueue.offer(currentPlayer);
        }
    }

    public static class GameBuilder{
        private Board board;
        private Queue<Player> playerQueue;
        private DiceStrategy dice;

        public GameBuilder withBoard(Board board){
            this.board=board;
            return this;
        }

        public GameBuilder withPlayers(List<Player> players) {
            this.playerQueue = new LinkedList<>(players);
            return this;
        }

        public GameBuilder withDice(DiceStrategy dice) {
            this.dice = dice;
            return this;
        }

        private void validate() {
            if (board == null) throw new IllegalStateException("Board is required");
            if (playerQueue == null || playerQueue.isEmpty()) {
                throw new IllegalStateException("Players are required");
            }
            if (dice == null) throw new IllegalStateException("Dice is required");
        }

        public Game build(){
            validate();
            return new Game(this);
        }
    }
}
