package org.example.dominio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class Incidente {

    private Cliente cliente;

    private List<Problema> problemas;

    private Tecnico tecnicoAsignado;

    private String descripcion;

    private int tiempoEstimadoResolucion;

    public Incidente(Cliente cliente, Tecnico tecnicoAsignado, int tiempoEstimadoResolucion) {
        this.cliente = cliente;
        this.tecnicoAsignado = tecnicoAsignado;
        this.tiempoEstimadoResolucion = tiempoEstimadoResolucion;
        this.problemas = new ArrayList<>();
    }


}

