package org.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        try {
            List <String> stream = Files.lines(Paths.get("src//file.txt")).toList();
            stream.stream().forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("non riesco a leggere!");
        }
    }
}
