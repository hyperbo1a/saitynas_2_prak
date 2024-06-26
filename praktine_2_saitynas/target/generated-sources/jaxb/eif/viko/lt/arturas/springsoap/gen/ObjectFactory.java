//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.0 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.05.30 at 02:10:48 PM EEST 
//


package eif.viko.lt.arturas.springsoap.gen;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eif.viko.lt.arturas.springsoap.gen package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TelefonoNumeris_QNAME = new QName("http://lt.viko.eif/arturas/springsoap/gen", "telefonoNumeris");
    private final static QName _ValstybinisNumeris_QNAME = new QName("http://lt.viko.eif/arturas/springsoap/gen", "valstybinisNumeris");
    private final static QName _Id_QNAME = new QName("http://lt.viko.eif/arturas/springsoap/gen", "id");
    private final static QName _FirstName_QNAME = new QName("http://lt.viko.eif/arturas/springsoap/gen", "FirstName");
    private final static QName _Lastname_QNAME = new QName("http://lt.viko.eif/arturas/springsoap/gen", "Lastname");
    private final static QName _Spalva_QNAME = new QName("http://lt.viko.eif/arturas/springsoap/gen", "spalva");
    private final static QName _VietuSkaicius_QNAME = new QName("http://lt.viko.eif/arturas/springsoap/gen", "vietuSkaicius");
    private final static QName _Adresas_QNAME = new QName("http://lt.viko.eif/arturas/springsoap/gen", "adresas");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eif.viko.lt.arturas.springsoap.gen
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetReisasRequest }
     * 
     */
    public GetReisasRequest createGetReisasRequest() {
        return new GetReisasRequest();
    }

    /**
     * Create an instance of {@link GetReisasResponse }
     * 
     */
    public GetReisasResponse createGetReisasResponse() {
        return new GetReisasResponse();
    }

    /**
     * Create an instance of {@link ReisasList }
     * 
     */
    public ReisasList createReisasList() {
        return new ReisasList();
    }

    /**
     * Create an instance of {@link GetTelefonoNumerisReisasRequest }
     * 
     */
    public GetTelefonoNumerisReisasRequest createGetTelefonoNumerisReisasRequest() {
        return new GetTelefonoNumerisReisasRequest();
    }

    /**
     * Create an instance of {@link GetTelefonoNumerisReisasResponse }
     * 
     */
    public GetTelefonoNumerisReisasResponse createGetTelefonoNumerisReisasResponse() {
        return new GetTelefonoNumerisReisasResponse();
    }

    /**
     * Create an instance of {@link GetValstybinisNumerisReisasRequest }
     * 
     */
    public GetValstybinisNumerisReisasRequest createGetValstybinisNumerisReisasRequest() {
        return new GetValstybinisNumerisReisasRequest();
    }

    /**
     * Create an instance of {@link GetValstybinisNumerisReisasResponse }
     * 
     */
    public GetValstybinisNumerisReisasResponse createGetValstybinisNumerisReisasResponse() {
        return new GetValstybinisNumerisReisasResponse();
    }

    /**
     * Create an instance of {@link Uzsakovas }
     * 
     */
    public Uzsakovas createUzsakovas() {
        return new Uzsakovas();
    }

    /**
     * Create an instance of {@link Vairuotojas }
     * 
     */
    public Vairuotojas createVairuotojas() {
        return new Vairuotojas();
    }

    /**
     * Create an instance of {@link Autobusas }
     * 
     */
    public Autobusas createAutobusas() {
        return new Autobusas();
    }

    /**
     * Create an instance of {@link Reisas }
     * 
     */
    public Reisas createReisas() {
        return new Reisas();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://lt.viko.eif/arturas/springsoap/gen", name = "telefonoNumeris")
    public JAXBElement<String> createTelefonoNumeris(String value) {
        return new JAXBElement<String>(_TelefonoNumeris_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://lt.viko.eif/arturas/springsoap/gen", name = "valstybinisNumeris")
    public JAXBElement<String> createValstybinisNumeris(String value) {
        return new JAXBElement<String>(_ValstybinisNumeris_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://lt.viko.eif/arturas/springsoap/gen", name = "id")
    public JAXBElement<String> createId(String value) {
        return new JAXBElement<String>(_Id_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://lt.viko.eif/arturas/springsoap/gen", name = "FirstName")
    public JAXBElement<String> createFirstName(String value) {
        return new JAXBElement<String>(_FirstName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://lt.viko.eif/arturas/springsoap/gen", name = "Lastname")
    public JAXBElement<String> createLastname(String value) {
        return new JAXBElement<String>(_Lastname_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://lt.viko.eif/arturas/springsoap/gen", name = "spalva")
    public JAXBElement<String> createSpalva(String value) {
        return new JAXBElement<String>(_Spalva_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://lt.viko.eif/arturas/springsoap/gen", name = "vietuSkaicius")
    public JAXBElement<Integer> createVietuSkaicius(Integer value) {
        return new JAXBElement<Integer>(_VietuSkaicius_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://lt.viko.eif/arturas/springsoap/gen", name = "adresas")
    public JAXBElement<String> createAdresas(String value) {
        return new JAXBElement<String>(_Adresas_QNAME, String.class, null, value);
    }

}
