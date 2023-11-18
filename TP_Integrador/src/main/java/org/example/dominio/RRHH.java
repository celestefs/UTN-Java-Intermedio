package org.example.dominio;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class RRHH {

    private List<Tecnico> tecnicos;

    public void alta(Tecnico tecnico) {
        System.out.println("El tecnico " + tecnico.getNombre() + " " + tecnico.getApellido() + " ha sido incorporado a la empresa.");
    }
    public void baja(Tecnico tecnico){
        System.out.println("El tecnico " + tecnico.getNombre() + " " + tecnico.getApellido() + " ha sido dado de baja.");
    }
}
