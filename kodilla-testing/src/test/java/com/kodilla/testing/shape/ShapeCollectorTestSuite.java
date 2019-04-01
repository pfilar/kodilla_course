package com.kodilla.testing.shape;
import org.junit.*;
import static org.junit.Assert.*;   // import statyczny całej klasy


public class ShapeCollectorTestSuite {

    private ShapeCollector shapeCollector;   // = new ShapeCollector();  / testy wpływały by na siebie nie można tak

    public static int testCounter = 0;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("This is the beginning of tests");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("All tests are finished");
    }

    @Before                             // wyświetlenie nr testu przed każdym testem
    public void beforeEachTest() {
        shapeCollector = new ShapeCollector(); // po inicjalizacji tutaj m świeżą kopię, każdy test jest niezależny od siebie
        testCounter ++;
        System.out.println("Execute Test number: " + testCounter);
    }

    @Test
    public void testAddFigure(){
        // shapeCollector = new ShapeCollector();   / mamy to z metody beforeEachTest()  // ShapeCollector shapeCollector = new ShapeCollector(); - źle przysłania
        shapeCollector.addFigure(new Circle(4));
        shapeCollector.addFigure(new Square(5));
        shapeCollector.addFigure(new Triangle(3, 5));

        assertEquals(3, shapeCollector.size());
    }

    @Test
    public void testRemoveFigure() {
        Shape figure1 = new Circle(4);
        Shape figure2 = new Square(5);
        Shape figure3 = new Triangle(3,5);

        shapeCollector.addFigure(figure1);   // nie można użyć tworzenia w "locie", lepiej stworzyć referencje (wcześniejsze linie kodu)
        shapeCollector.addFigure(figure2);
        shapeCollector.addFigure(figure3);
        shapeCollector.removeFigure(figure1);

        assertEquals(figure2, shapeCollector.getFigure(0));
        assertEquals(figure3, shapeCollector.getFigure(1));
        assertEquals(2, shapeCollector.size());
    }

    @Test
    public void testGetFigure() {
        shapeCollector.addFigure(new Circle(4));
        shapeCollector.addFigure(new Square(5));
        shapeCollector.addFigure(new Triangle(3, 5));

        assertTrue(shapeCollector.getFigure(0) instanceof Circle);  // zwróci prawde jeżeli na indekjsie 0 jest figura typu Circle
        assertTrue(shapeCollector.getFigure(1) instanceof Square);
        assertTrue(shapeCollector.getFigure(2) instanceof Triangle);
    }


}
