package com.alecvd.refresh;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.TimeUtils;

public class Refresh extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture playerImage;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		playerImage = new Texture(Gdx.files.internal("Player/p1_front.png"));
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
		batch.begin();
		batch.draw(playerImage, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		playerImage.dispose();
	}
}
