package com.kodilla.exception.io;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReaderWithoutHandling {
    public void readFile() throws IOException {
        ClassLoader classLoader = getClass().getClassLoader();  // klasa odpowiedzialna za odnalezienie klas i plików wewnątrz naszej aplikacji
        File file = new File(classLoader.getResource("file/names.txt").getFile());  // wywołanie metody, która wskazuje klasie ClassLoader, gdzie powinna szukać pliku

        Stream<String> fileLines = Files.lines(Paths.get(file.getPath()));
        fileLines.forEach(System.out::println);
    }
}
