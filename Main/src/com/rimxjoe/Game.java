package com.rimxjoe;

import com.rimjoe.screens.LoadingScreen;

public class Game extends com.badlogic.gdx.Game{

    @Override
    public void create() {
        setScreen(new LoadingScreen(this));
    }
}
