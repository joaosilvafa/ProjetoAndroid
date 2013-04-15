package com.android.service.projetoandroid;

import java.util.List;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;

import com.buscape.developer.Produto;
import com.dao.projetoandroid.DataHelper;

public class ProdutoService extends AsyncTask<String, String, Void> {

	private ProgressDialog progress;
	private Context context;
	private DataHelper dh;

	public ProdutoService(Context context) {
		this.context = context;
	}

	@Override
	protected Void doInBackground(String... params) {

		int tempo = Integer.parseInt(params[0]);
		tempo = tempo * 60 * 1000;
		dh = new DataHelper(context);

		while (tempo > 0) {
			try {
				Thread.sleep(tempo);
				List<Produto> produtos = dh.verificaMudancaPreco();
				if (!produtos.isEmpty()) {
					tempo = 0;
					// Chama método para emitir notificação e parar a busca periodica
					// Atualiza nova lista de produtos no banco
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return null;
	}


	@Override
	protected void onProgressUpdate(String... values) {
		// Atualiza mensagem
		progress.setMessage(values[0]);
	}
}
