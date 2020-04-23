package eulerlibrary.Problems;

import java.util.List;
import eulerlibrary.MathLibrary.MathLibrary;

public class SummationPrimes implements IEulerSolution {

    /**
     * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
     * Find the sum of all the primes below two million.
     */
    @Override
    public String Compute()
    {
        List<Long> primeNumbers = MathLibrary.GetPrime(2000000L);
        return Long.toString(MathLibrary.SeriesSum(primeNumbers));
    }
}