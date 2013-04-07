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
 * <p>Classe Java de RatingType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="RatingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userAverageRating" type="{urn:buscape}UserRatingType"/>
 *         &lt;element name="eBitRating" type="{urn:buscape}EBitRatingType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RatingType", propOrder = {
    "userAverageRating",
    "eBitRating"
})
public class Rating
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected UserRating userAverageRating;
    @XmlElement(required = true)
    protected EBitRating eBitRating;

    /**
     * Obtém o valor da propriedade userAverageRating.
     * 
     * @return
     *     possible object is
     *     {@link UserRating }
     *     
     */
    public UserRating getUserAverageRating() {
        return userAverageRating;
    }

    /**
     * Define o valor da propriedade userAverageRating.
     * 
     * @param value
     *     allowed object is
     *     {@link UserRating }
     *     
     */
    public void setUserAverageRating(UserRating value) {
        this.userAverageRating = value;
    }

    /**
     * Obtém o valor da propriedade eBitRating.
     * 
     * @return
     *     possible object is
     *     {@link EBitRating }
     *     
     */
    public EBitRating getEBitRating() {
        return eBitRating;
    }

    /**
     * Define o valor da propriedade eBitRating.
     * 
     * @param value
     *     allowed object is
     *     {@link EBitRating }
     *     
     */
    public void setEBitRating(EBitRating value) {
        this.eBitRating = value;
    }

}
