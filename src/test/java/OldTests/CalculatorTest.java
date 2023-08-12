package test.java.OldTests;

import ro.sit.course.course06_07.Calculator;
import org.junit.*;
import org.junit.Test;
import org.junit.Assert;
public class CalculatorTest {static double totalSum = 0;
    double result = 1;

    Calculator calculator = new Calculator();

    @Before
    public void resetResult() {
        result = 0;
    }

    @After
    public void calculateTotalSum() {
        totalSum += result;
    }

    @AfterClass()
    public static void printTotalSum() {
        System.out.println("Total sum is: " + totalSum);
    }

    @Test()
    public void testMultiplyForZero() {
        System.out.println("Initial result: " + result);
        result = calculator.compute(0, 1, "*");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(0, result, 0);
    }

    @Test()
    public void testMultiplyForZero1() {
        System.out.println("Initial result: " + result);
        result = calculator.compute(0, -1, "*");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(0, result, 0);
    }

    @Test()
    public void testMultiplyForZero2() {
        System.out.println("Initial result: " + result);
        result = calculator.compute(0, 0, "*");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(0, result, 0);
    }

    @Test()
    public void testAddition() {
        System.out.println("Initial result: " + result);
        result = calculator.compute(100, 25, "+");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(125, result, 0);
    }

    @Test()
    public void testAddition1() {
        System.out.println("Initial result: " + result);
        result = calculator.compute(70, -30, "+");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(40, result, 0);
    }

    @Test()
    public void testAddition2() {
        double max = Double.MAX_VALUE;
        double min = Double.MAX_VALUE;
        System.out.println("Initial result: " + result);
        result = calculator.compute(max, min, "+");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(0, result, 0);
    }

    @Test()
    public void testSubtraction() {
        System.out.println("Initial result: " + result);
        result = calculator.compute(20, 1, "-");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(19, result, 0);
    }

    @Test()
    public void testSubtraction1() {
        double max = Double.MAX_VALUE;
        double min = Double.MAX_VALUE;
        System.out.println("Initial result: " + result);
        result = calculator.compute(min, 1, "-");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(max, result, 0);
    }

    @Test()
    public void testSubtraction2() {
        System.out.println("Initial result: " + result);
        result = calculator.compute(100, 0, "-");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(100, result, 0);
    }

    @Test()
    public void testMultiply() {
        System.out.println("Initial result: " + result);
        result = calculator.compute(11, 12, "*");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(132, result, 0);
    }

    @Test()
    public void testMultiply1() {
        System.out.println("Initial result: " + result);
        result = calculator.compute(10, -10, "*");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(-100, result, 0);
    }

    @Test()
    public void testMultiply2() {
        System.out.println("Initial result: " + result);
        result = calculator.compute(50, 1, "*");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(50, result, 0);
    }

    @Test()
    public void testDivide() {
        System.out.println("Initial result: " + result);
        result = calculator.compute(33, 3, "/");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(11, result, 0);
    }

    @Test()
    public void testDivide1() {
        System.out.println("Initial result: " + result);
        result = calculator.compute(9, -3, "/");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(-3, result, 0);
    }

    @Test()
    public void testDivide2() {
        System.out.println("Initial result: " + result);
        result = calculator.compute(-1, -10, "/");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(0.1, result, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZeroWithoutFail() {
        System.out.println("Initial result: " + result);
        System.out.println("It will not work because we cannot divide by 0");
        result = calculator.compute(50, 0, "/");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(10, result, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZeroWithoutFail1() {
        System.out.println("Initial result: " + result);
        System.out.println("It will not work because we cannot divide by 0");
        result = calculator.compute(100, 0, "/");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(0, result, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZeroWithoutFail2() {
        System.out.println("Initial result: " + result);
        System.out.println("It will not work because we cannot divide by 0");
        result = calculator.compute(0, 0, "/");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(0, result, 0);
    }

    @Test()
    public void testDivideByZeroWithFail() {
        System.out.println("Initial result: " + result);
        System.out.println("It will not work because we cannot divide by 0");
        result = calculator.compute(50, 0, "/");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(10, result, 0);
    }

    @Test()
    public void testDivideByZeroWithFail1() {
        System.out.println("Initial result: " + result);
        System.out.println("It will not work because we cannot divide by 0");
        result = calculator.compute(9, 3, "/");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(3, result, 0);
    }

    @Test()
    public void testDivideByZeroWithFail2() {
        System.out.println("Initial result: " + result);
        System.out.println("It will not work because we cannot divide by 0");
        result = calculator.compute(-100, 0, "/");
        System.out.println("Result after compute: " + result);
        Assert.assertEquals(10, result, 0);
    }
}
