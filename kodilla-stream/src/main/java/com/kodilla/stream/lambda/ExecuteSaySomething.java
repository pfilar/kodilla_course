package com.kodilla.stream.lambda;

public class ExecuteSaySomething implements Executor {  // klasa implementująca interfejs Executor

    @Override
    public void process() {
        System.out.println("This is example text.");
    }
}
