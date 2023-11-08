package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        // EJERCICIO 1:

        List<String> lista = new ArrayList<>();

        lista.add("Buenas");
        lista.add("Noches");

        List<String> listaConMayusculas= listaConMayuscula(lista);

        System.out.println(listaConMayusculas);

        // EJERCICIO 2:

        List<String> texto = new ArrayList<>();

        texto.add("Miércoles");
        texto.add("Jueves");
        texto.add("Viernes");
        texto.add("Sábado");

        String textoConcatenado = concatenar(texto,6);

        System.out.println(textoConcatenado);

    }

    public static List<String> listaConMayuscula(List<String> lista) {

        return lista.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static String concatenar(List<String> lista, int n) {

        return lista.stream()
                .filter(l -> l.length() > n)
                .collect(Collectors.joining(", "));
    }
}