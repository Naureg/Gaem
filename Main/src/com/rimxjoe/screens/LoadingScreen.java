package com.rimxjoe.screens;

import com.rimxjoe.Game;

public class LoadingScreen extends GameScreen {

    //private short loaded = 0;

    public LoadingScreen(Game g) {
        super(g);
    }

    @Override
    public void show() {
        g.setScreen(new GamePlayScreen());
    }



}
