package com.first;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Display extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.display);
		
		TextView view = (TextView) findViewById(R.id.view);
		String message = getIntent().getStringExtra("Message");
		view.setTextSize(40);
		view.setText(message);
		
	}

}
