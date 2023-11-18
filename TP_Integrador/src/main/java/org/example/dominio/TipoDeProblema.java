package org.example.dominio;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TipoDeProblema {

    private String nombre;

    private int tiempoMaximoResolucion;

    public TipoDeProblema(String nombre, int tiempoMaximoResolucion) {
        this.nombre = nombre;
        this.tiempoMaximoResolucion = tiempoMaximoResolucion;
    }
}
