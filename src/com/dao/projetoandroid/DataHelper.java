package com.dao.projetoandroid;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import android.util.Log;

import com.buscape.developer.Buscape;
import com.buscape.developer.BuscapeException;
import com.buscape.developer.Produto;
import com.buscape.developer.request.Filter;

public class DataHelper {

	private static final String DATABASE_NAME = "dbProduto.db";
	private static final int DATABASE_VERSION = 1;
	private static final String TABLE_NAME = "Produto";
	private static final String applicationId = "564771466d477a4458664d3d";

	private Context context;
	private SQLiteDatabase db;

	private SQLiteStatement insertStmt;
	private static final String INSERT = "INSERT INTO "
			+ TABLE_NAME
			+ " (TEMPO_LOOP, ID_PRODUTO, PRECO_ANT, IMG_PRODUTO, NOME_PRODUTO) VALUES(?, ?, ?, ?, ?)";
	
	public DataHelper(Context context) {
		this.context = context;
		OpenHelper openHelper = new OpenHelper(this.context);
		this.db = openHelper.getWritableDatabase();
		this.insertStmt = this.db.compileStatement(INSERT);
	}

	public long insert(Produto produto, String horas) {
		this.insertStmt.bindString(1, horas);
		this.insertStmt.bindString(2, produto.getId());
		this.insertStmt.bindString(3, produto.getPriceMin());
		this.insertStmt.bindString(4, produto.getThumbnail());
		this.insertStmt.bindString(5, produto.getProductName());
		return this.insertStmt.executeInsert();
	}

	public void deleteAll() {
		this.db.delete(TABLE_NAME, null, null);
	}

	private static class OpenHelper extends SQLiteOpenHelper {

		OpenHelper(Context context) {
			super(context, DATABASE_NAME, null, DATABASE_VERSION);
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			db.execSQL("CREATE TABLE IF NOT EXISTS " + TABLE_NAME
					+ " (ID_PRODUTO VARCHAR2(7) PRIMARY KEY,"
					+ " NOME_PRODUTO VARCHAR2(80) NOT NULL,"
					+ " IMG_PRODUTO VARCHAR2(120), " + " PRECO_ANT INTEGER, "
					+ " PRECO_ATUAL INTEGER, LOJA_ANT VARCHAR2(50),"
					+ " LOJA_ATUAL VARCHAR2(50),"
					+ " TEMPO_LOOP INTEGER NOT NULL)");
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			Log.w("Example",
					"Upgrading database, this will drop tables and recreate.");
			db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
			onCreate(db);
		}
	}

	public List<Produto> selectAll() {

		Produto produto;
		List<Produto> list = new ArrayList<Produto>();
		Cursor c = this.db.query(TABLE_NAME, new String[] { "ID_PRODUTO",
				"PRECO_ANT", "TEMPO_LOOP", "NOME_PRODUTO", "IMG_PRODUTO" },
				null, null, null, null, null);
		if (c.moveToNext()) {
			do {
				produto = new Produto();
				produto.setId(c.getString(c.getColumnIndex("ID_PRODUTO")));
				produto.setProductName(c.getString(c
						.getColumnIndex("NOME_PRODUTO")));
				produto.setPriceMin(c.getString(c.getColumnIndex("PRECO_ANT")));
				produto.setThumbnail(c.getString(c
						.getColumnIndex("IMG_PRODUTO")));
				produto.setTempoLoop(c.getString(c.getColumnIndex("TEMPO_LOOP")));
				list.add(produto);
			} while (c.moveToNext());
		}

		if (c != null && !c.isClosed()) {
			c.close();
		}

		return list;
	}
	
	/**
	 * Método responável por verificar se algum produto da lista possúi um preço
	 * menor.
	 */
	public List<Produto> verificaMudancaPreco() {

		List<Produto> produtosBanco = selectAll();
		List<Produto> produtosAlterados = new ArrayList<Produto>();
		Buscape buscape = new Buscape(applicationId, new Filter());
		for (Produto produtoBanco : produtosBanco) {
			Produto produtoNovo = new Produto();
			try {
				produtoNovo = buscape.retornaProduto(produtoBanco.getId());
			} catch (BuscapeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			float precoAntigo = Float.parseFloat(produtoBanco.getPriceMin());
			float precoNovo = Float.parseFloat(produtoNovo.getPriceMin());
			if (precoNovo < precoAntigo) {
				produtosAlterados.add(produtoNovo);
			}
		}
		
		return produtosAlterados;

	}

}
