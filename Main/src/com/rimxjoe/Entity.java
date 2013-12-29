package com.rimxjoe;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

public class Entity extends Sprite{
    private Vector2 vector = new Vector2();
    public Entity(Texture T){
        super(T);
    }
    public Vector2 getVector() {
        return this.vector;
    }
    public void setVector(Vector2 vector){
        this.vector = vector;
    }
}
