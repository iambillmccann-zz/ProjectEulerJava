package eulerlibrary.Problems;

import eulerlibrary.MathLibrary.MathLibrary;

public class Multiple3or5 implements IEulerSolution {

    final long RANGE_START = 1;
    final long RANGE_STOP  = 1000;

    /**
     *  Determine the number of terms in an Arithmetic Progression
     * 
     * @param rangeStart First number in the range
     * @param rangeStop  Last number in the range
     * @param difference Difference between terms
     * @return The number of terms
     */
    private long NumberOfTerms (long rangeStart, long rangeStop, long difference)
    {
        return (rangeStop - rangeStart) / difference;
    }

    /**
     * Determine the last number in an Arithmetic Progression
     * @param numberOfTerms The number of terms
     * @param firstTerm     The first number
     * @param difference    The difference between terms
     * @return              The largest value of the sequence
     */
    private long LastTerm (long numberOfTerms, long firstTerm, long difference)
    {
        return firstTerm + difference * (numberOfTerms - 1);
    }

    /**
     * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
     * get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum of all the
     * multiples of 3 or 5 below 1000.
     * 
     * @return The answer to the problem.
     */

    @Override
    public String Compute() 
    {
        Long sum3 = MathLibrary.ArithmeticSeries(NumberOfTerms(RANGE_START, RANGE_STOP, 3), 
                                                 3, 
                                                 LastTerm(NumberOfTerms(RANGE_START, RANGE_STOP, 3), 3, 3));
        Long sum5 = MathLibrary.ArithmeticSeries(NumberOfTerms(RANGE_START, RANGE_STOP, 5), 
                                                 5, 
                                                 LastTerm(NumberOfTerms(RANGE_START, RANGE_STOP, 5), 5, 5));
        Long sum15 = MathLibrary.ArithmeticSeries(NumberOfTerms(RANGE_START, RANGE_STOP, 15), 
                                                 15, 
                                                 LastTerm(NumberOfTerms(RANGE_START, RANGE_STOP, 15), 15, 15));

        return Long.toString(sum3 + sum5 - sum15);
    }

}