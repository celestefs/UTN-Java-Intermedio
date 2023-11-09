package org.example.Mesa;
public class Mesa {
    private int comensales;
    private int number;
    private Estado state = new Libre();

    public int getComensales() {
        return comensales;
    }
    public void setComensales(int comensales) {
        this.comensales = comensales;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void setState(Estado state) {
        this.state = state;
    }
    public void reservar() {
        this.state.reservar(this);
    }
    public void ocupar() {
        this.state.ocupar(this);
    }
    public void liberar() {
        this.state.liberar(this);
    }
}
