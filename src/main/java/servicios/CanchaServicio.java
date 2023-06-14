package servicios;

import Repository.canchasDisponiblesRepository;
import clases.Alquiler;
import clases.Cancha;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Data
public class CanchaServicio {
    private final canchasDisponiblesRepository canchaRepository;

        public Alquiler GuardarCancha(Alquiler alquiler){
            return canchaRepository.save(alquiler);
        }



//    public List filtraPorDiaHorarioFechaYCancha(int dia , int horarioEntrada, int horarioSalida, int idCancha){
//
//        return canchasDisponiblesRepository.class.
//
//                .stream()
//                .filter(disponibilidad1 -> disponibilidad1.getCancha().equals(idCancha))
//                .filter(disponibilidad1 -> disponibilidad1.getHorarioEntrada()==(horarioEntrada))
//                .filter(disponibilidad1 -> disponibilidad1.getHorarioSalida()==(horarioSalida)).collect(Collectors.toList());
//
//
//    }



}


