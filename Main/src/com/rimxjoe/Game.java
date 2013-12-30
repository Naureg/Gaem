package com.rimxjoe;

import com.rimxjoe.screens.LoadingScreen;

public class Game extends com.badlogic.gdx.Game{

    //this is another comment
    //fuck you Linus
    @Override
    public void create(){
        setScreen(new LoadingScreen(this));
    }
}
