package com.rodrigopeleias.sdkman.java8;

import java.util.ArrayList;
import java.util.List;

public class Java8 {

    public static void main(String[] args) {
        System.out.println("\nThis is a Java 8 code snippet");

        List<String> programmersList = new ArrayList<>();
        programmersList.add("Rodrigo Peleias");
        programmersList.add("Tião");
        programmersList.add("Marcos");
        programmersList.add("Renato");
        programmersList.add("André Siqueira");

        programmersList.forEach(System.out::println);

        System.out.println("\nFiltered names with Stream:");
        programmersList.stream()
                .filter(name -> name.startsWith("R"))
                .filter(name -> name.length() > 5)
                .forEach(System.out::println);
    }
}
