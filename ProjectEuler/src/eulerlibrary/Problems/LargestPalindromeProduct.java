package eulerlibrary.Problems;

import eulerlibrary.MathLibrary.MathLibrary;

public class LargestPalindromeProduct  implements IEulerSolution {

    @Override
    public String Compute() 
    {
        long result = 0;

        for (long number1 = 100; number1 < 1000; number1++)
        {
            for (long number2 = 100; number2 < 1000; number2++)
            {
                long product = number1 * number2;
                if ( (MathLibrary.ReverseDigits(product) == product) & (product > result) )
                    result = product;
            }
        }
        return Long.toString(result);
    }
}