package com.kodilla.testing.collection;
import java.util.*;

public class OddNumbersExterminator {
    public List<Integer> exterminate(ArrayList<Integer> numbers){
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < numbers.size(); i++) {
            Integer element = numbers.get(i);
            if(element % 2 == 0) {
                result.add(element);
            }
        }
        return result;
    }
}
