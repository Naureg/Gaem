package com.rimxjoe;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class GameStarter{
    private static final short DEFAULT_WIDTH = 800;
    private static final short DEFAULT_HEIGHT = 600;
    public static void main(String[] args){
        final LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
        config.title = "Gaem!";
        if(args.length > 0){
            try{
                config.width = Short.parseShort(args[0]);
                config.height = Short.parseShort(args[1]);
            }
            catch(Exception e){
                config.width = DEFAULT_WIDTH;
                config.height = DEFAULT_HEIGHT;
                System.out.println("Could not set custom resolution, reverting to default window size.\n");
            }
            finally{
                System.out.println("Resolution set to: " + config.width + " by " + config.height);
            }
            config.useGL20 = false;
        }
        final LwjglApplication app = new LwjglApplication(new Game(), config);
    }
}
