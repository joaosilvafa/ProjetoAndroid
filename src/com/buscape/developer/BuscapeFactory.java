package com.buscape.developer;

import com.buscape.developer.result.parser.AbstractResultParser;
import com.buscape.developer.result.parser.XmlResultParser;

/**
 * Factory of objects used by the API wrapper
 * 
 * @author neto
 */
final class BuscapeFactory {
	
	/**
	 * Creates an instance of {@link AbstractResultParser} used to parse, 
	 * from chosen format, results from requests.
	 * @param data raw data, in chosen format, that will be parsed. 
	 * @param format the format of data.
	 * @return an instance equivalent to format chosen.
	 */
	public AbstractResultParser createParser(String data, String format){
		AbstractResultParser builder = null;

		builder = XmlResultParser.createInstance(data);

		return builder;
	}
}