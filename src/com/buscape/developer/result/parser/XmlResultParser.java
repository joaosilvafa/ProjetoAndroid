package com.buscape.developer.result.parser;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

import android.util.Log;

import com.buscape.developer.Produto;

/**
 * Implementation of AbstractResultParser that parses data in XML format to Result.
 */
public final class XmlResultParser extends AbstractResultParser {
	
	static final String KEY_PRODUTO = "product";
	static final String KEY_PRODUTO_NAME = "productName";
	static final String KEY_PRODUTO_SHNAME = "productShortName";
	static final String KEY_PRODUTO_PRICEMIN = "priceMin";
	static final String KEY_PRODUTO_PRICEMAX = "priceMax";
	static final String KEY_THUMBNAIL = "thumbnail";
	
	public XmlResultParser(String data) {
		super(data);
	}
	
	/**
	 * Creates an instance of {@link XmlResultParser} with provided data.
	 * @param data the raw data, in XML, that will be parsed.
	 * @return a new instance of {@link XmlResultParser},
	 */
	public static AbstractResultParser createInstance(String data) {
		return new XmlResultParser(data);
	}
	
	@Override
	public List<Produto> getProduto(String xml) {

		Document doc = getDomElement(xml); // getting DOM element
		ArrayList<HashMap<String, String>> menuItems = new ArrayList<HashMap<String, String>>();
		
		NodeList nl = doc.getElementsByTagName(KEY_PRODUTO);
		// looping through all item nodes <item>
		for (int i = 0; i < nl.getLength(); i++) {
			// creating new HashMap
			HashMap<String, String> map = new HashMap<String, String>();
			Element e = (Element) nl.item(i);
			// adding each child node to HashMap key => value
			map.put(KEY_PRODUTO_NAME, getValue(e, KEY_PRODUTO_NAME));
			map.put(KEY_PRODUTO_SHNAME, getValue(e, KEY_PRODUTO_SHNAME));
			map.put(KEY_PRODUTO_PRICEMIN, getValue(e, KEY_PRODUTO_PRICEMIN));
			map.put(KEY_PRODUTO_PRICEMAX, getValue(e, KEY_PRODUTO_PRICEMAX));
			map.put(KEY_THUMBNAIL, getValue(e, KEY_THUMBNAIL));

			// adding HashList to ArrayList
			menuItems.add(map);
		}

		List<Produto> listProduto = new ArrayList<Produto>();

		for (HashMap<String, String> iten : menuItems) {
			Produto produtoNovo = new Produto();
			produtoNovo.setProductName(iten.get(KEY_PRODUTO_NAME));
			produtoNovo.setProductShortName(iten.get(KEY_PRODUTO_SHNAME));
			produtoNovo.setPriceMin(iten.get(KEY_PRODUTO_PRICEMIN));
			produtoNovo.setPriceMax(iten.get(KEY_PRODUTO_PRICEMAX));
			produtoNovo.setThumbnail(iten.get(KEY_THUMBNAIL));

			listProduto.add(produtoNovo);
		}
		
		return listProduto;
	}
	
	
	public Document getDomElement(String xml) {
		Document doc = null;
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		try {

			DocumentBuilder db = dbf.newDocumentBuilder();

			InputSource is = new InputSource();
			is.setCharacterStream(new StringReader(xml));
			doc = db.parse(is);

		} catch (ParserConfigurationException e) {
			Log.e("Error: ", e.getMessage());
			return null;
		} catch (SAXException e) {
			Log.e("Error: ", e.getMessage());
			return null;
		} catch (IOException e) {
			Log.e("Error: ", e.getMessage());
			return null;
		}
		// return DOM
		return doc;
	}

	public String getValue(Element item, String str) {
		NodeList n = item.getElementsByTagName(str);
		return this.getElementValue(n.item(0));
	}

	public final String getElementValue(Node elem) {
		Node child;
		if (elem != null) {
			if (elem.hasChildNodes()) {
				for (child = elem.getFirstChild(); child != null; child = child
						.getNextSibling()) {
					if (child.getNodeType() == Node.TEXT_NODE) {
						return child.getNodeValue();
					}
				}
			}
		}
		return "";
	}

}
