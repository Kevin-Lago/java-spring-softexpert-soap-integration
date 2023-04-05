//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.04 at 08:06:28 PM EDT 
//


package com.softexpert.integration.wsdl.form;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


/**
 * <p>Java class for getTableRecordRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTableRecordRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="TableID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Pagination" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="TableFieldList" type="{urn:form}tableFieldArray"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "getTableRecord")
@XmlType(name = "getTableRecordRequestType", propOrder = {

})
public class GetTableRecordRequestType {

    @XmlElement(name = "TableID", required = true)
    protected String tableID;
    @XmlElement(name = "Pagination", required = true)
    protected BigInteger pagination;
    @XmlElement(name = "TableFieldList", required = true)
    protected TableFieldArray tableFieldList;

    /**
     * Gets the value of the tableID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableID() {
        return tableID;
    }

    /**
     * Sets the value of the tableID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableID(String value) {
        this.tableID = value;
    }

    /**
     * Gets the value of the pagination property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPagination() {
        return pagination;
    }

    /**
     * Sets the value of the pagination property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPagination(BigInteger value) {
        this.pagination = value;
    }

    /**
     * Gets the value of the tableFieldList property.
     * 
     * @return
     *     possible object is
     *     {@link TableFieldArray }
     *     
     */
    public TableFieldArray getTableFieldList() {
        return tableFieldList;
    }

    /**
     * Sets the value of the tableFieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TableFieldArray }
     *     
     */
    public void setTableFieldList(TableFieldArray value) {
        this.tableFieldList = value;
    }

}