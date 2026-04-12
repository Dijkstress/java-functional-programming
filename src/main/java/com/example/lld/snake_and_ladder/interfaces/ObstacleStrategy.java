package com.example.lld.snake_and_ladder.interfaces;

public interface ObstacleStrategy {
    int getStart();
    int getEnd();
    int getDestination(int position);
}
