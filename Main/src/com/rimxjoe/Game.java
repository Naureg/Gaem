package com.rimxjoe;

import com.rimxjoe.screens.LoadingScreen;

public class Game extends com.badlogic.gdx.Game{

    //this is a comment
    @Override
    public void create() {
        setScreen(new LoadingScreen(this));
    }
}
