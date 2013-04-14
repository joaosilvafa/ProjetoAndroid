package com.telas.projetoandroid;

import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.adapter.projetoandroid.ProdutoPeriodicoAdapter;
import com.android.service.projetoandroid.ProdutoService;
import com.buscape.developer.Produto;
import com.dao.projetoandroid.DataHelper;
import com.example.projetoandroid.R;

public class MainActivity extends Activity {

	List<Produto> produtos;
	ListView lista;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Intent ita = getIntent();
		String erro = ita.getStringExtra("erro");
		
		if(erro != null && !erro.isEmpty()){
			Toast.makeText(this, "Produto não encontrado!", Toast.LENGTH_LONG).show();
		}
		
		final Intent it = new Intent(this, BuscaActivity.class);
		final EditText textProduto = (EditText) findViewById(R.id.editText1);

		Button button = (Button) findViewById(R.id.button1);
		button.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View arg0) {
				String produto = textProduto.getText().toString();
				if (produto != null && !produto.isEmpty()) {
					it.putExtra("keyWord", produto);
					startActivity(it);
				}
			}
		});

		lista = (ListView) findViewById(R.id.listView1);

		DataHelper dh = new DataHelper(this);
		produtos = dh.selectAll();

		ProdutoPeriodicoAdapter adapter = new ProdutoPeriodicoAdapter(this,
				produtos);

		// ArrayAdapter<Produto> fileList = new ArrayAdapter<Produto>(this,
		// android.R.layout.simple_list_item_1, produtos); //cria o modelo
		lista.setAdapter(adapter);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		
		menu.addSubMenu(0, 0, 0, "Executar busca automática");
		
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
		
    	switch (item.getItemId()) {
    	case 0:
    		ProdutoService processo = new ProdutoService(this);
            processo.execute("2");
            Toast.makeText(this, "Busca automática está executando em segundo plano !", Toast.LENGTH_LONG).show();
    	}
    	return true;
	}

}
