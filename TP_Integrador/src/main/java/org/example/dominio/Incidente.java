package org.example.dominio;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "incidentes")
public class Incidente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "descripcion", columnDefinition = "VARCHAR(100)")
    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @OneToOne(mappedBy = "incidenteAsignado", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private Tecnico tecnico;

    @Column(name = "fecha_ingreso", columnDefinition = "INTEGER")
    private Date fechaIngreso;

    @Column(name = "fecha_resolucion", columnDefinition = "INTEGER")
    private Date fechaEstimadaResolucion;

    private Especialidad especialidadRequeridaParaResolverlo;

    private Servicio tipoDeServicio;

    @Column(name = "estado", columnDefinition = "VARCHAR(100)")
    private Estado estado;

    public Incidente() {
        estado = new Creado();
    }

    @Override
    public String toString() {
        return "Incidente{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", cliente=" + cliente +
                ", tecnico=" + tecnico +
                ", fechaIngreso=" + fechaIngreso +
                ", fechaEstimadaResolucion=" + fechaEstimadaResolucion +
                ", especialidadRequeridaParaResolverlo=" + especialidadRequeridaParaResolverlo +
                ", tipoDeServicio=" + tipoDeServicio +
                ", estado=" + estado +
                '}';
    }
}

