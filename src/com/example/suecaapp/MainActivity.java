package com.example.suecaapp;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;




public class MainActivity extends Activity  {

	
	

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);


	}
	
	  public void chamaTela_Jogo(View v) {
			setContentView(R.layout.jogo);
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

	   public void inicia_Jogo(View v) {
		   
			int face = 0;
			
			face = (int)(1 + Math.random() * 13);

			        ImageView imgCarta = (ImageView) findViewById(R.id.carta);
		    
			        if (face==1) imgCarta.setImageResource(R.drawable.paus_01);
					else if (face==2) imgCarta.setImageResource(R.drawable.paus_02);
					else if (face==3) imgCarta.setImageResource(R.drawable.paus_03);
					else if (face==4) imgCarta.setImageResource(R.drawable.paus_04);
					else if (face==5) imgCarta.setImageResource(R.drawable.paus_05);
					else if (face==6) imgCarta.setImageResource(R.drawable.paus_06);
					else if (face==7) imgCarta.setImageResource(R.drawable.paus_07);
					else if (face==8) imgCarta.setImageResource(R.drawable.paus_08);
					else if (face==9) imgCarta.setImageResource(R.drawable.paus_09);
					else if (face==10) imgCarta.setImageResource(R.drawable.paus_10);
					else if (face==11) imgCarta.setImageResource(R.drawable.paus_11);
					else if (face==12) imgCarta.setImageResource(R.drawable.paus_12);
					else if (face==13) imgCarta.setImageResource(R.drawable.paus_13);
		        
			
	   }
		        

	

}