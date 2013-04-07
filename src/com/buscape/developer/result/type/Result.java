//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.6 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: PM.02.21 às 10:05:31 PM BRT 
//


package com.buscape.developer.result.type;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="details" type="{urn:buscape}ResultDetails"/>
 *         &lt;element name="category" type="{urn:buscape}CategoryType"/>
 *         &lt;element name="subCategory" type="{urn:buscape}CategoryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="top5Category" type="{urn:buscape}CategoryType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="product" type="{urn:buscape}ProductType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="offer" type="{urn:buscape}OfferType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="user" type="{urn:buscape}UserType" minOccurs="0"/>
 *         &lt;element name="opinions" type="{urn:buscape}UserOpinionType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="seller" type="{urn:buscape}SellerType" minOccurs="0"/>
 *         &lt;element name="sellers" type="{urn:buscape}SellersType" minOccurs="0"/>
 *         &lt;element name="fullProduct" type="{urn:buscape}FullProductType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="totalResultsAvailable" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="totalResultsReturned" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="totalResultsSellers" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="totalPages" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="totalRecommended" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="totalNotRecommended" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="page" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="match" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "details",
    "category",
    "subCategories",
    "top5Categories",
    "products",
    "offers",
    "user",
    "opinions",
    "seller",
    "sellers",
    "fullProducts"
})
@XmlRootElement(name = "Result")
public class Result
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected ResultDetails details;
    @XmlElement(required = true)
    protected Category category;
    @XmlElement(name = "subCategory")
    protected List<Category> subCategories;
    @XmlElement(name = "top5Category")
    protected List<Category> top5Categories;
    @XmlElement(name = "product")
    protected List<Product> products;
    @XmlElement(name = "offer")
    protected List<Offer> offers;
    protected User user;
    protected List<UserOpinion> opinions;
    protected Seller seller;
    protected Sellers sellers;
    @XmlElement(name = "fullProduct")
    protected List<FullProduct> fullProducts;
    @XmlAttribute(name = "totalResultsAvailable", required = true)
    protected int totalResultsAvailable;
    @XmlAttribute(name = "totalResultsReturned", required = true)
    protected int totalResultsReturned;
    @XmlAttribute(name = "totalResultsSellers")
    protected Integer totalResultsSellers;
    @XmlAttribute(name = "totalPages")
    protected Integer totalPages;
    @XmlAttribute(name = "totalRecommended")
    protected Integer totalRecommended;
    @XmlAttribute(name = "totalNotRecommended")
    protected Integer totalNotRecommended;
    @XmlAttribute(name = "page")
    protected Integer page;
    @XmlAttribute(name = "match")
    protected String match;

    /**
     * Obtém o valor da propriedade details.
     * 
     * @return
     *     possible object is
     *     {@link ResultDetails }
     *     
     */
    public ResultDetails getDetails() {
        return details;
    }

    /**
     * Define o valor da propriedade details.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultDetails }
     *     
     */
    public void setDetails(ResultDetails value) {
        this.details = value;
    }

    /**
     * Obtém o valor da propriedade category.
     * 
     * @return
     *     possible object is
     *     {@link Category }
     *     
     */
    public Category getCategory() {
        return category;
    }

    /**
     * Define o valor da propriedade category.
     * 
     * @param value
     *     allowed object is
     *     {@link Category }
     *     
     */
    public void setCategory(Category value) {
        this.category = value;
    }

    /**
     * Gets the value of the subCategories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subCategories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubCategories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Category }
     * 
     * 
     */
    public List<Category> getSubCategories() {
        if (subCategories == null) {
            subCategories = new ArrayList<Category>();
        }
        return this.subCategories;
    }

    /**
     * Gets the value of the top5Categories property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the top5Categories property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTop5Categories().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Category }
     * 
     * 
     */
    public List<Category> getTop5Categories() {
        if (top5Categories == null) {
            top5Categories = new ArrayList<Category>();
        }
        return this.top5Categories;
    }

    /**
     * Gets the value of the products property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the products property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Product }
     * 
     * 
     */
    public List<Product> getProducts() {
        if (products == null) {
            products = new ArrayList<Product>();
        }
        return this.products;
    }

    /**
     * Gets the value of the offers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Offer }
     * 
     * 
     */
    public List<Offer> getOffers() {
        if (offers == null) {
            offers = new ArrayList<Offer>();
        }
        return this.offers;
    }

    /**
     * Obtém o valor da propriedade user.
     * 
     * @return
     *     possible object is
     *     {@link User }
     *     
     */
    public User getUser() {
        return user;
    }

    /**
     * Define o valor da propriedade user.
     * 
     * @param value
     *     allowed object is
     *     {@link User }
     *     
     */
    public void setUser(User value) {
        this.user = value;
    }

    /**
     * Gets the value of the opinions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the opinions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOpinions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserOpinion }
     * 
     * 
     */
    public List<UserOpinion> getOpinions() {
        if (opinions == null) {
            opinions = new ArrayList<UserOpinion>();
        }
        return this.opinions;
    }

    /**
     * Obtém o valor da propriedade seller.
     * 
     * @return
     *     possible object is
     *     {@link Seller }
     *     
     */
    public Seller getSeller() {
        return seller;
    }

    /**
     * Define o valor da propriedade seller.
     * 
     * @param value
     *     allowed object is
     *     {@link Seller }
     *     
     */
    public void setSeller(Seller value) {
        this.seller = value;
    }

    /**
     * Obtém o valor da propriedade sellers.
     * 
     * @return
     *     possible object is
     *     {@link Sellers }
     *     
     */
    public Sellers getSellers() {
        return sellers;
    }

    /**
     * Define o valor da propriedade sellers.
     * 
     * @param value
     *     allowed object is
     *     {@link Sellers }
     *     
     */
    public void setSellers(Sellers value) {
        this.sellers = value;
    }

    /**
     * Gets the value of the fullProducts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fullProducts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFullProducts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FullProduct }
     * 
     * 
     */
    public List<FullProduct> getFullProducts() {
        if (fullProducts == null) {
            fullProducts = new ArrayList<FullProduct>();
        }
        return this.fullProducts;
    }

    /**
     * Obtém o valor da propriedade totalResultsAvailable.
     * 
     */
    public int getTotalResultsAvailable() {
        return totalResultsAvailable;
    }

    /**
     * Define o valor da propriedade totalResultsAvailable.
     * 
     */
    public void setTotalResultsAvailable(int value) {
        this.totalResultsAvailable = value;
    }

    /**
     * Obtém o valor da propriedade totalResultsReturned.
     * 
     */
    public int getTotalResultsReturned() {
        return totalResultsReturned;
    }

    /**
     * Define o valor da propriedade totalResultsReturned.
     * 
     */
    public void setTotalResultsReturned(int value) {
        this.totalResultsReturned = value;
    }

    /**
     * Obtém o valor da propriedade totalResultsSellers.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalResultsSellers() {
        return totalResultsSellers;
    }

    /**
     * Define o valor da propriedade totalResultsSellers.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalResultsSellers(Integer value) {
        this.totalResultsSellers = value;
    }

    /**
     * Obtém o valor da propriedade totalPages.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalPages() {
        return totalPages;
    }

    /**
     * Define o valor da propriedade totalPages.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalPages(Integer value) {
        this.totalPages = value;
    }

    /**
     * Obtém o valor da propriedade totalRecommended.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalRecommended() {
        return totalRecommended;
    }

    /**
     * Define o valor da propriedade totalRecommended.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalRecommended(Integer value) {
        this.totalRecommended = value;
    }

    /**
     * Obtém o valor da propriedade totalNotRecommended.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getTotalNotRecommended() {
        return totalNotRecommended;
    }

    /**
     * Define o valor da propriedade totalNotRecommended.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setTotalNotRecommended(Integer value) {
        this.totalNotRecommended = value;
    }

    /**
     * Obtém o valor da propriedade page.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPage() {
        return page;
    }

    /**
     * Define o valor da propriedade page.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPage(Integer value) {
        this.page = value;
    }

    /**
     * Obtém o valor da propriedade match.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMatch() {
        return match;
    }

    /**
     * Define o valor da propriedade match.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMatch(String value) {
        this.match = value;
    }

}
