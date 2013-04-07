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
 * <p>Classe Java de CommentType complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="CommentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="comment" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="positive" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="negative" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *       &lt;attribute name="totalUsefulInformation" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="totalUselessInformation" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="totalOutOfContext" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommentType", propOrder = {
    "comment",
    "positive",
    "negative"
})
public class Comment
    implements Serializable
{

    private final static long serialVersionUID = 1L;
    @XmlElement(required = true)
    protected String comment;
    @XmlElement(required = true)
    protected String positive;
    @XmlElement(required = true)
    protected String negative;
    @XmlAttribute(name = "totalUsefulInformation", required = true)
    protected int totalUsefulInformation;
    @XmlAttribute(name = "totalUselessInformation", required = true)
    protected int totalUselessInformation;
    @XmlAttribute(name = "totalOutOfContext", required = true)
    protected int totalOutOfContext;

    /**
     * Obtém o valor da propriedade comment.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Define o valor da propriedade comment.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Obtém o valor da propriedade positive.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositive() {
        return positive;
    }

    /**
     * Define o valor da propriedade positive.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositive(String value) {
        this.positive = value;
    }

    /**
     * Obtém o valor da propriedade negative.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNegative() {
        return negative;
    }

    /**
     * Define o valor da propriedade negative.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNegative(String value) {
        this.negative = value;
    }

    /**
     * Obtém o valor da propriedade totalUsefulInformation.
     * 
     */
    public int getTotalUsefulInformation() {
        return totalUsefulInformation;
    }

    /**
     * Define o valor da propriedade totalUsefulInformation.
     * 
     */
    public void setTotalUsefulInformation(int value) {
        this.totalUsefulInformation = value;
    }

    /**
     * Obtém o valor da propriedade totalUselessInformation.
     * 
     */
    public int getTotalUselessInformation() {
        return totalUselessInformation;
    }

    /**
     * Define o valor da propriedade totalUselessInformation.
     * 
     */
    public void setTotalUselessInformation(int value) {
        this.totalUselessInformation = value;
    }

    /**
     * Obtém o valor da propriedade totalOutOfContext.
     * 
     */
    public int getTotalOutOfContext() {
        return totalOutOfContext;
    }

    /**
     * Define o valor da propriedade totalOutOfContext.
     * 
     */
    public void setTotalOutOfContext(int value) {
        this.totalOutOfContext = value;
    }

}
