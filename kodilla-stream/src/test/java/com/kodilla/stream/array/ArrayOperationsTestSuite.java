package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int numbers [] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double expect = 5.5;

        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        Assert.assertEquals(expect, average, 0.0001);
    }
}
