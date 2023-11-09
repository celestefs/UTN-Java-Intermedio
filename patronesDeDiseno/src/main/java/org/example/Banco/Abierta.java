package org.example.Banco;

public class Abierta implements EstadoVentanilla {
    @Override
    public void atende(Persona persona) {

        System.out.println("Atendiendo a: " + persona.getNombre());
    }
}
