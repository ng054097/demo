package clases;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.util.List;
import java.util.stream.Collectors;

@Entity
public class Disponibilidad {

@Column
    private  int dia;
    @Column
    private  int horarioEntrada;
    @Column
    private  int horarioSalida;

    @Column
    private Cancha cancha ;
    @Column
    private  boolean disponible;
    @Column
    private List<Disponibilidad> disponibilidad;






    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public List<Disponibilidad> getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(List<Disponibilidad> disponibilidad) {
        this.disponibilidad = disponibilidad;
    }




    public Disponibilidad() {
    }

    public Disponibilidad(int dia, int horarioEntrada, int horarioSalida, Cancha cancha, boolean disponible) {
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

    public  List filtraPorDiaHorarioFechaYCancha(int dia , int horarioEntrada, int horarioSalida,int idCancha){

        List FiltroXDiaXNocheXCancha = getDisponibilidad().stream()
                .filter(disponibilidad1 -> disponibilidad1.getCancha().equals(idCancha))
                .filter(disponibilidad1 -> disponibilidad1.getHorarioEntrada()==(horarioEntrada))
                .filter(disponibilidad1 -> disponibilidad1.getHorarioSalida()==(horarioSalida)).collect(Collectors.toList());

                return FiltroXDiaXNocheXCancha;
    }



}
