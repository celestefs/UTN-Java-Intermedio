package org.example.dominio;

import java.time.Instant;
import java.util.Date;

public class Resuelto implements Estado {
    @Override
    public void creado(Incidente incidente) {

    }

    @Override
    public void asignado(Incidente incidente) {

    }

    @Override
    public void resuelto(Incidente incidente) {
        if (incidente.getFechaEstimadaResolucion().equals(Date.from(Instant.now()))) {
            incidente.setEstado(new Resuelto());
            System.out.println("El tiempo estimado de resolución ha llegado a su fin, y el incidente ha sido resuelto.");
        } else {
            System.out.println("El tiempo estimado de resolución todavía no llega a su fin, por lo que el técnico sigue trabajando en resolver el incidente.");
        }
    }

    @Override
    public String toString() {
        return "Resuelto{}";
    }
}
