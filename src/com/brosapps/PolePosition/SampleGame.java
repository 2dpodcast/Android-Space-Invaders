package com.brosapps.PolePosition;

import com.brosapps.framework.Screen;
import com.brosapps.framework.implementation.AndroidGame;


public class SampleGame extends AndroidGame{
	
	public Screen getInitScreen() {
        return new LoadingScreen(this); 
    }
	
	@Override
	public void onBackPressed() {
	getCurrentScreen().backButton();
	}

}
