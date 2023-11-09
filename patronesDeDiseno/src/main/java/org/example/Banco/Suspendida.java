package org.example.Banco;

import org.example.Banco.EstadoVentanilla;
import org.example.Banco.Persona;

public class Suspendida implements EstadoVentanilla {
    public void atende(Persona persona) {
        if (persona.getEdad() > 65) {
            System.out.println("Atendiendo a: " + persona.getNombre());
        } else {
            System.out.println("Espere 5 minutos por favor....");
        }
    }
}
