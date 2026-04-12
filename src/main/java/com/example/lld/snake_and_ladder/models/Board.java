package com.example.lld.snake_and_ladder.models;

import com.example.lld.snake_and_ladder.interfaces.ObstacleStrategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    private final int size;
    private final Map<Integer, ObstacleStrategy> obstacleStrategyMap;

    public Board(int size, List<ObstacleStrategy> obstacles) {
        this.size = size;
        this.obstacleStrategyMap = new HashMap<>();
        for(ObstacleStrategy obstacleStrategy : obstacles){
            if(obstacleStrategyMap.containsKey(obstacleStrategy.getStart())){
                throw new IllegalArgumentException("Duplicate obstacles at "+ obstacleStrategy.getStart());
            }
            obstacleStrategyMap.put(obstacleStrategy.getStart(),obstacleStrategy);
        }
    }

    public int getSize() {
        return size;
    }

    public int getFinalPosition(){
        return size*size;
    }

    public int getNextPosition(int currentPosition){
        if(obstacleStrategyMap.containsKey(currentPosition)){
            return obstacleStrategyMap.get(currentPosition).getDestination(currentPosition);
        }

        return currentPosition;
    }
}
