package com.kodilla.stream;
import com.kodilla.stream.beautifier.PoemDecorator;

public class PoemBeautifier {
    public void beautify(String word, PoemDecorator poemDecorator){             // jako parametry będzie można przekazać tekst do upiększenia
        //poemDecorator.decorate();
        String result = poemDecorator.decorate(word);
        System.out.println(result);
    }

}
