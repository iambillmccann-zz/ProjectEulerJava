package eulerlibrary.Problems;

import eulerlibrary.MathLibrary.MathLibrary;

public class SmallestMultiple  implements IEulerSolution {

    @Override
    public String Compute() 
    {
        long result = 0;
        long max = 20;
        Boolean notDone = true;

        while (notDone)
        {
            result += max * (max - 1);
            long trial = max - 2;
            while (MathLibrary.IsMultiple(result, trial--))
            {
                if (trial == 1)
                {
                    notDone = false;
                    break;
                }
            }
        }

        return Long.toString(result);
    }
}