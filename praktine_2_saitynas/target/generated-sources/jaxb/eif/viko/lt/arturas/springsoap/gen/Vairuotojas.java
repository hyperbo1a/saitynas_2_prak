//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.05.30 at 02:10:48 PM EEST 
//


package eif.viko.lt.arturas.springsoap.gen;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://lt.viko.eif/arturas/springsoap/gen}id"/&gt;
 *         &lt;element ref="{http://lt.viko.eif/arturas/springsoap/gen}FirstName"/&gt;
 *         &lt;element ref="{http://lt.viko.eif/arturas/springsoap/gen}Lastname"/&gt;
 *         &lt;element ref="{http://lt.viko.eif/arturas/springsoap/gen}telefonoNumeris"/&gt;
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
    "id",
    "firstName",
    "lastname",
    "telefonoNumeris"
})
@XmlRootElement(name = "vairuotojas")
public class Vairuotojas {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    @XmlElement(name = "Lastname", required = true)
    protected String lastname;
    @XmlElement(required = true)
    protected String telefonoNumeris;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the value of the lastname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastname(String value) {
        this.lastname = value;
    }

    /**
     * Gets the value of the telefonoNumeris property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoNumeris() {
        return telefonoNumeris;
    }

    /**
     * Sets the value of the telefonoNumeris property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoNumeris(String value) {
        this.telefonoNumeris = value;
    }

}
