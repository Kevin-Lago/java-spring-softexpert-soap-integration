//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.04 at 08:06:28 PM EDT 
//


package com.softexpert.integration.wsdl.forms;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecordRelationshipData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecordRelationshipData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="RelationshipID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RelationshipFieldID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RelationshipFieldValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordRelationshipData", propOrder = {
    "relationshipID",
    "relationshipFieldID",
    "relationshipFieldValue"
})
public class RecordRelationshipData {

    @XmlElement(name = "RelationshipID", required = true)
    protected String relationshipID;
    @XmlElement(name = "RelationshipFieldID", required = true)
    protected String relationshipFieldID;
    @XmlElement(name = "RelationshipFieldValue", required = true)
    protected String relationshipFieldValue;

    /**
     * Gets the value of the relationshipID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipID() {
        return relationshipID;
    }

    /**
     * Sets the value of the relationshipID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipID(String value) {
        this.relationshipID = value;
    }

    /**
     * Gets the value of the relationshipFieldID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipFieldID() {
        return relationshipFieldID;
    }

    /**
     * Sets the value of the relationshipFieldID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipFieldID(String value) {
        this.relationshipFieldID = value;
    }

    /**
     * Gets the value of the relationshipFieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelationshipFieldValue() {
        return relationshipFieldValue;
    }

    /**
     * Sets the value of the relationshipFieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelationshipFieldValue(String value) {
        this.relationshipFieldValue = value;
    }

}
