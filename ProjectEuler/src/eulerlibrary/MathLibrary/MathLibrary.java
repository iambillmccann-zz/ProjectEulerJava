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

}