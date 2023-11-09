package org.example.TemplateMethod;

public class Empleado extends Humano {
    private String legajo;

    public Empleado(String legajo) {
        setLegajo(legajo);
    }

    protected String getIdentificacion() {
        return legajo;
    }

    protected String getTipoId() {
        return "numero de legajo";
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }
}

