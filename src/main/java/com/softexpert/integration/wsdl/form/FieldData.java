//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.04 at 08:06:28 PM EDT 
//


package com.softexpert.integration.wsdl.form;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fieldData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fieldData"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="TableFieldID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TableFieldValue" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fieldData", propOrder = {

})
public class FieldData {

    @XmlElement(name = "TableFieldID", required = true)
    protected String tableFieldID;
    @XmlElement(name = "TableFieldValue", required = true)
    protected String tableFieldValue;

    /**
     * Gets the value of the tableFieldID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableFieldID() {
        return tableFieldID;
    }

    /**
     * Sets the value of the tableFieldID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableFieldID(String value) {
        this.tableFieldID = value;
    }

    /**
     * Gets the value of the tableFieldValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableFieldValue() {
        return tableFieldValue;
    }

    /**
     * Sets the value of the tableFieldValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableFieldValue(String value) {
        this.tableFieldValue = value;
    }

}
