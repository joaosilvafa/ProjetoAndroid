package com.telas.projetoandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.projetoandroid.R;
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final Intent it = new Intent(this, BuscaActivity.class);
		final EditText textProduto = (EditText) findViewById(R.id.editText1);
		if(textProduto != null){
			Button button = (Button) findViewById(R.id.button1);
			button.setOnClickListener(new Button.OnClickListener() {
				public void onClick(View arg0) {
					String produto = textProduto.getText().toString();
					it.putExtra("keyWord", produto);
					startActivity(it);
				}
			});
			
		}else{
			
			//Tratamento de erro quando usuário não digita texto
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
}
