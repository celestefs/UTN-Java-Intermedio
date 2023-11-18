package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.dominio.Cliente;
import org.example.dominio.Servicio;
import org.example.dominio.Tecnico;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Servicio> serviciosCliente1 = new ArrayList<>();

        serviciosCliente1.add(new Servicio("Agua"));
        serviciosCliente1.add(new Servicio("Luz"));
        serviciosCliente1.add(new Servicio("Internet"));

        Cliente client = new Cliente("Pepe Funes",  "25856963");
        client.setServiciosContratados(serviciosCliente1);

        System.out.println(client);


        Tecnico tecnico1 = new Tecnico("Juan", "perez", "email");
        Tecnico tecnico2 = new Tecnico("Martin", "aguirre", "whatsapp");

        List<Tecnico> listaTecnicos = new ArrayList<>();
        listaTecnicos.add(tecnico1);
        listaTecnicos.add(tecnico2);

        System.out.println(listaTecnicos);

    }

    public static EntityManager getEntityManager(){
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("trabajo_integrador");
        EntityManager manager = factory.createEntityManager();
        return manager;
    }

}