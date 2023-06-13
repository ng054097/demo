package servicios;

import Repository.canchasDisponiblesRepository;
import clases.Cancha;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class CanchaServicio {
    private final canchasDisponiblesRepository canchaRepository;

        public Cancha GuardarCancha(Cancha cancha){
            return canchaRepository.save(cancha);
        }
}


