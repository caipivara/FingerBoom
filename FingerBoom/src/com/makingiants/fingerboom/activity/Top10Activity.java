package com.makingiants.fingerboom.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.makingiants.fingerboom.R;

public class Top10Activity extends Activity {
	
	public static final String EXTRA_COUNTS = "extra_counts";
	
	// --------------------------------
	// Activity overides
	// --------------------------------
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_top10);
		
		//Make die sound
		int idSoundToMake = R.raw.laugth;
		
		int counts = getIntent().getExtras().getInt(EXTRA_COUNTS);
		TextView textInfo = ((TextView) findViewById(R.id.top10_text_info));
		ImageView imageChar = ((ImageView) findViewById(R.id.top10_image_character));
		
		// Set text, image and sound based on counts variable
		if (counts < 10) {
			idSoundToMake = R.raw.wawawa;
			textInfo.setText(getString(R.string.top10_score_text_1));
			imageChar.setImageBitmap(BitmapFactory.decodeResource(getResources(),
			        R.drawable.character_1));
			
		} else if (counts >= 10 && counts < 20) {
			
			idSoundToMake = R.raw.cof;
			textInfo.setText(getString(R.string.top10_score_text_2));
			imageChar.setImageBitmap(BitmapFactory.decodeResource(getResources(),
			        R.drawable.character_2));
			
		} else if (counts >= 20 && counts < 40) {
			
			idSoundToMake = R.raw.pain;
			textInfo.setText(getString(R.string.top10_score_text_3));
			imageChar.setImageBitmap(BitmapFactory.decodeResource(getResources(),
			        R.drawable.character_3));
			
		} else if (counts >= 40 && counts < 50) {
			
			idSoundToMake = R.raw.pitty;
			textInfo.setText(getString(R.string.top10_score_text_4));
			imageChar.setImageBitmap(BitmapFactory.decodeResource(getResources(),
			        R.drawable.character_4));
			
		} else if (counts >= 50 && counts < 70) {
			
			idSoundToMake = R.raw.surprised2;
			textInfo.setText(getString(R.string.top10_score_text_5));
			imageChar.setImageBitmap(BitmapFactory.decodeResource(getResources(),
			        R.drawable.character_5));
			
		} else if (counts >= 70 && counts < 80) {
			
			idSoundToMake = R.raw.laugth;
			textInfo.setText(getString(R.string.top10_score_text_6));
			imageChar.setImageBitmap(BitmapFactory.decodeResource(getResources(),
			        R.drawable.character_6));
			
		} else if (counts >= 80 && counts < 100) {
			
			idSoundToMake = R.raw.applause_ligth;
			textInfo.setText(getString(R.string.top10_score_text_7));
			imageChar.setImageBitmap(BitmapFactory.decodeResource(getResources(),
			        R.drawable.character_1));
			
		} else if (counts >= 100 && counts < 110) {
			
			idSoundToMake = R.raw.surprised;
			textInfo.setText(getString(R.string.top10_score_text_8));
			imageChar.setImageBitmap(BitmapFactory.decodeResource(getResources(),
			        R.drawable.character_2));
			
		} else if (counts >= 110 && counts < 120) {
			
			idSoundToMake = R.raw.applause;
			textInfo.setText(getString(R.string.top10_score_text_9));
			imageChar.setImageBitmap(BitmapFactory.decodeResource(getResources(),
			        R.drawable.character_3));
			
		} else if (counts >= 120 && counts < 130) {
			
			idSoundToMake = R.raw.applause_big;
			textInfo.setText(getString(R.string.top10_score_text_10));
			imageChar.setImageBitmap(BitmapFactory.decodeResource(getResources(),
			        R.drawable.character_4));
			
		} else {
			
			idSoundToMake = R.raw.dream;
			textInfo.setText(getString(R.string.top10_score_text_11));
			imageChar.setImageBitmap(BitmapFactory.decodeResource(getResources(),
			        R.drawable.character_1));
			
		}
		
		((TextView) findViewById(R.id.top10_text_number)).setText("" + counts);
		
		MediaPlayer.create(this, idSoundToMake).start();
	}
	
	// --------------------------------
	// View Events
	// --------------------------------
	
	public void closeOnClick(View view) {
		final Intent newActivity = new Intent(this, GameActivity.class);
		startActivity(newActivity);
	}
}
