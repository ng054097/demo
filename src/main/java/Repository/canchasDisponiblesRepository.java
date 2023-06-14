package Repository;

import clases.Alquiler;
import clases.Cancha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface canchasDisponiblesRepository extends JpaRepository<Alquiler, Integer> {



}
