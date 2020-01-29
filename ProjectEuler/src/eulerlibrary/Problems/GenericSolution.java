package eulerlibrary.Problems;

public class GenericSolution implements IEulerSolution
{
    /**
     * The generic solution class. The factory will use this as the default solution.
     * 
     * @return  A message indicating that no solution exists.
     */
    public String Compute()
    {
        return "The requested problem has not been solved";
    }
}