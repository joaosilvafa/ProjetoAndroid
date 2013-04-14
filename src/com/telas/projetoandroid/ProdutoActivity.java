package com.telas.projetoandroid;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.buscape.developer.Buscape;
import com.buscape.developer.BuscapeException;
import com.buscape.developer.Produto;
import com.buscape.developer.request.Filter;
import com.dao.projetoandroid.DataHelper;
import com.example.projetoandroid.R;
import com.sun.activation.viewers.TextEditor;

public class ProdutoActivity extends Activity {

	private static final String applicationId = "564771466d477a4458664d3d";
	private static Produto produto;
	
	private DataHelper dh;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_produto);

		// Recupera produto passado por intent
		Intent it = getIntent();

		produto = new Produto();

		Buscape buscape = new Buscape(applicationId, new Filter());
		try {
			produto = buscape.retornaProduto(it.getStringExtra("id"));
		} catch (BuscapeException e) {
			e.printStackTrace();
		}

		TextView textProduto = (TextView) findViewById(R.id.textProdutosDetalhes);
		textProduto.setText(produto.getProductShortName());
		TextView textPrecoMin = (TextView) findViewById(R.id.precoMinDtl);
		textPrecoMin.setText(produto.getPriceMin());
		TextView textPrecoMax = (TextView) findViewById(R.id.precoMaxDtl);
		textPrecoMax.setText(produto.getPriceMax());
		ImageView imageview = (ImageView) findViewById(R.id.imgProdutoDetalhes);
		String imageUrl = produto.getThumbnail();
		
		 Bitmap bitmap = DownloadImage(imageUrl);
	     imageview.setImageBitmap(bitmap);

	}
	
	public void onClick(View v){
		
		final EditText horas = (EditText) findViewById(R.id.edtHoras);
		
		this.dh = new DataHelper(this);
        this.dh.insert(produto, horas.toString());
		
        final Intent it = new Intent(this, MainActivity.class);
		startActivity(it);
	}
	
	public void onClear(View v){
		
		EditText edt = (EditText) findViewById(R.id.editText1);
		edt.setText("");
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
	 private InputStream OpenHttpConnection(String urlString) throws IOException {
	        InputStream in = null;
	        int response = -1;

	        URL url = new URL(urlString);
	        URLConnection conn = url.openConnection();

	        if (!(conn instanceof HttpURLConnection))
	            throw new IOException("Not an HTTP connection");

	        try {
	            HttpURLConnection httpConn = (HttpURLConnection) conn;
	            httpConn.setAllowUserInteraction(false);
	            httpConn.setInstanceFollowRedirects(true);
	            httpConn.setRequestMethod("GET");
	            httpConn.connect();
	            response = httpConn.getResponseCode();
	            if (response == HttpURLConnection.HTTP_OK) {
	                in = httpConn.getInputStream();
	            }
	        } catch (Exception ex) {
	            throw new IOException("Error connecting");
	        }
	        return in;
	    }

	    private Bitmap DownloadImage(String URL) {
	        Bitmap bitmap = null;
	        InputStream in = null;
	        try {
	            in = OpenHttpConnection(URL);
	            bitmap = BitmapFactory.decodeStream(in);
	            in.close();
	        } catch (IOException e1) {
	            // TODO Auto-generated catch block
	            e1.printStackTrace();
	        }
	        return bitmap;
	    }

}
