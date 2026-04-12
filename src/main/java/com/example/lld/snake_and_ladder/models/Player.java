package com.example.lld.snake_and_ladder.models;

public class Player {
    private final int playerId;
    private int position;

    public Player(int playerId) {
        this.playerId = playerId;
        this.position = 0;
    }

    public int getPlayerId() {
        return playerId;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerId=" + playerId +
                ", position=" + position +
                '}';
    }
}
