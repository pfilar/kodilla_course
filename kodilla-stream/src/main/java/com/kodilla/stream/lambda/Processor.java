package com.kodilla.stream.lambda;

public class Processor {

    public void execute(Executor executor){     // argument obiekt dowolnej klasy implementującej interfejs Executor
        executor.process();
    }
}
