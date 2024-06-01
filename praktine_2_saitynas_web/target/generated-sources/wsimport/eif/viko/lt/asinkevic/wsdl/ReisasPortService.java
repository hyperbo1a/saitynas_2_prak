
package eif.viko.lt.asinkevic.wsdl;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "ReisasPortService", targetNamespace = "http://lt.viko.eif/arturas/springsoap/gen", wsdlLocation = "http://localhost:8080/ws/Reisas.wsdl")
public class ReisasPortService
    extends Service
{

    private final static URL REISASPORTSERVICE_WSDL_LOCATION;
    private final static WebServiceException REISASPORTSERVICE_EXCEPTION;
    private final static QName REISASPORTSERVICE_QNAME = new QName("http://lt.viko.eif/arturas/springsoap/gen", "ReisasPortService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/ws/Reisas.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        REISASPORTSERVICE_WSDL_LOCATION = url;
        REISASPORTSERVICE_EXCEPTION = e;
    }

    public ReisasPortService() {
        super(__getWsdlLocation(), REISASPORTSERVICE_QNAME);
    }

    public ReisasPortService(WebServiceFeature... features) {
        super(__getWsdlLocation(), REISASPORTSERVICE_QNAME, features);
    }

    public ReisasPortService(URL wsdlLocation) {
        super(wsdlLocation, REISASPORTSERVICE_QNAME);
    }

    public ReisasPortService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, REISASPORTSERVICE_QNAME, features);
    }

    public ReisasPortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ReisasPortService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ReisasPort
     */
    @WebEndpoint(name = "ReisasPortSoap11")
    public ReisasPort getReisasPortSoap11() {
        return super.getPort(new QName("http://lt.viko.eif/arturas/springsoap/gen", "ReisasPortSoap11"), ReisasPort.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReisasPort
     */
    @WebEndpoint(name = "ReisasPortSoap11")
    public ReisasPort getReisasPortSoap11(WebServiceFeature... features) {
        return super.getPort(new QName("http://lt.viko.eif/arturas/springsoap/gen", "ReisasPortSoap11"), ReisasPort.class, features);
    }

    private static URL __getWsdlLocation() {
        if (REISASPORTSERVICE_EXCEPTION!= null) {
            throw REISASPORTSERVICE_EXCEPTION;
        }
        return REISASPORTSERVICE_WSDL_LOCATION;
    }

}