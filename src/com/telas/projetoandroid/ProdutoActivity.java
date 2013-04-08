package com.telas.projetoandroid;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidquery.AQuery;
import com.androidquery.callback.AjaxStatus;
import com.androidquery.callback.BitmapAjaxCallback;
import com.buscape.developer.Buscape;
import com.buscape.developer.BuscapeException;
import com.buscape.developer.Produto;
import com.buscape.developer.request.Filter;
import com.example.projetoandroid.R;
public class ProdutoActivity extends Activity {
	
	private Context context;
	private static final String applicationId = "564771466d477a4458664d3d";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//Recupera produto passado por intent
		Intent it = getIntent();

		Produto produto = new Produto();
		context = this;
		
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View v = inflater.inflate(R.layout.activity_produto, null);
		
		Buscape buscape = new Buscape(applicationId, new Filter());
		try {
			produto = buscape.retornaProduto(it.getStringExtra("id"));
		} catch (BuscapeException e) {
			e.printStackTrace();
		}
		
		TextView textProduto = (TextView) v.findViewById(R.id.textProdutosDetalhes);
		textProduto.setText(produto.getProductShortName());
		
		ImageView imageview = (ImageView) v.findViewById(R.id.imgProdutoDetalhes);
		AQuery aq = new AQuery(new View(context));

		
		String imageUrl = produto.getThumbnail();

		aq.id(imageview).progress(this)
				.image(imageUrl, true, true, 0, 0, new BitmapAjaxCallback() {

					@Override
					public void callback(String url, ImageView iv, Bitmap bm,
							AjaxStatus status) {

						iv.setImageBitmap(bm);

					}
				});
		
		setContentView(R.layout.activity_produto);
	
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
}
