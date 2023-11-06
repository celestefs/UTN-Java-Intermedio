package org.example;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        // EXPRESION LAMBDA COMO VARIABLE

        Suma lambdaSuma = (num1, num2) -> num1 + num2;

        int num1 = 3;
        int num2 = 5;
        int resultadoSuma = lambdaSuma.sumar(num1, num2);
        System.out.println(resultadoSuma);

        // EXPRESION LAMBDA COMO PARAMETRO

        int unNumero = 10;
        int otroNumero = 5;

        int suma = calcular(unNumero, otroNumero, (a, b) -> a + b);
        System.out.println("La suma de " + unNumero + " y " + otroNumero + " es: " + suma);

        int resta = calcular(unNumero, otroNumero, (a, b) -> a - b);
        System.out.println("La resta de " + unNumero + " y " + otroNumero + " es: " + resta);

        int producto = calcular(unNumero, otroNumero, (a, b) -> a * b);
        System.out.println("El producto de " + unNumero + " y " + otroNumero + " es: " + producto);

        int cociente = calcular(unNumero, otroNumero, (a, b) -> a / b);
        System.out.println("El cociente de " + unNumero + " y " + otroNumero + " es: " + cociente);

        //INTERFAZ FUNCIONAL SUPPLIER

        Supplier<Double> randomGenerator = () -> Math.random();

        double randomNumber = randomGenerator.get();
        System.out.println("El numero aleatorio es: " + randomNumber);

        //INTERFAZ FUNCIONAL PREDICATE

        Predicate<Integer> isEvenPredicate = number -> number % 2 == 0;
        System.out.println(isEvenPredicate.test(4));

        Predicate<String> startsWithS = string -> string.startsWith("S");
        System.out.println(startsWithS.test("Susana"));
        System.out.println(startsWithS.test("Merlo"));

        //INTERFAZ FUNCIONAL CONSUMER

        Consumer<String> printConsumer = str -> System.out.println(str); // imprime un valor
        printConsumer.accept("Hola mundo!");

        Consumer<StringBuilder> appendConsumer = sb -> sb.append(" adiós"); // modifica un valor
        StringBuilder stringBuilder = new StringBuilder("Hola");
        appendConsumer.accept(stringBuilder);
        System.out.println(stringBuilder.toString());

        //INTERFAZ FUNCIONAL FUNCTION

        Function<String, String> toUpperCaseFunction = str -> str.toUpperCase();
        String upperCaseString = toUpperCaseFunction.apply("hello");
        System.out.println(upperCaseString);

        Function<Double, Double> calcularCuadrado = (x) -> Math.pow(x, 2);
        System.out.println(calcularCuadrado.apply(5d));
    }
    public static int calcular(int unNumero, int otroNumero, Operacion operacion) {
        return operacion.aplicar(unNumero, otroNumero);
    }
}