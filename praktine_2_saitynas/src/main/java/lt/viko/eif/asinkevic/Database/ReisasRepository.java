package lt.viko.eif.asinkevic.Database;


import lt.viko.eif.asinkevic.model.Reisas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Represents OrdersRepository Object that extends JpaRepository
 * This class is designated to communicate with database
 * and perform CRUD operations
 * on Order objects
 */
@Repository
public interface ReisasRepository extends JpaRepository<Reisas, Long> {


}
