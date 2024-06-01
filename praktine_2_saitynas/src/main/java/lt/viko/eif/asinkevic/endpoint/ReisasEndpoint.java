package lt.viko.eif.asinkevic.endpoint;

import eif.viko.lt.arturas.springsoap.gen.*;
import lt.viko.eif.asinkevic.Service.ReisasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ReisasEndpoint {
    private static final String NAMESPACE_URI = "http://lt.viko.eif/arturas/springsoap/gen";

    private ReisasService reisasService;

    @Autowired
    public ReisasEndpoint(ReisasService reisasRepository) {
        this.reisasService = reisasRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getReisasRequest")
    @ResponsePayload
    public GetReisasResponse getReisas(@RequestPayload GetReisasRequest request) {
        GetReisasResponse response = new GetReisasResponse();
        response.setReisasList(reisasService.findReisas(request.getFirstName(), request.getLastname()));
        return response;
    }

    /**
     *  Method that returns reisai by telefono numeris
     * @param request GetTelefonoNumerisReisasRequest object
     * @return GetTelefonoNumerisReisasResponse object
     */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getTelefonoNumerisReisasRequest")
    @ResponsePayload
    public GetTelefonoNumerisReisasResponse getTelefonoNumerisReisas(@RequestPayload GetTelefonoNumerisReisasRequest request) {
        GetTelefonoNumerisReisasResponse response = new GetTelefonoNumerisReisasResponse();
        response.setReisasList(reisasService.findTelefonoNumerisReisas(request.getTelefonoNumeris()));
        return response;
    }

    /**
     *  Method that returns reisai by valstybinis numeris
     * @param request GetValstybinisNumerisReisasRequest object
     * @return GetValstybinisNumerisReisasResponse object
     */
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getValstybinisNumerisReisasRequest")
    @ResponsePayload
    public GetValstybinisNumerisReisasResponse getValstybinisNumerisReisas(@RequestPayload GetValstybinisNumerisReisasRequest request) {
        GetValstybinisNumerisReisasResponse response = new GetValstybinisNumerisReisasResponse();
        response.setReisasList(reisasService.findValstybinisNumerisReisas(request.getValstybinisNumeris()));
        return response;
    }



}
