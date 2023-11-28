package org.example.dominio;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "tecnicos")
public class Tecnico {

    @Id
    @Column(name = "id_tecnico")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", columnDefinition = "VARCHAR(100)")
    private String nombre;

    @Column(name = "apellido", columnDefinition = "VARCHAR(100)")
    private String apellido;

    @Column(name = "medio_notificacion", columnDefinition = "VARCHAR(100)")
    private String medioNotificacion;

    @OneToOne(fetch = FetchType.LAZY, cascade = { CascadeType.ALL })
    @JoinColumn(name = "id_incidente")
    private Incidente incidenteAsignado;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "tecnico_especialidades",
            joinColumns = {@JoinColumn(name = "id_tecnico")},
            inverseJoinColumns = {@JoinColumn(name = "id_especialidad")}
    )
    private Set<Especialidad> especialidades;

    public Tecnico() {}

    public boolean estaDisponible() {
        if (incidenteAsignado == null) {
            return true;
        }
        return false;
    }

    public boolean puedeResolverIncidente() {
        if (getEspecialidades().stream()
                .anyMatch(e -> e.getNombre().equals(incidenteAsignado.getEspecialidadRequeridaParaResolverlo()))) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tecnico: Nombre - ").append(nombre).append("\n");
        sb.append("Apellido- ").append(apellido).append("\n");
        sb.append("Medio de notificación- ").append(medioNotificacion).append("\n");
        sb.append("Especialidades: ").append("\n");
        for (Especialidad especialidad : especialidades) {
            sb.append("- ").append(especialidad).append("\n");
        }
        return sb.toString();
    }

}