package com.example.suecaapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;


public class MainActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	  public void chamaTela_Creditos(View v) {
			setContentView(R.layout.creditos);
					}
	  

	public void chamaTela_Menu(View v) {
		    setContentView(R.layout.activity_main);
		}
	
	public void chamaTela_Instrucoes(View v) {
	    setContentView(R.layout.instrucoes);
	}
	


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

}