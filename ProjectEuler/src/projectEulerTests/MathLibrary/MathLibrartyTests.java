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
}