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
	private Texture enemyImage;
	private OrthographicCamera camera;
	private Rectangle player;
	
	@Override
	public void create () {
		camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);
		batch = new SpriteBatch();

		playerImage = new Texture(Gdx.files.internal("Player/p1_front.png"));
		enemyImage = new Texture(Gdx.files.internal("Enemies/blockerMad.png"));

		player = new Rectangle();
		player.x = 100;
		player.y = 100;
		player.width = 66;
		player.height = 92;

	}

	@Override
	public void render () {
		ScreenUtils.clear(0, 0, 0.2f, 1);

		camera.update();
		batch.setProjectionMatrix(camera.combined);

		batch.begin();
		batch.draw(playerImage, player.x, player.y);
		batch.end();

		if(Gdx.input.isKeyPressed(Keys.LEFT)) player.x -= 200 * Gdx.graphics.getDeltaTime();
        if(Gdx.input.isKeyPressed(Keys.RIGHT)) player.x += 200 * Gdx.graphics.getDeltaTime();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		playerImage.dispose();
	}
}
