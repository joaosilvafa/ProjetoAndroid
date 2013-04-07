package com.adapter.projetoandroid;

import java.util.List;

import com.buscape.developer.Produto;
import com.example.projetoandroid.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ProdutoAdapter extends BaseAdapter{

	private Context context;
	private List<Produto> lista;
	
	public ProdutoAdapter(Context context, List<Produto> lista){
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
		View v = inflater.inflate(R.layout.activity_busca, null);
		TextView textProduto = (TextView) v.findViewById(R.id.produto);
		TextView textPrecoMin = (TextView) v.findViewById(R.id.precoMin);
		TextView textPrecoMax = (TextView) v.findViewById(R.id.precoMax);
		textProduto.setText(produto.getProductShortName());
		textPrecoMin.setText(produto.getPriceMin());
		textPrecoMax.setText(produto.getPriceMax());
		
//		ImageView img = (ImageView) v.findViewById(R.id.imgProduto);
//		img.setI(produto.getThumbnail());
		
		return v;
		
	}

}
