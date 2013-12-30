package com.rimxjoe.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.rimxjoe.Game;

public class GameScreen implements Screen {

    public static Game g;

    public static SpriteBatch batch;

    static OrthographicCamera cam;

    //protected ArrayList<Entity> entities;

    public GameScreen(Game g) {

        GameScreen.g = g;

        //entities = new ArrayList<Entity>();

        batch = new SpriteBatch();

        cam = new OrthographicCamera();

        cam.setToOrtho(false, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());

        batch.setProjectionMatrix(cam.combined);

        batch.enableBlending();
    }

    @Override
    public void render(float delta) {

        //uncomment following lines once the Entity class is written and works
        /*
        for(Entity e: entities) e.update(delta);

        for(Entity e: entities) e.draw();
        */
    }

    @Override
    public void resize(int i, int i2) {

    }

    @Override
    public void show() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void dispose() {
        /*
        if(entities != null) {
            for(Iterator<Entity> it = entities.iterator(); it.hasNext();) {
                Entity e = it.next();

                e.dispose();
                it.remove();
            }
        }
        */

    }
}
