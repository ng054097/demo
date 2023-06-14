package clases;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;


@Entity
public class Alquiler {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private Cancha cancha ;
    @Column
    private  int dia;
    @Column
    private  int horarioEntrada;
    @Column
    private  int horarioSalida;


    @Column
    private  boolean disponible;







    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }








    public Alquiler() {
    }

    public Alquiler(int dia, int horarioEntrada, int horarioSalida, Cancha cancha, boolean disponible) {
        this.dia = dia;
        this.horarioEntrada = horarioEntrada;
        this.horarioSalida = horarioSalida;
        this.cancha = cancha;
        this.disponible = disponible;
    }



    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getHorarioEntrada() {
        return horarioEntrada;
    }

    public void setHorarioEntrada(int horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }

    public int getHorarioSalida() {
        return horarioSalida;
    }

    public void setHorarioSalida(int horarioSalida) {
        this.horarioSalida = horarioSalida;
    }

    public Cancha getCancha() {
        return cancha;
    }

    public void setCancha(Cancha cancha) {
        this.cancha = cancha;
    }

//    public boolean estaDisponible(int dia , int horarioEntrada, int horarioSalida, int idCancha){
//            List <> FiltroDeCancha=filtraPorDiaHorarioFechaYCancha( dia, horarioEntrada, horarioSalida, idCancha);
//
//        if(disponible=false) {
//            return false;
//        }
//        else{
//
//        }
//
//
//    }





}
