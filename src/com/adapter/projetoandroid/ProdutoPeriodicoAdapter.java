package com.adapter.projetoandroid;

import java.util.List;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.androidquery.AQuery;
import com.androidquery.callback.AjaxStatus;
import com.androidquery.callback.BitmapAjaxCallback;
import com.buscape.developer.Produto;
import com.example.projetoandroid.R;

public class ProdutoPeriodicoAdapter extends BaseAdapter{

	private Context context;
	private List<Produto> lista;
	
	public ProdutoPeriodicoAdapter(Context context, List<Produto> lista){
		this.context = context;
		this.lista = lista;
	}
	
	public int getCount() {
		return lista.size();
	}

	public Object getItem(int position) {
		return lista.get(position);
	}

 	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int posicao, View convertView, ViewGroup parent) {
		//Recupera o produto da posição atual
		Produto produto = lista.get(posicao);
		LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View v = inflater.inflate(R.layout.activity_produto_periodico, null);
		TextView textProduto = (TextView) v.findViewById(R.id.produtoPeriodico);
		TextView textPrecoMin = (TextView) v.findViewById(R.id.precoMinPeriodico);
		textProduto.setText(produto.getProductName());
		textPrecoMin.setText(produto.getPriceMin());
		
	    ImageView imageview = (ImageView) v.findViewById(R.id.imgProdutoPeriodico);
        AQuery aq = new AQuery(convertView);

        String imageUrl = produto.getThumbnail();

       aq.id(imageview).progress(this).image(imageUrl, true, true, 0, 0, new BitmapAjaxCallback(){

                @Override
                public void callback(String url, ImageView iv, Bitmap bm, AjaxStatus status){

                    iv.setImageBitmap(bm);
                }
        });
		
		return v;	
	}
}
