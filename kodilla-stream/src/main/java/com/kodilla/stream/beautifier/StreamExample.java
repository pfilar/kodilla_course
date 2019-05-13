package com.kodilla.stream.beautifier;

import java.util.stream.Stream;

public class StreamExample {

    public static void stringBuild(int max) {
        Stream.iterate(1, n -> n + 1)
                .limit(max)
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        stringBuild(20);
    }
}
