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
 * <p>Java class for getTableRecordResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getTableRecordResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;all&gt;
 *         &lt;element name="Status" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="Detail" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TotalPagination" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RecordList" type="{urn:form}RecordListArray"/&gt;
 *       &lt;/all&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "getTableRecordResponse")
@XmlType(name = "getTableRecordResponseType", propOrder = {

})
public class GetTableRecordResponseType {

    @XmlElement(name = "Status", required = true)
    protected String status;
    @XmlElement(name = "Code", required = true)
    protected BigInteger code;
    @XmlElement(name = "Detail", required = true)
    protected String detail;
    @XmlElement(name = "TotalPagination", required = true)
    protected String totalPagination;
    @XmlElement(name = "RecordList", required = true)
    protected RecordListArray recordList;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCode(BigInteger value) {
        this.code = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDetail() {
        return detail;
    }

    /**
     * Sets the value of the detail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDetail(String value) {
        this.detail = value;
    }

    /**
     * Gets the value of the totalPagination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalPagination() {
        return totalPagination;
    }

    /**
     * Sets the value of the totalPagination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalPagination(String value) {
        this.totalPagination = value;
    }

    /**
     * Gets the value of the recordList property.
     * 
     * @return
     *     possible object is
     *     {@link RecordListArray }
     *     
     */
    public RecordListArray getRecordList() {
        return recordList;
    }

    /**
     * Sets the value of the recordList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordListArray }
     *     
     */
    public void setRecordList(RecordListArray value) {
        this.recordList = value;
    }

}
