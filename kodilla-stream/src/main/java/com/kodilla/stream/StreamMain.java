package com.kodilla.stream;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {

    public static void main(String[] args) {

//        Wcześniejszy kod bez Lambdy
//        Processor processor = new Processor();  // uruchamianie przekazywanych do metody execute(Executor executor) obiektów implementujących interfejs Executor
//        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething(); // tworzenie obiektu który będzie przekazany do metody
//        processor.execute(executeSaySomething);  // wywołanie metody execute(Executor executor) klasy Processor

        //Lambda
        //Processor processor = new Processor();  // obiekt klasy Processor, który odpowiedzialny jest za wykonywanie kodu, który zostanie przekazany jako parametr (kod musi implementować interfejs Executor)
        //Executor codeToExecute = () -> System.out.println("This is example text.");  // tworzone jest wyrażenie lambda i przypisywane do zmiennej codeToExecute
        //processor.execute(codeToExecute);  // wywoływana jest metoda execute klasy Processor, która jako argument otrzymuje wyrażenie lambda codeToExecute

        // do powyższego,  zmiennej codeToExecute nie trzeb tworzyć
        //Processor processor1 = new Processor();
        //processor.execute(() -> System.out.println("This is example text."));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        System.out.println();
        System.out.println("Unit 7 task 1");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("firstWord", (word) -> word + "ABC");
        poemBeautifier.beautify("secondWord", (word) -> word.toUpperCase());      // metody Stringa:   https://stormit.pl/string-metody/
        poemBeautifier.beautify("thirdWord", (word) -> "DEF " + word + " ABC");
        poemBeautifier.beautify("fourthWord", (word) -> word.toUpperCase() + "*");
        poemBeautifier.beautify("fifthWord", (word) -> word + "ABC");
    }
}
