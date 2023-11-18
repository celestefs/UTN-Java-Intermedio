package org.example.dominio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public class Cliente {

    private String razonSocial;

    private String CUIT;

    private List<Servicio> serviciosContratados;

    public Cliente( String razonSocial, String CUIT) {
        this.razonSocial = razonSocial;
        this.CUIT = CUIT;
        this.serviciosContratados = new ArrayList<>();
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
