package com.rodrigopeleias.sdkman.java9;

import java.util.List;

public class Java9 {

    public static void main(String[] args) {
        System.out.println("\nThis is a Java 9 code snippet");

        List<String> programmersList = List.of(
                "Rodrigo Peleias",
                "Tião",
                "Marcos",
                "Renato",
                "André Siqueira");

        programmersList.forEach(System.out::println);

        System.out.println("\nFiltered names with Stream:");
        programmersList.stream()
                .filter(name -> name.startsWith("R"))
                .filter(name -> name.length() > 5)
                .forEach(System.out::println);
    }
}
