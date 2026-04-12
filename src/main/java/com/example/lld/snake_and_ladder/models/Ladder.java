package com.example.lld.snake_and_ladder.models;

import com.example.lld.snake_and_ladder.interfaces.ObstacleStrategy;

public class Ladder implements ObstacleStrategy {

    private final int start;
    private final int end;

    public Ladder(int start,int end){
        if(start>=end){
            throw new IllegalArgumentException("Invalid states");
        }
        this.start=start;
        this.end=end;
    }

    @Override
    public int getStart() {
        return start;
    }

    @Override
    public int getEnd() {
        return end;
    }

    @Override
    public int getDestination(int position) {
        return position;
    }
}
