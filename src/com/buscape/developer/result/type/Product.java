//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.6 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: PM.02.21 às 10:05:31 PM BRT 
//


package com.buscape.developer.result.type;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ProductType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="productName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productShortName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="currency" type="{urn:buscape}CurrencyType"/>
 *         &lt;element name="priceMin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="priceMax" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="links" type="{urn:buscape}LinksType"/>
 *         &lt;element name="thumbnail" type="{urn:buscape}ThumbnailType"/>
 *         &lt;element name="rating" type="{urn:buscape}RatingType"/>
 *         &lt;element name="specification" type="{urn:buscape}SpecificationType"/>
 *         &lt;element name="productDetails" type="{urn:buscape}ProductDetailsType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="fullDescription" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="totalSellers" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="categoryId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="hasMetaSearch" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="eco" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductType", propOrder = {
    "productName",
    "productShortName",
    "currency",
    "priceMin",
    "priceMax",
    "links",
    "thumbnail",
    "rating",
    "specification",
    "productDetails"
})
public class Product
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String productName;
    @XmlElement(required = true)
    protected String productShortName;
    @XmlElement(required = true)
    protected Currency currency;
    @XmlElement(required = true)
    protected String priceMin;
    @XmlElement(required = true)
    protected String priceMax;
    @XmlElement(required = true)
    protected Links links;
    @XmlElement(required = true)
    protected Thumbnail thumbnail;
    @XmlElement(required = true)
    protected Rating rating;
    @XmlElement(required = true)
    protected Specification specification;
    @XmlElement(required = true)
    protected ProductDetails productDetails;
    @XmlAttribute(name = "fullDescription", required = true)
    protected boolean fullDescription;
    @XmlAttribute(name = "totalSellers", required = true)
    protected int totalSellers;
    @XmlAttribute(name = "categoryId", required = true)
    protected int categoryId;
    @XmlAttribute(name = "hasMetaSearch", required = true)
    protected boolean hasMetaSearch;
    @XmlAttribute(name = "eco", required = true)
    protected boolean eco;
    @XmlAttribute(name = "id", required = true)
    protected long id;

    /**
     * Obtém o valor da propriedade productName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Define o valor da propriedade productName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductName(String value) {
        this.productName = value;
    }

    /**
     * Obtém o valor da propriedade productShortName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductShortName() {
        return productShortName;
    }

    /**
     * Define o valor da propriedade productShortName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductShortName(String value) {
        this.productShortName = value;
    }

    /**
     * Obtém o valor da propriedade currency.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Define o valor da propriedade currency.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }

    /**
     * Obtém o valor da propriedade priceMin.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceMin() {
        return priceMin;
    }

    /**
     * Define o valor da propriedade priceMin.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceMin(String value) {
        this.priceMin = value;
    }

    /**
     * Obtém o valor da propriedade priceMax.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceMax() {
        return priceMax;
    }

    /**
     * Define o valor da propriedade priceMax.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceMax(String value) {
        this.priceMax = value;
    }

    /**
     * Obtém o valor da propriedade links.
     * 
     * @return
     *     possible object is
     *     {@link Links }
     *     
     */
    public Links getLinks() {
        return links;
    }

    /**
     * Define o valor da propriedade links.
     * 
     * @param value
     *     allowed object is
     *     {@link Links }
     *     
     */
    public void setLinks(Links value) {
        this.links = value;
    }

    /**
     * Obtém o valor da propriedade thumbnail.
     * 
     * @return
     *     possible object is
     *     {@link Thumbnail }
     *     
     */
    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    /**
     * Define o valor da propriedade thumbnail.
     * 
     * @param value
     *     allowed object is
     *     {@link Thumbnail }
     *     
     */
    public void setThumbnail(Thumbnail value) {
        this.thumbnail = value;
    }

    /**
     * Obtém o valor da propriedade rating.
     * 
     * @return
     *     possible object is
     *     {@link Rating }
     *     
     */
    public Rating getRating() {
        return rating;
    }

    /**
     * Define o valor da propriedade rating.
     * 
     * @param value
     *     allowed object is
     *     {@link Rating }
     *     
     */
    public void setRating(Rating value) {
        this.rating = value;
    }

    /**
     * Obtém o valor da propriedade specification.
     * 
     * @return
     *     possible object is
     *     {@link Specification }
     *     
     */
    public Specification getSpecification() {
        return specification;
    }

    /**
     * Define o valor da propriedade specification.
     * 
     * @param value
     *     allowed object is
     *     {@link Specification }
     *     
     */
    public void setSpecification(Specification value) {
        this.specification = value;
    }

    /**
     * Obtém o valor da propriedade productDetails.
     * 
     * @return
     *     possible object is
     *     {@link ProductDetails }
     *     
     */
    public ProductDetails getProductDetails() {
        return productDetails;
    }

    /**
     * Define o valor da propriedade productDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDetails }
     *     
     */
    public void setProductDetails(ProductDetails value) {
        this.productDetails = value;
    }

    /**
     * Obtém o valor da propriedade fullDescription.
     * 
     */
    public boolean isFullDescription() {
        return fullDescription;
    }

    /**
     * Define o valor da propriedade fullDescription.
     * 
     */
    public void setFullDescription(boolean value) {
        this.fullDescription = value;
    }

    /**
     * Obtém o valor da propriedade totalSellers.
     * 
     */
    public int getTotalSellers() {
        return totalSellers;
    }

    /**
     * Define o valor da propriedade totalSellers.
     * 
     */
    public void setTotalSellers(int value) {
        this.totalSellers = value;
    }

    /**
     * Obtém o valor da propriedade categoryId.
     * 
     */
    public int getCategoryId() {
        return categoryId;
    }

    /**
     * Define o valor da propriedade categoryId.
     * 
     */
    public void setCategoryId(int value) {
        this.categoryId = value;
    }

    /**
     * Obtém o valor da propriedade hasMetaSearch.
     * 
     */
    public boolean isHasMetaSearch() {
        return hasMetaSearch;
    }

    /**
     * Define o valor da propriedade hasMetaSearch.
     * 
     */
    public void setHasMetaSearch(boolean value) {
        this.hasMetaSearch = value;
    }

    /**
     * Obtém o valor da propriedade eco.
     * 
     */
    public boolean isEco() {
        return eco;
    }

    /**
     * Define o valor da propriedade eco.
     * 
     */
    public void setEco(boolean value) {
        this.eco = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

}
