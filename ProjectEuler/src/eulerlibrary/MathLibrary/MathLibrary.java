package eulerlibrary.MathLibrary;

import java.util.ArrayList;
import java.util.List;

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
     * This method returns a list of divisors of a number
     * @param number       The number to check
     * @return             The list of divisors
     */
    public static List<Long> GetDivisors(long number)
    {
        List<Long> divisors = new ArrayList<Long>();

        for (Long divisor = 1L; divisor <= Math.sqrt(number); divisor++)
            if (IsMultiple(number, divisor))
            {
                divisors.add(divisor);
                Long quotient = number / divisor;
                if (divisor != quotient & number != divisor) divisors.add(quotient);
            }

        return divisors;
    }

    /**
     * This method returns a collection of factors for a given number
     * @param number        The number to divide into factors
     * @param primeNumbers  The list of primes up to and including number
     * @return              The list of factors for the number
    */ 
    public static List<Long> GetFactors(long number, List<Long> primeNumbers)
    {
        List<Long> factors = new ArrayList<Long>();

        for (long primeNumber : primeNumbers)
        {
            if (Math.sqrt((double)number) < primeNumber) break;
            if (IsMultiple(number, primeNumber))
            {
                factors.add(primeNumber);
                long nextNumber = number / primeNumber;
                if (primeNumbers.contains(nextNumber))
                    factors.add(nextNumber);
                else
                    factors.addAll(GetFactors(nextNumber, primeNumbers));
                break;
            };
        }

        return factors;
    }

    /**
     * This method returns a collection of prime numbers
     * @param max Stop checking for primes at this number
     * @return    List of integers that are prime
     */
    public static List<Long> GetPrime(Long max)
    {
        List<Long> primeNumbers = new ArrayList<Long>();

        for (long number = 2; number <= max; number++)
        {
            boolean isPrime = true;
            for (Long divisor : primeNumbers)
            {
                if (Math.sqrt((double)number) < divisor) break;
                if (IsMultiple(number, divisor)) isPrime = false;
            }

            if (isPrime) primeNumbers.add(number);
        }
        return primeNumbers;
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

    /**
     * Reverses the digits of an integer such that 123 becomes 321.
     * 
     * @param number   The number to reverse
     * @return         The new number with reversed digits
     */
    public static long ReverseDigits(long number)
    {
        long result = 0;
        long workNumber = number;

        while (workNumber > 0)
        {
            long remainder = workNumber % 10;
            result = (result * 10) + remainder;
            workNumber /= 10;
        }

        return result;
    }

    public static long Square(long number)
    {
        return number * number;
    }

    public static long SumNatural(long number)
    {
        long result = 0;
        for (long sequence = 1; sequence <= number; sequence++) result += sequence;
        return result;
    }

    public static long SumNaturalSquares(long number)
    {
        long result = 0;
        for (long sequence = 1; sequence <= number; sequence++) result += Square(sequence);
        return result;
    }

    public static long SeriesProduct(List<Long> numbers)
    {
        long result = 1;
        for (long number : numbers)
        {
            if (number == 0) return 0;   // A zero will make the product zero
            result *= number;
        }
        return result;
    }

    public static long SeriesSum(List<Long> numbers)
    {
        long result = 0;
        for (long number : numbers) result += number;
        return result;
    }

}