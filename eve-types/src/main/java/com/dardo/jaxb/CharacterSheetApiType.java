//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.12 at 10:05:15 AM CST 
//


package com.dardo.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CharacterSheetApiType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CharacterSheetApiType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="currentTime" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="result" type="{http://dardo.com/eve-api/characterSheet}CharacterSheetResultType"/>
 *         &lt;element name="cachedUntil" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CharacterSheetApiType", namespace = "http://dardo.com/eve-api/characterSheet", propOrder = {
    "currentTime",
    "result",
    "cachedUntil"
})
@XmlRootElement(name="eveapi", namespace="http://dardo.com/eve-api/characterSheet")
public class CharacterSheetApiType {

    @XmlElement
    protected String currentTime;
    @XmlElement
    protected CharacterSheetResultType result;
    @XmlElement
    protected String cachedUntil;

    /**
     * Gets the value of the currentTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrentTime() {
        return currentTime;
    }

    /**
     * Sets the value of the currentTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrentTime(String value) {
        this.currentTime = value;
    }

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterSheetResultType }
     *     
     */
    public CharacterSheetResultType getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterSheetResultType }
     *     
     */
    public void setResult(CharacterSheetResultType value) {
        this.result = value;
    }

    /**
     * Gets the value of the cachedUntil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCachedUntil() {
        return cachedUntil;
    }

    /**
     * Sets the value of the cachedUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCachedUntil(String value) {
        this.cachedUntil = value;
    }

}