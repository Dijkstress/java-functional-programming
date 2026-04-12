package com.example.lld.snake_and_ladder;

import com.example.lld.snake_and_ladder.interfaces.DiceStrategy;
import com.example.lld.snake_and_ladder.interfaces.ObstacleStrategy;
import com.example.lld.snake_and_ladder.models.*;

import java.util.*;

public class GameDemo {

    public static void main(String[] args){
        List<ObstacleStrategy> obstacleStrategies = new ArrayList<>();
        obstacleStrategies.add(new Snake(98,3));
        obstacleStrategies.add(new Snake(78,29));

        obstacleStrategies.add(new Ladder(17,87));

        Board board = new Board(10,obstacleStrategies);

        Player player1 = new Player(1);
        Player player2 = new Player(2);

        DiceStrategy dice = new NormalDice();

        Game game = Game.builder()
                .withBoard(board)
                .withDice(dice)
                .withPlayers(Arrays.asList(player1,player2))
                .build();

        game.startGame();
    }




}
