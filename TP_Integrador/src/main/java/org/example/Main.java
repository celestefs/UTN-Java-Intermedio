package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.example.dominio.Cliente;
import org.example.dominio.Servicio;
import org.example.dominio.Tecnico;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("a");
        EntityManager entityManager = emf.createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();

        entityTransaction.begin();
        Cliente cliente = new Cliente("Juana Fitz", "987556598");
        entityManager.persist(cliente);
        entityTransaction.commit();

    }

}