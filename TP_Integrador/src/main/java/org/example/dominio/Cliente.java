package org.example.dominio;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Objects;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @Column(name = "id_cliente", columnDefinition = "INTEGER")
    private Long id;

    @Column(name = "razon_social", columnDefinition = "VARCHAR(100)")
    private String razonSocial;

    @Column(name = "cuit", columnDefinition = "VARCHAR(100)")
    private String CUIT;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Incidente> incidentes;

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "cliente_servicios",
            joinColumns = {@JoinColumn(name = "id_cliente")},
            inverseJoinColumns = {@JoinColumn(name = "id_servicio")}
    )
    private Set<Servicio> serviciosContratados;

    public Cliente(){}

    public Cliente(String razonSocial, String CUIT) {
        this.razonSocial = razonSocial;
        this.CUIT = CUIT;
    }

    public boolean puedeReportarIncidente(String nombreServicio) {
        if (incidentes.stream()
                .anyMatch(incidente -> incidente.getTipoDeServicio().getNombre().equals(nombreServicio))
                && serviciosContratados.stream()
                .anyMatch(servicio -> servicio.getNombre().equals(nombreServicio))) return true;
        else return false;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente: ").append(razonSocial).append("\n");
        sb.append("CUIT: ").append(CUIT).append("\n");
        sb.append("Servicios contratados: ").append("\n");
        for (Servicio servicio : serviciosContratados) {
            sb.append("- ").append(servicio).append("\n");
        }
        return sb.toString();
    }
}