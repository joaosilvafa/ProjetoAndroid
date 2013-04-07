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
 * <p>Classe Java de SellerType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="SellerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sellerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="thumbnail" type="{urn:buscape}ThumbnailType"/>
 *         &lt;element name="links" type="{urn:buscape}LinksType"/>
 *         &lt;element name="extra" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contacts" type="{urn:buscape}ContactsType"/>
 *         &lt;element name="rating" type="{urn:buscape}RatingType"/>
 *         &lt;element name="coupon" type="{urn:buscape}CouponType"/>
 *         &lt;element name="addresses" type="{urn:buscape}AddressesType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="isTrustedStore" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="pagamentoDigital" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellerType", propOrder = {
    "sellerName",
    "thumbnail",
    "links",
    "extra",
    "contacts",
    "rating",
    "coupon",
    "addresses"
})
public class Seller
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String sellerName;
    @XmlElement(required = true)
    protected Thumbnail thumbnail;
    @XmlElement(required = true)
    protected Links links;
    @XmlElement(required = true)
    protected String extra;
    @XmlElement(required = true)
    protected Contacts contacts;
    @XmlElement(required = true)
    protected Rating rating;
    @XmlElement(required = true)
    protected Coupon coupon;
    @XmlElement(required = true)
    protected Addresses addresses;
    @XmlAttribute(name = "id", required = true)
    protected int id;
    @XmlAttribute(name = "isTrustedStore", required = true)
    protected boolean isTrustedStore;
    @XmlAttribute(name = "pagamentoDigital", required = true)
    protected boolean pagamentoDigital;

    /**
     * Obtém o valor da propriedade sellerName.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSellerName() {
        return sellerName;
    }

    /**
     * Define o valor da propriedade sellerName.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSellerName(String value) {
        this.sellerName = value;
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
     * Obtém o valor da propriedade extra.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtra() {
        return extra;
    }

    /**
     * Define o valor da propriedade extra.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtra(String value) {
        this.extra = value;
    }

    /**
     * Obtém o valor da propriedade contacts.
     * 
     * @return
     *     possible object is
     *     {@link Contacts }
     *     
     */
    public Contacts getContacts() {
        return contacts;
    }

    /**
     * Define o valor da propriedade contacts.
     * 
     * @param value
     *     allowed object is
     *     {@link Contacts }
     *     
     */
    public void setContacts(Contacts value) {
        this.contacts = value;
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
     * Obtém o valor da propriedade coupon.
     * 
     * @return
     *     possible object is
     *     {@link Coupon }
     *     
     */
    public Coupon getCoupon() {
        return coupon;
    }

    /**
     * Define o valor da propriedade coupon.
     * 
     * @param value
     *     allowed object is
     *     {@link Coupon }
     *     
     */
    public void setCoupon(Coupon value) {
        this.coupon = value;
    }

    /**
     * Obtém o valor da propriedade addresses.
     * 
     * @return
     *     possible object is
     *     {@link Addresses }
     *     
     */
    public Addresses getAddresses() {
        return addresses;
    }

    /**
     * Define o valor da propriedade addresses.
     * 
     * @param value
     *     allowed object is
     *     {@link Addresses }
     *     
     */
    public void setAddresses(Addresses value) {
        this.addresses = value;
    }

    /**
     * Obtém o valor da propriedade id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define o valor da propriedade id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtém o valor da propriedade isTrustedStore.
     * 
     */
    public boolean isIsTrustedStore() {
        return isTrustedStore;
    }

    /**
     * Define o valor da propriedade isTrustedStore.
     * 
     */
    public void setIsTrustedStore(boolean value) {
        this.isTrustedStore = value;
    }

    /**
     * Obtém o valor da propriedade pagamentoDigital.
     * 
     */
    public boolean isPagamentoDigital() {
        return pagamentoDigital;
    }

    /**
     * Define o valor da propriedade pagamentoDigital.
     * 
     */
    public void setPagamentoDigital(boolean value) {
        this.pagamentoDigital = value;
    }

}
