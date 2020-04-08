package eulerlibrary.Problems;

import eulerlibrary.MathLibrary.MathLibrary;

public class PythagoreanTriplet implements IEulerSolution {

    /**
     * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
     *  a^2 + b^2 = c^2
     *  For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
     *  There exists exactly one Pythagorean triplet for which a + b + c = 1000.
     *  Find the product abc.
     */
    @Override
    public String Compute()
    {
        for (long a = 1; a <= 333; a++)
        {
            boolean done = false;
            long b = a + 1;                // b must be greater than a
            while (!done)
            {
                long c = 1000 - (a + b);   // a + b + c must equal 1000
                if (MathLibrary.Square(a) + MathLibrary.Square(b) == MathLibrary.Square(c)) return Long.toString(a * b * c);
                if (++b >= c) done = true; // c must be greater than b
            }
        }
        return "No solution was found";
    }
}