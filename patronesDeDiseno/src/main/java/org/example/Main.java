package org.example;

import org.example.Banco.Banco;
import org.example.Banco.Persona;
import org.example.Mesa.Mesa;
import org.example.TemplateMethod.Cliente;
import org.example.TemplateMethod.Empleado;
import org.example.TemplateMethod.Humano;
import org.example.TemplateMethod.Socio;

public class Main {

    public static void main(String[] args) {

        // EJEMPLO BANCO:
        Persona persona1 = new Persona("Juan","Perez",21);
        Persona persona2 = new Persona("Sabrina","Campas",71); //Tiene prioridad por edad > 65
        Persona persona3 = new Persona("Liz","Juarez",82); //Tiene prioridad por edad > 65
        Persona persona4 = new Persona("Juana","Monteno",42);

        Banco banco = new Banco();

        // ATENCION NORMAL
        banco.atende(persona1);
        banco.atende(persona2);
        banco.atende(persona3);
        banco.atende(persona4);

        // SUSPENDIDA
        banco.suspendeVentanilla();
        banco.atende(persona1);
        banco.atende(persona2); // prioridad


        // CERRADA
        banco.cerraVentanilla();
        banco.atende(persona4);

        banco.abriVentanilla();
        banco.atende(persona4);

        // EJEMPLO MESA:
        Mesa m1 = new Mesa();
        m1.setNumber(8);
        m1.setComensales(3);

        m1.reservar();
        m1.liberar();
        m1.reservar();
        m1.ocupar();
        m1.reservar();

        m1.liberar();
        m1.liberar();
        m1.ocupar();
        m1.ocupar();
        m1.reservar();

        // EJEMPLO PERSONA:
        Humano p = new Cliente(12122);
        System.out.println("El cliente dice: ");
        System.out.println(p.identificate());

        System.out.println("El empleado dice: ");
        p = new Empleado("AD 1245");
        System.out.println(p.identificate());

        System.out.println("El socio dice: ");
        p = new Socio(24444);
        System.out.println(p.identificate());

    }
}