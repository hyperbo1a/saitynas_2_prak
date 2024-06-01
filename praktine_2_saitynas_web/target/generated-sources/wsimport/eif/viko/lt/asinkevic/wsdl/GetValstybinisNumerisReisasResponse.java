
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
 *         &lt;element name="ReisasList" type="{http://lt.viko.eif/arturas/springsoap/gen}ReisasList"/&gt;
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
    "reisasList"
})
@XmlRootElement(name = "getValstybinisNumerisReisasResponse")
public class GetValstybinisNumerisReisasResponse {

    @XmlElement(name = "ReisasList", required = true)
    protected ReisasList reisasList;

    /**
     * Gets the value of the reisasList property.
     * 
     * @return
     *     possible object is
     *     {@link ReisasList }
     *     
     */
    public ReisasList getReisasList() {
        return reisasList;
    }

    /**
     * Sets the value of the reisasList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReisasList }
     *     
     */
    public void setReisasList(ReisasList value) {
        this.reisasList = value;
    }

}
