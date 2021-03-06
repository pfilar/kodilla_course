package com.kodilla.exception.io;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileReader {
    public void readFile() throws FileReaderException {
        ClassLoader classLoader = getClass().getClassLoader();  // klasa odpowiedzialna za odnalezienie klas i plików wewnątrz naszej aplikacji
        File file = new File(classLoader.getResource("file/names.txt").getFile());  // wywołanie metody, która wskazuje klasie ClassLoader, gdzie powinna szukać pliku
        //Path path = Paths.get(file.getPath());   // zapisane do kodu poniżej

        try (Stream<String> fileLines = Files.lines(Paths.get(file.getPath()))) {

            fileLines.forEach(System.out::println);

        } catch (IOException e) {
            throw new FileReaderException();
            //System.out.println("Oh no! Something went wrong!" + e);

        } finally {

            System.out.println("I am gonna be hear always");
        }
    }
}
