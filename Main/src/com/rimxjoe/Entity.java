package com.rimxjoe;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

public class Entity extends Sprite{
    private Vector2 velocity = new Vector2();
    public Entity(Texture T){
        super(T);
    }
    public void dispose(){
        super.getTexture().dispose();
    }
    public Vector2 getVelocity() {
        return this.velocity;
    }
    public void setVelocity(Vector2 velocity){
        this.velocity = velocity;
    }
}
//linus sux