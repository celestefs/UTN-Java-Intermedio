package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        strings.add("Buenas tardes");
        strings.add("a");
        strings.add("todos");

        System.out.println("Esta es la lista de strings original: " + strings);

        List<String> transformedStrings = transformStrings(strings, String::toUpperCase);

        System.out.println("Esta es la lista de strings transformado:");

        for (String transformedString : transformedStrings) {
            System.out.println(transformedString);
        }
    }

    public static List<String> transformStrings(List<String> strings, Mayuscula mayuscula) {
        List<String> transformedStrings = new ArrayList<>();

        for (String a : strings) {
            String transformedString = mayuscula.transform(a);
            transformedStrings.add(transformedString);
        }

        return transformedStrings;
    }
}