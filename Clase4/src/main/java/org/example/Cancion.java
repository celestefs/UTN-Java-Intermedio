package org.example;

public class Cancion {
    private String titulo;
    private String nombreAlbum;
    private int fechaAlbum;
    private String artista;
    private int reproducciones;
    private int dislikes;
    private int likes;
    private int ultimaReproduccion;
    private EstadoCancion estado;

    public Cancion(String titulo, String artista, String nombreAlbum, int fechaAlbum) {
        this.titulo = titulo;
        this.artista = artista;
        this.nombreAlbum = nombreAlbum;
        this.fechaAlbum = fechaAlbum;
        estado = new Normal();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getNombreAlbum() {
        return nombreAlbum;
    }

    public void setNombreAlbum(String nombreAlbum) {
        this.nombreAlbum = nombreAlbum;
    }

    public int getFechaAlbum() {
        return fechaAlbum;
    }

    public void setFechaAlbum(int fechaAlbum) {
        this.fechaAlbum = fechaAlbum;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getReproducciones() {
        return reproducciones;
    }

    public void setReproducciones(int reproducciones) {
        this.reproducciones = reproducciones;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getUltimaReproduccion() {
        return ultimaReproduccion;
    }

    public void setUltimaReproduccion(int ultimaReproduccion) {
        this.ultimaReproduccion = ultimaReproduccion;
    }

    public void setEstado(EstadoCancion estado) {
        this.estado = estado;
    }

    public EstadoCancion getEstado() {
        return estado;
    }

    public void setToNormal() {
        this.estado.setToNormal(this);
    }

    public void setToAuge() {
        this.estado.setToAuge(this);
    }

    public void setToTendencia() {
        this.estado.setToTendencia(this);
    }

}
