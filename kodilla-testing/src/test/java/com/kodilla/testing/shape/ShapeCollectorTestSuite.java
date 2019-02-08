package com.kodilla.testing.shape;

import org.junit.*;
import org.junit.rules.TestName;

public class ShapeCollectorTestSuite {
    @Rule
    public TestName name = new TestName();

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
        System.out.println("Preparing to execute test " + name.getMethodName());
    }

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape1 = new Square(1.0);

        //When
        shapeCollector.addShape(shape1);

        //Then
        Assert.assertEquals(1, shapeCollector.getShapes().size());

    }

    @Test
    public void testRemoveFigureNotExisting() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape1 = new Square(1.0);

        //When
        boolean result = shapeCollector.removeFigure(shape1);

        //Then
        Assert.assertFalse(result);

    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape1 = new Square(1.0);
        Shape shape2 = new Triangle(1.0);
        Shape shape3 = new Circle(1.0);
        shapeCollector.addShape(shape1);
        shapeCollector.addShape(shape2);
        shapeCollector.addShape(shape3);

        //When
        boolean result = shapeCollector.removeFigure(shape2);

        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(2, shapeCollector.getShapes().size());

    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape1 = new Square(1.0);
        shapeCollector.addShape(shape1);

        //When
        Shape retrievedShape;
        retrievedShape = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(shape1, retrievedShape);
    }

    @Test
    public void testShowFigures() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape1 = new Square(1.0);
        shapeCollector.addShape(shape1);

        //When
        boolean result = shapeCollector.showFigures();

        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testShowFiguresInEmpty() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape shape1 = new Square(1.0);

        //When
        boolean result = shapeCollector.showFigures();

        //Then
        Assert.assertFalse(result);
    }
}