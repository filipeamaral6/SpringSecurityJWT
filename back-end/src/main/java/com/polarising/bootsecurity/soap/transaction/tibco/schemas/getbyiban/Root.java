
package com.polarising.bootsecurity.soap.transaction.tibco.schemas.getbyiban;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.tibco.com/schemas/tibco/Schemas/getByIban.xsd}getByIban"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getByIban"
})
@XmlRootElement(name = "root")
public class Root {

    @XmlElement(required = true)
    protected GetByIban getByIban;

    /**
     * Gets the value of the getByIban property.
     * 
     * @return
     *     possible object is
     *     {@link GetByIban }
     *     
     */
    public GetByIban getGetByIban() {
        return getByIban;
    }

    /**
     * Sets the value of the getByIban property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetByIban }
     *     
     */
    public void setGetByIban(GetByIban value) {
        this.getByIban = value;
    }

}
