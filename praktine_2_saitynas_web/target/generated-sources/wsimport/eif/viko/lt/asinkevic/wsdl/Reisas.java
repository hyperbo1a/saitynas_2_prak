
package eif.viko.lt.asinkevic.wsdl;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{http://lt.viko.eif/arturas/springsoap/gen}adresas"/&gt;
 *         &lt;element ref="{http://lt.viko.eif/arturas/springsoap/gen}uzsakovas"/&gt;
 *         &lt;element ref="{http://lt.viko.eif/arturas/springsoap/gen}vairuotojas"/&gt;
 *         &lt;element ref="{http://lt.viko.eif/arturas/springsoap/gen}autobusas"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "adresas",
    "uzsakovas",
    "vairuotojas",
    "autobusas"
})
@XmlRootElement(name = "Reisas")
public class Reisas {

    @XmlElement(required = true)
    protected String adresas;
    @XmlElement(required = true)
    protected Uzsakovas uzsakovas;
    @XmlElement(required = true)
    protected Vairuotojas vairuotojas;
    @XmlElement(required = true)
    protected Autobusas autobusas;
    @XmlAttribute(name = "id")
    protected String id;

    /**
     * Gets the value of the adresas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdresas() {
        return adresas;
    }

    /**
     * Sets the value of the adresas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdresas(String value) {
        this.adresas = value;
    }

    /**
     * Gets the value of the uzsakovas property.
     * 
     * @return
     *     possible object is
     *     {@link Uzsakovas }
     *     
     */
    public Uzsakovas getUzsakovas() {
        return uzsakovas;
    }

    /**
     * Sets the value of the uzsakovas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uzsakovas }
     *     
     */
    public void setUzsakovas(Uzsakovas value) {
        this.uzsakovas = value;
    }

    /**
     * Gets the value of the vairuotojas property.
     * 
     * @return
     *     possible object is
     *     {@link Vairuotojas }
     *     
     */
    public Vairuotojas getVairuotojas() {
        return vairuotojas;
    }

    /**
     * Sets the value of the vairuotojas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Vairuotojas }
     *     
     */
    public void setVairuotojas(Vairuotojas value) {
        this.vairuotojas = value;
    }

    /**
     * Gets the value of the autobusas property.
     * 
     * @return
     *     possible object is
     *     {@link Autobusas }
     *     
     */
    public Autobusas getAutobusas() {
        return autobusas;
    }

    /**
     * Sets the value of the autobusas property.
     * 
     * @param value
     *     allowed object is
     *     {@link Autobusas }
     *     
     */
    public void setAutobusas(Autobusas value) {
        this.autobusas = value;
    }

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

}
