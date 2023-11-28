package org.example.dominio;

public class Asignado implements Estado {
    @Override
    public void creado(Incidente incidente) {

    }

    @Override
    public void asignado(Incidente incidente) {
        Tecnico tecnico = incidente.getTecnico();
        if (tecnico.estaDisponible()) {
            incidente.setEstado(new Asignado());
            System.out.println("Al técnico " + tecnico.getNombre() + " se le ha asignado el incidente.");
        } else {
            System.out.println("El técnico no se encuentra disponible para resolver el incidente.");
        }
    }

    @Override
    public void resuelto(Incidente incidente) {

    }

    @Override
    public String toString() {
        return "Asignado{}";
    }
}
