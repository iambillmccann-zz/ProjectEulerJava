package eulerlibrary.MathLibrary;

public class MathLibrary
{

    /**
     * The Arithmetic Series is the sum of an Arithmetic Progression
     * @param numberOfTerms Number of terms in the series
     * @param firstTerm     The first term
     * @param lastTerm      The last term
     * @return              The value of the Arithmetic Series
     */
    public static long ArithmeticSeries(long numberOfTerms, long firstTerm, long lastTerm)
    {
        return numberOfTerms * (firstTerm + lastTerm) / 2;
    }

    /**
     * Check if an integer is a multiple of another integer
     * 
     * @param value    The value to check
     * @param divisor  The number divided into the value
     * @return         True if the numbers divide evenly, otherwise false
     */
    public static boolean IsMultiple(long value, long divisor)
    {
        if (divisor == 0) return false;
        if (value % divisor == 0) return true;
        return false;    
    }

}