package projectEulerTests.MathLibrary.Utilities;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import eulerlibrary.MathLibrary.Utilities;

class FormatMillisecondsTests {

    @Test
    public void MillisecondsLessThan10()
    {
        final long totalMilliseconds = 6;

        final String expected = "00:00:00.006";
        final String actual = Utilities.FormatMilliseconds(totalMilliseconds);

        assertEquals(expected, actual);
    }

    @Test
    public void MillsecondsLessThan100() {
        final long totalMilliseconds = 76;

        final String expected = "00:00:00.076";
        final String actual = Utilities.FormatMilliseconds(totalMilliseconds);

        assertEquals(expected, actual, "Milliseconds less than 100 do not have the proper leading zeros");
    }

    @Test
    public void SecondsLessThan10() {
        final long totalMilliseconds = 5000;

        final String expected = "00:00:05.000";
        final String actual = Utilities.FormatMilliseconds(totalMilliseconds);

        assertEquals(expected, actual, "Seconds less than 10 do not have the proper leading zeros");
    }

    @Test
    public void MinutesLessThan10() {
        final long totalMilliseconds = 180000;

        final String expected = "00:03:00.000";
        final String actual = Utilities.FormatMilliseconds(totalMilliseconds);

        assertEquals(expected, actual, "Minutes less than 10 do not have the proper leading zeros");
    }

    @Test
    public void HoursLessThan10() {
        final long totalMilliseconds = 7200000;

        final String expected = "02:00:00.000";
        final String actual = Utilities.FormatMilliseconds(totalMilliseconds);

        assertEquals(expected, actual, "Hours less than 10 do not have the proper leading zeros");
    }

    @Test
    public void MillisecondsNotMoreThan999() {
        final long totalMilliseconds = 1000;

        final String expected = "00:00:01.000";
        final String actual = Utilities.FormatMilliseconds(totalMilliseconds);

        assertEquals(expected, actual, "Milliseconds shall not exceed 999");
    }

    @Test
    public void SecondsLessThan60() {
        final long totalMilliseconds = 60000;

        final String expected = "00:01:00.000";
        final String actual = Utilities.FormatMilliseconds(totalMilliseconds);

        assertEquals(expected, actual, "Seconds shall not exceed 59");
    }

    @Test
    public void MinutesLessThan60() {
        final long totalMilliseconds = 3600000;

        final String expected = "01:00:00.000";
        final String actual = Utilities.FormatMilliseconds(totalMilliseconds);

        assertEquals(expected, actual, "Minutes shall not exceed 59");
    }

    @Test
    public void HoursMoreThan99()
    {
        final long totalMilliseconds = 360000000;

        final String expected = "100:00:00.000";
        final String actual = Utilities.FormatMilliseconds(totalMilliseconds);

        assertEquals(expected, actual, "Hours greater than 99 show all significant digits " + actual);
    }

}