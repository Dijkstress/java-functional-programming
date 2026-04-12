package com.example.lld.snake_and_ladder.models;

import com.example.lld.snake_and_ladder.interfaces.ObstacleStrategy;

public class Snake implements ObstacleStrategy {
    private final int start;
    private final int end;

    public Snake(int start, int end) {
        if (start <= end) {
            throw new IllegalArgumentException("Snake must go down");
        }
        this.start = start;
        this.end = end;
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
