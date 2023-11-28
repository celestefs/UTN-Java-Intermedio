package org.example.dominio;

public class Creado implements Estado {

    @Override
    public void creado(Incidente incidente) {
        Cliente cliente = incidente.getCliente();
        if (cliente.getIncidentes() != null) {
            incidente.setEstado(new Creado());
            System.out.println("El cliente " + cliente.getRazonSocial() + "ha reportado un incidente.");
        } else {
            System.out.println("El cliente " + cliente.getRazonSocial() + " no parece haber reportado ningún incidente.");
        }
    }

    @Override
    public void asignado(Incidente incidente) {

    }

    @Override
    public void resuelto(Incidente incidente) {

    }

    @Override
    public String toString() {
        return "Creado{}";
    }

}
