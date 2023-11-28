package org.example.dominio;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "servicios")
public class Servicio {

    @Id
    @Column(name = "id_servicio", columnDefinition = "INTEGER")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", columnDefinition = "VARCHAR(100)")
    private String nombre;

    @ManyToMany(mappedBy = "serviciosContratados")
    private Set<Cliente> clientes;

    public Servicio(){}

    @Override
    public String toString() {
        return "Servicio{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", clientes=" + clientes +
                '}';
    }
}
