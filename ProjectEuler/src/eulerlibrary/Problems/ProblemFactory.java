package eulerlibrary.Problems;

public class ProblemFactory
{
    /**
     * The ProblemFactory class using the factory pattern to return the solution to a 
     * given problem number.
     * 
     * @param problemNumber The number of the problem.
     * @return              The class that will solve the problem.
     */
    public IEulerSolution GetSolution(int problemNumber)
    {
        switch (problemNumber)
        {
            case 1: return new Multiple3or5();
            case 2: return new EvenFibonacci();
            case 3: return new LargestPrimeFactor();
            case 4: return new LargestPalindromeProduct();
            case 5: return new SmallestMultiple();
            case 6: return new SumSquareDifference();
            case 7: return new Prime10001();
            case 8: return new LargestProductSeries();
            case 9: return new PythagoreanTriplet();
            case 10: return new SummationPrimes();
            case 11: return new LargestProductGrid();
            default: return new GenericSolution();
        }
    }
}