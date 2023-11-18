package org.example.dominio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Map;
@Getter
@Setter
@AllArgsConstructor
public class Operador {

    private String nombre;

    private String apellido;

    private Map<TipoDeProblema, Integer> tiempoEstimadoResolucionPorDefecto;
}
