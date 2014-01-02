package com.rimxjoe;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class GameStarter{
    private static final short DEFAULT_WIDTH = 1024;
    private static final short DEFAULT_HEIGHT = 800;
    private static final String WINDOW_TITLE = "Gaem!";
    public static void main(String[] args){
        final LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = WINDOW_TITLE;

        if(args.length >= 0){
            try{
                config.width = 1280;
                config.height = 1024;
            }
            catch(Exception e){
                config.width = DEFAULT_WIDTH;
                config.height = DEFAULT_HEIGHT;
                System.out.println("Could not set custom resolution, reverting to default window size.\n");
            }
            finally{
                System.out.println("Resolution set to: " + config.width + " by " + config.height);
            }
            config.useGL20 = true;
        }
        final LwjglApplication app = new LwjglApplication(new Game(), config);
    }
}
