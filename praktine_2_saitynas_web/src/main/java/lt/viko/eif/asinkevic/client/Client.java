package lt.viko.eif.asinkevic.client;

import eif.viko.lt.asinkevic.wsdl.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class Client extends WebServiceGatewaySupport {
    private static final Logger log = LoggerFactory.getLogger(Client.class);

    public GetReisasResponse getReisas(String firstName, String lastName) {
        GetReisasRequest request = new GetReisasRequest();
        request.setFirstName(firstName);
        request.setLastname(lastName);
        log.info("Requesting: First Name = {} and Last Name = {}", firstName, lastName);

        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("eif.viko.lt.asinkevic.wsdl");
        setMarshaller(marshaller);
        setUnmarshaller(marshaller);

        GetReisasResponse response = (GetReisasResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/ws/Reisas", request,
                        new SoapActionCallback("http://eif.viko.lt.arturas/springsoap/gen/GetReisasRequest"));
        return response;
    }

    public GetTelefonoNumerisReisasResponse getTelefonoNumerisReisas(String telefonoNumeris) {
        GetTelefonoNumerisReisasRequest request = new GetTelefonoNumerisReisasRequest();
        request.setTelefonoNumeris(telefonoNumeris);
        log.info("Requesting: Telefono Numeris = {}", telefonoNumeris);

        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("eif.viko.lt.asinkevic.wsdl");
        setMarshaller(marshaller);
        setUnmarshaller(marshaller);

        GetTelefonoNumerisReisasResponse response = (GetTelefonoNumerisReisasResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/ws/Reisas", request,
                        new SoapActionCallback("http://eif.viko.lt.arturas/springsoap/gen/GetTelefonoNumerisReisasRequest"));
        return response;
    }

    public GetValstybinisNumerisReisasResponse getValstybinisNumerisReisas(String valstybinisNumeris) {
        GetValstybinisNumerisReisasRequest request = new GetValstybinisNumerisReisasRequest();
        request.setValstybinisNumeris(valstybinisNumeris);
        log.info("Requesting: Valstybinis Numeris = {}", valstybinisNumeris);

        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("eif.viko.lt.asinkevic.wsdl");
        setMarshaller(marshaller);
        setUnmarshaller(marshaller);

        GetValstybinisNumerisReisasResponse response = (GetValstybinisNumerisReisasResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/ws/Reisas", request,
                        new SoapActionCallback("http://eif.viko.lt.arturas/springsoap/gen/GetValstybinisNumerisReisasRequest"));
        return response;
    }
}

