package eulerlibrary.Problems;

import java.util.List;
import eulerlibrary.MathLibrary.MathLibrary;

public class Prime10001 implements IEulerSolution {
    /**
     *  By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
     *  What is the 10,001st prime number?
     * 
     * @return the 10,001st prime number
     */
    @Override
    public String Compute()
    {
        long result = 0;
        int position = 10001;
        List<Long> primeNumbers = MathLibrary.GetPrime(110000L);
        result = primeNumbers.get(position - 1);
        return Long.toString(result);
    }
}