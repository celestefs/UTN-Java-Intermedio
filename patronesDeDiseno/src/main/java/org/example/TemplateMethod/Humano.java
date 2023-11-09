package org.example.TemplateMethod;

public abstract class Humano {
    private String nombre;
    private String DNI;

    public String identificate() {
        String frase = "Me identifico con: ";
        frase = frase + getTipoId();
        frase = frase + ". El nro es: ";
        frase = frase + getIdentificacion();
        return frase;
    }

    protected abstract String getIdentificacion();

    protected abstract String getTipoId();

    public String getNombre() {
        return nombre;
    }
}

