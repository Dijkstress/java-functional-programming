package com.example.lld.snake_and_ladder.models;

import com.example.lld.snake_and_ladder.interfaces.DiceStrategy;

public class NormalDice implements DiceStrategy {

    @Override
    public int roll() {
        return (int)(Math.random() * 6) + 1 ;
    }
}
