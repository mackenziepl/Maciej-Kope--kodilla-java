package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        shapeCollector.addFigure(new Circle(1));

        //Then
        int size = shapeCollector.getFigureSize();
        Assert.assertEquals(1, size);
    }
    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle(1);
        shapeCollector.addFigure(circle);

        //When
        boolean result = shapeCollector.removeFigure(circle);

        //Then
        int size = shapeCollector.getFigureSize();
        Assert.assertEquals(0, size);
    }
    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Circle(1));
        Square square = new Square(2);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(new Triangle(2,3));

        //When
        Shape result = shapeCollector.getFigure(1);

        //Then
        Assert.assertEquals(square, result);
    }
    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(new Triangle(2,3));
        shapeCollector.addFigure(new Triangle(3,4));

        //When
         String wynik = shapeCollector.showFigures();

        //Then
        Assert.assertEquals("TriangleTriangle", wynik);
    }
}
