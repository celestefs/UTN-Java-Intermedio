package org.example.TemplateMethod;

public class Socio extends Humano {
    private int numeroDeSocio;

    public Socio (int numeroDeSocio) {
        setNumeroDeSocio(numeroDeSocio);
    }
    protected String getIdentificacion() {
        return String.valueOf(numeroDeSocio);
    }
    protected String getTipoId() {
        return "numero de socio";
    }
    public int getNumeroDeSocio() {
        return numeroDeSocio;
    }
    public void setNumeroDeSocio(int numeroDeSocio){
        this.numeroDeSocio = numeroDeSocio;
    }
}
