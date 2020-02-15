package eulerlibrary.Problems;

import java.util.List;

import eulerlibrary.MathLibrary.MathLibrary;

public class LargestPrimeFactor implements IEulerSolution {

    final long VALUE = 600851475143L;

    /**
     *  The prime factors of 13195 are 5, 7, 13 and 29.
     *  What is the largest prime factor of the number 600,851,475,143?
     */
    @Override
    public String Compute() 
    {
        long result;
        List<Long> factors = MathLibrary.GetFactors(VALUE, MathLibrary.GetPrime((long) 10000));
        result = factors.get(factors.size() - 1);
        return Long.toString(result);
    }

}