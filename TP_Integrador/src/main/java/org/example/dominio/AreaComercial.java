package org.example.dominio;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class AreaComercial {

    private List<Cliente> clientes;

    public void alta(Cliente cliente) {
        System.out.println("El cliente " + cliente.getRazonSocial() + " ha sido incorporado a la empresa.");
    }
    public void baja(Cliente cliente) {
        System.out.println("El cliente " + cliente.getRazonSocial() + " ha sido dado de baja.");
    }
}
