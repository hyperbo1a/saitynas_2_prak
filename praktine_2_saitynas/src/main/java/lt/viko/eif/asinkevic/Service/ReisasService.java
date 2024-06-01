package lt.viko.eif.asinkevic.Service;

import lt.viko.eif.asinkevic.Database.ReisasRepository;
import lt.viko.eif.asinkevic.model.Reisas;
import eif.viko.lt.arturas.springsoap.gen.ReisasList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import java.util.List;
import java.util.stream.Collectors;

/**
 *  ReisasService class that is designated to
 *  perform operations on Reisas objects
 *  and communicate with ReisasRepository
 *  to perform CRUD operations
 *  on Reisas objects
 *  and convert Reisas objects to ReisasList objects
 *
 */
@Service
public class ReisasService {
    @Autowired
    private ReisasRepository reisasRepository;

    @Autowired
    private ModelMapper modelMapper;

    /**
     *  Method that returns all reisai
     *  from the database
     *  and converts them to ReisasList objects
     *
     * @return List of Reisas objects
     */
    public List<Reisas> list() {
        return reisasRepository.findAll();
    }

    /**
     *  Method that converts Reisas objects
     *  to ReisasList objects
     *
     * @param reisas List of Reisas objects
     * @return ReisasList object
     */
    private ReisasList convertToDto(List<Reisas> reisas) {
        ReisasList reisasList = new ReisasList();
        for (Reisas reisas1 : reisas) {
            eif.viko.lt.arturas.springsoap.gen.Reisas reisasDto = (modelMapper.map(reisas1, eif.viko.lt.arturas.springsoap.gen.Reisas.class));
            reisasList.getReisas().add(reisasDto);
        }
        return reisasList;
    }

    /**
     *  Method that returns reisai by client first and last name
     *  from the database
     *  and converts them to ReisasList objects
     *
     * @param firstName String object
     * @param lastName String object
     * @return ReisasList object
     */
    public ReisasList findReisas(String firstName, String lastName) {
        List<Reisas> filteredReisas = this.list().stream()
                .filter(reisas -> reisas.getUzsakovas().getFirstname().equals(firstName) &&
                        reisas.getUzsakovas().getLastname().equals(lastName))
                .collect(Collectors.toList());
        return convertToDto(filteredReisas);
    }

    /**
     *  Method that returns reisai by telefono numeris
     *  from the database
     *  and converts them to ReisasList objects
     *
     * @param telefonoNumeris String object
     * @return ReisasList object
     */
    public ReisasList findTelefonoNumerisReisas(String telefonoNumeris) {
        List<Reisas> filteredReisas = this.list().stream()
                .filter(reisas -> reisas.getUzsakovas().getTelefonoNumeris().equals(telefonoNumeris))
                .collect(Collectors.toList());
        return convertToDto(filteredReisas);
    }

    /**
     *  Method that returns reisai by valstybinis numeris
     *  from the database
     *  and converts them to ReisasList objects
     *
     * @param valstybinisNumeris String object
     * @return ReisasList object
     */
    public ReisasList findValstybinisNumerisReisas(String valstybinisNumeris) {
        List<Reisas> filteredReisas = this.list().stream()
                .filter(reisas -> reisas.getAutobusas().getValstybinisNumeris().equals(valstybinisNumeris))
                .collect(Collectors.toList());
        return convertToDto(filteredReisas);
    }

    /**
     *  Method that returns reisai by spalva
     *  from the database
     *  and converts them to ReisasList objects
     *
     * @param spalva String object
     * @return ReisasList object
     */
    public ReisasList findSpalvaReisas(String spalva) {
        List<Reisas> filteredReisas = this.list().stream()
                .filter(reisas -> reisas.getAutobusas().getSpalva().equals(spalva))
                .collect(Collectors.toList());
        return convertToDto(filteredReisas);
    }

    /**
     *  Method that returns reisai by vietu skaicius
     *  from the database
     *  and converts them to ReisasList objects
     *
     * @param vietuSkaicius int object
     * @return ReisasList object
     */
    public ReisasList findVietuSkaiciusReisas(int vietuSkaicius) {
        List<Reisas> filteredReisas = this.list().stream()
                .filter(reisas -> reisas.getAutobusas().getVietuSkaicius() == vietuSkaicius)
                .collect(Collectors.toList());
        return convertToDto(filteredReisas);
    }
}
