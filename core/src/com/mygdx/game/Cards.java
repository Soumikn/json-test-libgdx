package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Interpolation;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.Json;
import com.badlogic.gdx.utils.JsonReader;
import com.badlogic.gdx.utils.JsonValue;

import static com.badlogic.gdx.net.HttpRequestBuilder.json;


public class Cards extends ApplicationAdapter {


private Stage stage;
public static AssetManager manager;
	private com.badlogic.gdx.scenes.scene2d.ui.Image image;





	@Override
	public void create () {
		stage=new Stage();

		Gdx.input.setInputProcessor(stage);
		manager=new AssetManager();



		manager.load("badlogic.jpg",Texture.class);
		manager.finishLoading();
		image=new com.badlogic.gdx.scenes.scene2d.ui.Image(manager.get("badlogic.jpg",Texture.class));

		image.setBounds(20,30,300,200);

		image.addAction(Actions.sequence(Actions.moveTo(30,200),Actions.rotateBy(300,200)));
		image.addAction(Actions.sequence(Actions.moveTo(30,200),Actions.rotateBy(300,200)));
		image.addAction(Actions.sequence(Actions.moveTo(30,200),Actions.rotateBy(300,200)));


			stage.addActor(image);

		JsonReader temp= new JsonReader();
		JsonValue base =temp.parse(Gdx.files.internal("pets.json"));

		JsonValue pets = base.get("pets");
		System.out.println(pets);

		}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		super.render();

		stage.act(Gdx.graphics.getDeltaTime());
		stage.draw();

	}
}
