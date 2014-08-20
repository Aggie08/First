package com.first;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.EditText;

public class Main extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
	}
	
	public void send(){
		Intent intent = new Intent(this, Display.class);
		EditText edit = (EditText) findViewById(R.id.edit);
		String text = edit.getText().toString();
		intent.putExtra("Message", text);
		startActivity(intent);
	}

}
