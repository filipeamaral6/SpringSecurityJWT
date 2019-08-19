
package com.polarising.bootsecurity.soap.transaction.tibco.schemas.transaction;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *       &lt;attribute name="depositer_cc_number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="depositer_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="employee_id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "DepositTransaction")
public class DepositTransaction {

    @XmlAttribute(name = "depositer_cc_number")
    protected String depositerCcNumber;
    @XmlAttribute(name = "depositer_name")
    protected String depositerName;
    @XmlAttribute(name = "employee_id")
    protected String employeeId;

    /**
     * Gets the value of the depositerCcNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositerCcNumber() {
        return depositerCcNumber;
    }

    /**
     * Sets the value of the depositerCcNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositerCcNumber(String value) {
        this.depositerCcNumber = value;
    }

    /**
     * Gets the value of the depositerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositerName() {
        return depositerName;
    }

    /**
     * Sets the value of the depositerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositerName(String value) {
        this.depositerName = value;
    }

    /**
     * Gets the value of the employeeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeId() {
        return employeeId;
    }

    /**
     * Sets the value of the employeeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeId(String value) {
        this.employeeId = value;
    }

}
