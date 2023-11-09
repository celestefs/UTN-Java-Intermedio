package org.example.Banco;

public class Cerrada implements EstadoVentanilla {
    @Override
    public void atende(Persona persona) {

        System.out.println("Ventanilla Cerrada");
    }
}
