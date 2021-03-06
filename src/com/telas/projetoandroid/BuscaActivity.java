package com.telas.projetoandroid;

import java.util.ArrayList;
import java.util.List;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

import com.adapter.projetoandroid.ProdutoAdapter;
import com.buscape.developer.Buscape;
import com.buscape.developer.BuscapeException;
import com.buscape.developer.Produto;
import com.buscape.developer.request.Filter;
import com.example.projetoandroid.R;

public class BuscaActivity extends ListActivity {

	private static final String applicationId = "564771466d477a4458664d3d";
	private static String keyWord;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Intent it = getIntent();
		keyWord = it.getStringExtra("keyWord");
		
		verificarEspacos();
		
		List<Produto> produtos = new ArrayList<Produto>();
		Buscape buscape = new Buscape(applicationId, new Filter());
		try {
			produtos = buscape.retornaListaProduto(keyWord);
		} catch (BuscapeException e) {
			e.printStackTrace();
		}

		if (!produtos.isEmpty()) {
			setListAdapter(new ProdutoAdapter(this, produtos));
		}
		else{
			
			final Intent ita = new Intent(this, MainActivity.class);
			ita.putExtra("erro", "erro");
			startActivity(ita);
		}
	}
	
	private void verificarEspacos(){
		
		if(keyWord !=null && keyWord.contains(" ")){
			keyWord = keyWord.replace(" ", "%20");
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		Produto produto = (Produto) this.getListAdapter().getItem(position);
		final Intent it = new Intent(this, ProdutoActivity.class);
		it.putExtra("id", produto.getId());
		startActivity(it);

	}
}
