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
            default: return new GenericSolution();
        }
    }
}