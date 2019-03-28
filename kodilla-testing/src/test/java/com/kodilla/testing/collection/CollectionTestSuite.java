package com.kodilla.testing.collection;
import com.kodilla.testing.collection.OddNumbersExterminator;
import java.util.*;
import org.junit.*;
import org.junit.rules.*;
import static org.junit.Assert.*;


public class CollectionTestSuite {

    @Rule
    public TestName testName; // https://junit.org/junit4/javadoc/4.12/org/junit/rules/TestName.html

    private OddNumbersExterminator oddNumbersExterminator;
    private ArrayList<Integer> list;

    public CollectionTestSuite() {
        testName = new TestName();
    }

    @Before
    public void before(){
        oddNumbersExterminator = new OddNumbersExterminator();
        System.out.println("Test Case: begin " + testName.getMethodName());
    }

    @After
    public void after(){
        System.out.println("Test Case: end " + testName.getMethodName());
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        // Given
        list = new ArrayList<>();
        // When
        List<Integer> result = oddNumbersExterminator.exterminate(list);
        // Then
        assertEquals(0, result.size());
    }
    @Test
    public void testOddNumbersExterminatorNormalList() {
        // Given
        list = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            list.add(i);
        }
        // When
        List<Integer> result = oddNumbersExterminator.exterminate(list);
        // Then
        assertArrayEquals(new Integer[] { 2, 4, 6, 8, 10 }, result.toArray());
    }
}
