package com.rodrigopeleias.sdkman.java10;

import java.util.ArrayList;

public class Java10 {

    public static void main(String[] args) {
        System.out.println("\nThis is a Java 10 code snippet");

        var programmersList = new ArrayList<String>();
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
