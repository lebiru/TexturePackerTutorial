package com.me.TexturePackerTutorial;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class TexturePackerTutorial extends Game {
	private OrthographicCamera camera;
	SpriteBatch batch;
	BitmapFont font;
	public float w;
	public float h;
	private MainScreen main;
	
	public void create() 
	{		
		
		batch = new SpriteBatch();
		camera = new OrthographicCamera();
		
		
		//use libgdx's default Arial font.
		font = new BitmapFont();
		
		main = new MainScreen(batch);
		
		this.setScreen(main);
		
		

	}

	@Override
	public void dispose() {
		batch.dispose();
	}

	public void render() 
	{		
		super.render();
	}

	@Override
	public void resize(int width, int height) 
	{
		
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}


}
