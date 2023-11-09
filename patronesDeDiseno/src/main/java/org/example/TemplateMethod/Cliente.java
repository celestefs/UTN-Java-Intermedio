package org.example.TemplateMethod;

public class Cliente extends Humano {
    private int numeroDeCliente;

    public Cliente (int numeroDeCliente) {
        setNumeroDeCliente(numeroDeCliente);
    }
    protected String getIdentificacion() {
        return String.valueOf(numeroDeCliente);
    }
    protected String getTipoId() {
        return "numero de cliente";
    }
    public int getNumeroDeCliente() {
        return numeroDeCliente;
    }
    public void setNumeroDeCliente(int numeroDeCliente){
        this.numeroDeCliente = numeroDeCliente;
    }
}
