package com.brosapps.PolePosition;
import com.brosapps.framework.Game;
import com.brosapps.framework.Graphics;
import com.brosapps.framework.Screen;
import com.brosapps.framework.Graphics.ImageFormat;

public class LoadingScreen extends Screen{
	
	public LoadingScreen(Game game) {
        super(game);
    }


    @Override
    public void update(float deltaTime) {
        Graphics g = game.getGraphics();
        Assets.menu = g.newImage("menuscreen_v1.png", ImageFormat.RGB565);
        Assets.enemy1 = g.newImage("enemy1.png", ImageFormat.RGB565);
        Assets.enemy2 = g.newImage("enemy2.png", ImageFormat.RGB565);
        Assets.click = game.getAudio().createSound("explode.ogg");


        
        game.setScreen(new MainMenuScreen(game));


    }


    @Override
    public void paint(float deltaTime) {


    }


  


    @Override
    public void dispose() {


    }


    @Override
    public void backButton() {


    }


	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
		
	}

	
	
}
