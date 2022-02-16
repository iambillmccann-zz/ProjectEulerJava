package projectEulerTests.MathLibrary;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import java.util.List;
import eulerlibrary.MathLibrary.MathLibrary;

class MathLibraryTests {

    @Test
    public void TestReversedDigits()
    {
        assertEquals(321, MathLibrary.ReverseDigits(123));
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

    @Test
    public void TestGetPrime()
    {
        List<Long> actual = MathLibrary.GetPrime(20L);
        final List<Long> expected = List.of(2L, 3L, 5L, 7L, 11L, 13L, 17L, 19L);
        assertEquals(expected, actual);

        actual = MathLibrary.GetPrime(23L);
        assertEquals(9, actual.size());

        actual = MathLibrary.GetPrime(7920L);
        assertEquals(1000, actual.size());
        assertEquals(7919, actual.get(actual.size() - 1));
    }

    @Test
    public void TestSeriesProduct()
    {
        List<Long> numbers = List.of(2L, 3L, 4L, 5L);
        assertEquals(120, MathLibrary.SeriesProduct(numbers));
        numbers = List.of(0L, 999L, 33L, -1L, 10L);
        assertEquals(0, MathLibrary.SeriesProduct(numbers));
        numbers = List.of( 9L, 9L, 8L, 9L );
        assertEquals(5832, MathLibrary.SeriesProduct(numbers));
    }

    @Test
    public void TestSeriesSum()
    {
        List<Long> numbers = List.of( 2L, 3L, 5L, 7L );
        assertEquals(17, MathLibrary.SeriesSum(numbers));
    }

    @Test
    public void TestGetDivisors()
    {
        List<Long> divisors = MathLibrary.GetDivisors(1);
        assertTrue( divisors.contains(1L) );
        assertTrue( divisors.size() == 1 );
        divisors = MathLibrary.GetDivisors(3);
        assertTrue( divisors.size() == 2 );
        assertTrue( divisors.containsAll(List.of(1L, 3L)) );
        divisors = MathLibrary.GetDivisors(28);
        assertTrue( divisors.size() == 6 );
        assertTrue( divisors.containsAll(List.of(1L, 2L, 4L, 7L, 14L, 28L)) );
    }
}
