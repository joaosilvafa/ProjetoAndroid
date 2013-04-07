package com.telas.projetoandroid;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

import com.buscape.developer.Buscape;
import com.buscape.developer.BuscapeException;
import com.buscape.developer.Produto;
import com.buscape.developer.request.Filter;
import com.example.projetoandroid.R;
public class BuscaActivity extends Activity {

	private static final String applicationId = "564771466d477a4458664d3d";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_busca);
		
		Intent it = getIntent();
		String keyWord = it.getStringExtra("keyWord");

		List<Produto> produtos = new ArrayList<Produto>();
		Buscape buscape = new Buscape(applicationId, new Filter());
		try {
			produtos = buscape.retornaListaProduto(keyWord);
		} catch (BuscapeException e) {
			e.printStackTrace();
		}
		final TextView text = (TextView) findViewById(R.id.textView1);
		
		text.setText(produtos.get(0).getProductShortName());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
