package org.example.dominio;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class MesaDeAyuda {

    private List<Tecnico> tecnicosDisponibles;

    private List<Incidente> incidentes;

}
