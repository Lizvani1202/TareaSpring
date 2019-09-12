package Modelo;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity

public class Odontologo {
    private @Id
    @GeneratedValue
    Long id;
    private String nombre;
    private String apellido;
    private String especialidad;

    Odontologo(){}

    public Odontologo(String nombre, String apellido, String especialidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidad = especialidad;
    }
}
