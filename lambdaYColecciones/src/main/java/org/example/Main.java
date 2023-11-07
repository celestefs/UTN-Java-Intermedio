package org.example;


import org.example.Model.Cliente;
import org.example.Model.Factura;
import org.example.Model.TipoCompra;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Factura> facturas = initializeData();

        boolean todosCumplen = facturas.stream().allMatch( f -> f.getTipoCompra().equals(TipoCompra.FARMACIA));
        System.out.println(todosCumplen);

        boolean algunasCumplen = facturas.stream().anyMatch( f -> f.getTipoCompra().equals(TipoCompra.FARMACIA));
        System.out.println(algunasCumplen);

        boolean ningunaCumple = facturas.stream().noneMatch( f -> f.getTipoCompra().equals(TipoCompra.FARMACIA));
        System.out.println(ningunaCumple);


        boolean ClientesMay30 = facturas.stream()
                .anyMatch(f -> f.getCliente().getEdad()>30);
        System.out.println(ClientesMay30);


        List <Factura> facturasMenoresA3000 = facturas.stream()
                .filter(f -> f.getMonto() >= 3000d)
                .toList();

        facturasMenoresA3000.stream().forEach(System.out::println);


        List<Cliente> clientes = facturas.stream()
                .map(x -> x.getCliente())
                .distinct()
                .toList();

        clientes.forEach(System.out::println);


        List<String> clientes2 = facturas.stream()
                .map(x -> x.getCliente())
                .distinct() // para eliminar los repetidos
                .map(x-> x.getNombre() + " "  + x.getApellido() + " " + x.getEdad())
                .toList();
        clientes2.forEach(System.out::println);

        String clientes3 = facturas.stream()
                .map(x -> x.getCliente())
                .distinct()
                .map(x-> x.getNombre() + " "  + x.getApellido() + " " + x.getEdad())
                .collect(Collectors.joining(", "));
        System.out.println (clientes3);

        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.stream().forEach(System.out::println);

        boolean coincide = numeros.stream().anyMatch((numero) -> numero > 2);
        boolean coincide2 = numeros.stream().allMatch((numero) -> numero >= 1);

        System.out.println(coincide);
        System.out.println(coincide2);

        List<Integer> numerosDuplicados = numeros.stream()
                .map(numero -> numero * 2)
                .collect(Collectors.toList());

        System.out.println(numerosDuplicados);

        List<String> numerosString = new ArrayList<>();

        numerosString.add("1");
        numerosString.add("2");
        numerosString.add("3");

        System.out.println(numerosString);

        List<Integer> numeros2 = numerosString.stream()
                .mapToInt(numero -> Integer.valueOf(numero))
                .boxed()
                .collect(Collectors.toList());

        System.out.println(numeros2);

        List<String> textos = new ArrayList<>();

        textos.add("Primero");
        textos.add("Segundo");
        textos.add("Tercero");

        String textoResultante = textos.stream().collect(Collectors.joining(" - "));
        System.out.println(textoResultante);


        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .filter(i -> i % 2 == 0)
                .skip(2) // no muestra los dos primeros
                .limit(2) // muestra solo los dos primeros
                .forEach(i -> System.out.print(i + " "));

        List<Integer> numeros3 = new ArrayList<>();
        numeros3.add(4);
        numeros3.add(1);
        numeros3.add(8);
        Integer resultado = Collections.min(numeros3);
        System.out.println(resultado);

        Integer resultadoMax = Collections.max(numeros3);
        System.out.println(resultadoMax);

        int suma = numeros3.stream().mapToInt(Integer::intValue).sum();
        System.out.println(suma);
    }

    private static List<Factura> initializeData() {

        List<Factura> lista = new ArrayList<>();
        Factura f1 = new Factura();
        f1.setId(1);
        f1.setConcepto("Detergente CIF Té Verde");
        f1.setMonto(1000.20d);
        f1.setTipoCompra(TipoCompra.ALMACEN);
        f1.setCliente(new Cliente());
        f1.getCliente().setApellido("Gauna");
        f1.getCliente().setNombre("Rodolfo");
        f1.getCliente().setCuit("20-45689652-4");
        f1.getCliente().setId(5);
        f1.getCliente().setFechaNac(LocalDate.of(1980, 10, 27));

        lista.add(f1);

        f1 = new Factura();
        f1.setId(2);
        f1.setConcepto("Omeprazol 50mg");
        f1.setMonto(1500.00d);
        f1.setTipoCompra(TipoCompra.FARMACIA);
        f1.setCliente(new Cliente());
        f1.getCliente().setApellido("Estevanez");
        f1.getCliente().setNombre("Lucía");
        f1.getCliente().setCuit("20-15879879-4");
        f1.getCliente().setId(7);
        f1.getCliente().setFechaNac(LocalDate.of(1975, 7, 28));

        lista.add(f1);

        f1 = new Factura();
        f1.setId(3);
        f1.setConcepto("Frutillas x kg");
        f1.setMonto(1250.99d);
        f1.setTipoCompra(TipoCompra.VERDULERIA);
        f1.setCliente(new Cliente());
        f1.getCliente().setApellido("Estevanez");
        f1.getCliente().setNombre("Lucía");
        f1.getCliente().setCuit("20-15879879-4");
        f1.getCliente().setId(7);
        f1.getCliente().setFechaNac(LocalDate.of(1975, 7, 28));

        lista.add(f1);

        f1 = new Factura();
        f1.setId(4);
        f1.setConcepto("Durazno Moño Azul x kg");
        f1.setMonto(1250.99d);
        f1.setTipoCompra(TipoCompra.VERDULERIA);
        f1.setCliente(new Cliente());
        f1.getCliente().setApellido("Córdoba");
        f1.getCliente().setNombre("Mauro");
        f1.getCliente().setCuit("21-04586239-7");
        f1.getCliente().setId(15);
        f1.getCliente().setFechaNac(LocalDate.of(1993, 8, 7));

        lista.add(f1);

        f1 = new Factura();
        f1.setId(5);
        f1.setConcepto("Papel Higiénico Higienol x 80 m");
        f1.setMonto(5300.00d);
        f1.setTipoCompra(TipoCompra.ALMACEN);
        f1.setCliente(new Cliente());
        f1.getCliente().setApellido("Martinez");
        f1.getCliente().setNombre("Guadalupe");
        f1.getCliente().setCuit("21-26745963-7");
        f1.getCliente().setId(17);
        f1.getCliente().setFechaNac(LocalDate.of(1995, 3, 27));

        lista.add(f1);

        f1 = new Factura();
        f1.setId(6);
        f1.setConcepto("Papel Higiénico Higienol x 80 m");
        f1.setMonto(5300.00d);
        f1.setTipoCompra(TipoCompra.ALMACEN);
        f1.setCliente(new Cliente());
        f1.getCliente().setApellido("Martinez");
        f1.getCliente().setNombre("Guadalupe");
        f1.getCliente().setCuit("21-26745963-7");
        f1.getCliente().setId(17);
        f1.getCliente().setFechaNac(LocalDate.of(1995, 3, 27));

        lista.add(f1);

        f1 = new Factura();
        f1.setId(7);
        f1.setConcepto("Ibuprofeno 600g");
        f1.setMonto(580.50d);
        f1.setTipoCompra(TipoCompra.FARMACIA);
        f1.setCliente(new Cliente());
        f1.getCliente().setApellido("Martinez");
        f1.getCliente().setNombre("Guadalupe");
        f1.getCliente().setCuit("21-26745963-7");
        f1.getCliente().setId(17);
        f1.getCliente().setFechaNac(LocalDate.of(1995, 3, 27));

        lista.add(f1);

        return lista;
    }
}