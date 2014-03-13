package com.me.TexturePackerTutorial;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class MainScreen implements Screen
{
	SpriteBatch batch;
	private TextureAtlas atlas = new TextureAtlas();
	private TextureRegion hero = new TextureRegion();
	TextureRegion heroRegion;
	Animation heroAnimation;
	AnimatedSprite heroAnimatedSprite;
	
	public MainScreen(SpriteBatch batch) 
	{
		this.batch = batch;
		atlas = new TextureAtlas("Atlas.txt");
		heroRegion = atlas.findRegion("hero_ALPHA");
		TextureRegion[][] heroTR = heroRegion.split(100, 150);
		heroAnimation = new Animation(0.1f, heroTR[0]);
		heroAnimation.setPlayMode(Animation.LOOP_PINGPONG);
		heroAnimatedSprite = new AnimatedSprite(heroAnimation);
		heroAnimatedSprite.play();

	}

	@Override
	public void render(float delta) 
	{
		Gdx.gl.glClearColor(0.5f, 0.5f, 1.0f, 1); // 1 Alpha = no transparency
		Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
		
		batch.begin();
		heroAnimatedSprite.draw(batch);
		batch.end();
		
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

}
