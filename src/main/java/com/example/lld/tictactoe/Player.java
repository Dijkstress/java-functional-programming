package com.example.lld.tictactoe;

public class Player {
    private int player_id;
    private Shape shape;

    public Player(int player_id, Shape shape) {
        this.player_id = player_id;
        this.shape = shape;
    }

    public int getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(int player_id) {
        this.player_id = player_id;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }
}
