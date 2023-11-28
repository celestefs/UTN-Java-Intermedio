package org.example.dominio;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "especialidades")
public class Especialidad {

    @Id
    @Column(name = "id_especialidad")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", columnDefinition = "VARCHAR(100)")
    private String nombre;

    @ManyToMany(mappedBy = "especialidades")
    private Set<Tecnico> tecnicos;

    public Especialidad() {}
}
