package clases;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;
@Entity
public class Cancha {

    @Id
    private int id;
    @Column
    private  List<String> CanchasEnFuncionamiento;
}
