
package com.ottl.soapclient;

import jakarta.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="echoReq" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "echoReq"
})
@XmlRootElement(name = "echo", namespace = "http://services.api.ycs.com")
public class Echo {

    @XmlElement(namespace = "http://services.api.ycs.com", required = true)
    protected String echoReq;

    /**
     * Gets the value of the echoReq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEchoReq() {
        return echoReq;
    }

    /**
     * Sets the value of the echoReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEchoReq(String value) {
        this.echoReq = value;
    }

}
