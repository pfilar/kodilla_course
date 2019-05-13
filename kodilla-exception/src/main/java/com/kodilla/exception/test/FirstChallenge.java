package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {   // informacja o wyjątku zgłaszanym przez metodę
        if(b == 0){
            throw new ArithmeticException();    // crlt + B  albo ctrl + l myszy  / ablo sprawdzenie ctrl + h
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        try {
            double result = firstChallenge.divide(3, 0);

            System.out.println(result);

        } catch(ArithmeticException e) {
            System.out.println(e);//e.printStackTrace();
        }
    }
}
