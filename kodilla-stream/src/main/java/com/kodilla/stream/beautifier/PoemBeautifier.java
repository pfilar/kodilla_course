package com.kodilla.stream.beautifier;
import com.kodilla.stream.beautifier.PoemDecorator;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator poemDecorator){             // jako parametry będzie można przekazać tekst do upiększenia
        //poemDecorator.decorate();
        String result = poemDecorator.decorate(text);
        System.out.println(result);
    }

    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("tekst 1", (text) -> text.toUpperCase());
        poemBeautifier.beautify("tekst 2", (text) -> "*" + text + "*");
    }
}
