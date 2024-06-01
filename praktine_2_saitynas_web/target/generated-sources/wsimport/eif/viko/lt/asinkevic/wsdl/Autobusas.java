
package eif.viko.lt.asinkevic.wsdl;

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
 *         &lt;element ref="{http://lt.viko.eif/arturas/springsoap/gen}spalva"/&gt;
 *         &lt;element ref="{http://lt.viko.eif/arturas/springsoap/gen}valstybinisNumeris"/&gt;
 *         &lt;element ref="{http://lt.viko.eif/arturas/springsoap/gen}vietuSkaicius"/&gt;
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
    "spalva",
    "valstybinisNumeris",
    "vietuSkaicius"
})
@XmlRootElement(name = "autobusas")
public class Autobusas {

    @XmlElement(required = true)
    protected String spalva;
    @XmlElement(required = true)
    protected String valstybinisNumeris;
    protected int vietuSkaicius;

    /**
     * Gets the value of the spalva property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpalva() {
        return spalva;
    }

    /**
     * Sets the value of the spalva property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpalva(String value) {
        this.spalva = value;
    }

    /**
     * Gets the value of the valstybinisNumeris property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValstybinisNumeris() {
        return valstybinisNumeris;
    }

    /**
     * Sets the value of the valstybinisNumeris property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValstybinisNumeris(String value) {
        this.valstybinisNumeris = value;
    }

    /**
     * Gets the value of the vietuSkaicius property.
     * 
     */
    public int getVietuSkaicius() {
        return vietuSkaicius;
    }

    /**
     * Sets the value of the vietuSkaicius property.
     * 
     */
    public void setVietuSkaicius(int value) {
        this.vietuSkaicius = value;
    }

}
