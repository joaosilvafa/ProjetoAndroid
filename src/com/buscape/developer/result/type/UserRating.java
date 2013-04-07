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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de UserRatingType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="UserRatingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numComments" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="rating" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="links" type="{urn:buscape}LinksType"/>
 *         &lt;element name="specification" type="{urn:buscape}SpecificationType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserRatingType", propOrder = {
    "numComments",
    "rating",
    "links",
    "specification"
})
public class UserRating
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    protected int numComments;
    @XmlElement(required = true)
    protected String rating;
    @XmlElement(required = true)
    protected Links links;
    @XmlElement(required = true)
    protected Specification specification;

    /**
     * Obtém o valor da propriedade numComments.
     * 
     */
    public int getNumComments() {
        return numComments;
    }

    /**
     * Define o valor da propriedade numComments.
     * 
     */
    public void setNumComments(int value) {
        this.numComments = value;
    }

    /**
     * Obtém o valor da propriedade rating.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRating() {
        return rating;
    }

    /**
     * Define o valor da propriedade rating.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRating(String value) {
        this.rating = value;
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

}
