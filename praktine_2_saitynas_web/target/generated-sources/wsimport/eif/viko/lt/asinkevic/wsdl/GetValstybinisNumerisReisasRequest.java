
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
 *         &lt;element ref="{http://lt.viko.eif/arturas/springsoap/gen}valstybinisNumeris"/&gt;
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
    "valstybinisNumeris"
})
@XmlRootElement(name = "getValstybinisNumerisReisasRequest")
public class GetValstybinisNumerisReisasRequest {

    @XmlElement(required = true)
    protected String valstybinisNumeris;

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

}
