package org.example.dominio;

import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Tecnico {

    private String nombre;

    private String apellido;

    private List<Especialidad> especialidades;

    private String medioNotificacionPreferido;

    private Incidente incidenteAsignado;


    public Tecnico(String nombre, String apellido, String medioNotificacionPreferido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.medioNotificacionPreferido = medioNotificacionPreferido;
        this.especialidades = new ArrayList<>();
    }

    public boolean estaDisponible() {
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tecnico: ").append("\n");
        sb.append("Nombre: ").append(nombre).append("\n");
        sb.append("Apellido: ").append(apellido).append("\n");
        return sb.toString();
    }
}
