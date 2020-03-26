package projectEulerTests.MathLibrary;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import eulerlibrary.MathLibrary.MathLibrary;

class MathLibraryTests {

    @Test
    public void ReverseEvenNumberOfDigits()
    {
        assertEquals(4321, MathLibrary.ReverseDigits(1234), "Test reversing an even number of digits");
    }

    @Test
    public void ReverseOddNumberOfDigits()
    {
        assertEquals(987654321, MathLibrary.ReverseDigits(123456789), "Test reversing an odd number of digits");
    }

    @Test
    public void PassIsMultiple()
    {
        assertEquals(true, MathLibrary.IsMultiple(4, 2));
        assertEquals(true, MathLibrary.IsMultiple(9, 3));
        assertEquals(true, MathLibrary.IsMultiple(12, 6));
        assertEquals(true, MathLibrary.IsMultiple(25, 5));
        assertEquals(true, MathLibrary.IsMultiple(4648, 332));
        assertEquals(true, MathLibrary.IsMultiple(2, 1));
    }

    @Test
    public void FailIsMultiple()
    {
        assertEquals(false, MathLibrary.IsMultiple(4, 3));
        assertEquals(false, MathLibrary.IsMultiple(1, 0));
        assertEquals(false, MathLibrary.IsMultiple(13, 3));
        assertEquals(false, MathLibrary.IsMultiple(19, 18));
        assertEquals(false, MathLibrary.IsMultiple(23, 2));
        assertEquals(false, MathLibrary.IsMultiple(37, 6));
    }

    @Test
    public void Square()
    {
        assertEquals(25, MathLibrary.Square(5), "Test the square of a number");
        assertEquals(0, MathLibrary.Square(0), "Test the square of a 0");
        assertEquals(1, MathLibrary.Square(-1), "Test the square of a negative is positive");
    }

    @Test
    public void TestSumNatural()
    {
        assertEquals(55, MathLibrary.SumNatural(10), "Test summing a series of natural numbers");
        assertEquals(0, MathLibrary.SumNatural(0), "Summing nothing should be nothing");
        assertEquals(0, MathLibrary.SumNatural(-10), "Negative numbers are not natural numbers");
    }

    @Test
    public void TestSumNaturalSquares()
    {
        assertEquals(385, MathLibrary.SumNaturalSquares(10), "Test summing squared natural numbers");
        assertEquals(0, MathLibrary.SumNaturalSquares(0), "Zero is not a natural number");
        assertEquals(0, MathLibrary.SumNaturalSquares(-10), "Negative numbers are not natural");
    }
}
