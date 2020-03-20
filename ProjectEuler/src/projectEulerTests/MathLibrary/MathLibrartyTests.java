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
}
