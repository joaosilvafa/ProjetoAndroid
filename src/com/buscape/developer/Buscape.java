package com.buscape.developer;

import java.util.List;

import com.buscape.developer.http.HttpRequester;
import com.buscape.developer.request.Filter;
import com.buscape.developer.result.parser.XmlResultParser;

/**
 * Buscapé API wrapper
 * 
 * @author neto
 */
public final class Buscape {

	private final String applicationId;

	private final BuscapeFactory factory;

	private final Filter filter;
	
	private final String format;

	
	
	
	/**
	 * Constructs a wrapper object to Buscapé API, with <code>BRAZIL</code> as
	 * country and <code>XML</code> as default result format.
	 * 
	 * @param applicationId
	 *            identification of application which will use the API.
	 * @param filter
	 *            default filter for all requests made in API.
	 */
	public Buscape(String applicationId, Filter filter) {
		this(applicationId, filter, "br", "XML");
	}
	
	/**
	 * Constructs a wrapper object to Buscapé API, with <code>BRAZIL</code> as
	 * country.
	 * 
	 * @param applicationId
	 *            identification of application which will use the API.
	 * @param filter
	 *            default filter for all requests made in API.
	 * @param format 
	 * 			  default result format of requests.
	 */

	/**
	 * Constructs a wrapper object to Buscapé API.
	 * 
	 * @param applicationId
	 *            identification of application which will use the API. 
	 * @param filter
	 *            default filter for all requests made in API.
	 * @param countryCode
	 *            code of country where the API will be used.            
	 * @param format 
	 * 			  default result format of requests.
	 */
	public Buscape(String applicationId, Filter filter, String countryCode, String format) {
		super();
		this.applicationId = applicationId;
		this.filter = filter;
		this.format = format;
		this.factory = new BuscapeFactory();
	}

	public List<Produto> retornaListaProduto(String keyword) throws BuscapeException {
		
		//monta URL
		String url = "http://sandbox.buscape.com/service/findProductList/564771466d477a4458664d3d/BR/?keyword=" + keyword + "&format=xml";
		String xml = callService(url);
		
		return getListProduto(xml);
		
	}
	
	public Produto retornaProduto(String productId) throws BuscapeException {
		
		//monta URL
		String url = "http://sandbox.buscape.com/service/viewProductDetails/564771466d477a4458664d3d/br/?productId=" + productId + "&amp";
		String xml = callService(url);
		
		return getListProduto(xml).get(0);
		
	}
	
	private String callService(String url) throws BuscapeException {
		try {
			final HttpRequester request = new HttpRequester(url);
			
			return request.getResponse();
		} catch (Exception e) {
			throw new BuscapeException(String.format("Erro on calling service: %s.", url), e); //$NON-NLS-1$
		}
	}
	
	private List<Produto> getListProduto(String data) {
		
		XmlResultParser xml = new XmlResultParser(data);
		
		return xml.getProduto(data);
	}
}