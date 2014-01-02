package com.rimxjoe.screens;

import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.IsometricTiledMapRenderer;

public class GamePlayScreen extends GameScreen {

    public GamePlayScreen() {

        TmxMapLoader loader = new TmxMapLoader();


        this.map = loader.load("../assets/map.tmx");


        renderer = new IsometricTiledMapRenderer(map);

        //this.entities = new ArrayList<Entity>();

    }


    public void render(float delta) {
        renderBegin();

        renderer.setView(cam);

        renderer.render();

        renderEnd();
    }

}
