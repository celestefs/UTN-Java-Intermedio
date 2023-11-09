package org.example.Banco;

import org.example.Banco.Cerrada;
import org.example.Banco.EstadoVentanilla;
import org.example.Banco.Persona;
import org.example.Banco.Suspendida;

public class Ventanilla {
    private String cajero;
    private EstadoVentanilla estado;
    public Ventanilla() {
        estado = new Abierta();
    }
    public void suspendete() {
        estado = new Suspendida();
    }
    public void cerrate() {
        estado = new Cerrada();
    }
    public void abrite() {
        estado = new Abierta();
    }
    public void atende(Persona persona) {
        estado.atende(persona);
    }
    public String getCajero() {
        return cajero;
    }
}
