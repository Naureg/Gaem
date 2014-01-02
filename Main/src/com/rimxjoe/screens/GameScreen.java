package com.rimxjoe.screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.renderers.IsometricTiledMapRenderer;
import com.rimxjoe.Game;

public class GameScreen implements Screen {

    public static Game g;

    protected TiledMap map;

    protected IsometricTiledMapRenderer renderer;

    protected static OrthographicCamera cam;

    public static SpriteBatch batch;

    //protected ArrayList<Entity> entities;


    public GameScreen(Game g) {

        GameScreen.g = g;

        cam = new OrthographicCamera(1024,800);

        batch = new SpriteBatch();

        batch.setProjectionMatrix(cam.combined);

        batch.enableBlending();

        //entities = new ArrayList<Entity>();
    }

    public GameScreen() {

    }

    public void renderBegin() {
        Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);
        GameScreen.batch.begin();
    }

    @Override
    public void render(float delta) {

        //uncomment following lines once the Entity class is written and works
        /*
        for(Entity e: entities) e.update(delta);

        for(Entity e: entities) e.draw();
        */
    }

    public void renderEnd() {
        GameScreen.batch.end();
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
        g.resume();
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
