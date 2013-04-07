package com.buscape.developer.result.parser;

import java.util.List;

import com.buscape.developer.Produto;

public abstract class AbstractResultParser {
	
	protected final String data;
	
	/**
	 * Default constructor that indicates the raw data of parser.
	 * @param data the raw data that will be parsed.
	 */
	public AbstractResultParser(String data) {
		this.data = data;
	}
	

	public List<Produto> getProduto(String xml) {
		// TODO Auto-generated method stub
		return null;
	}
}