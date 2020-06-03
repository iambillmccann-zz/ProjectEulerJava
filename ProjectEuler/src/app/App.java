package app;

import java.time.Duration;
import java.time.Instant;

import eulerlibrary.Problems.ProblemFactory;
import eulerlibrary.MathLibrary.Utilities;

public class App {

    private static String QUITSTRING = "Q";
    private static int LASTPROBLEM = 11;

    /**
     * getUserInput is a simple method for reading from the console.
     * 
     * @return    A string that represents the user's input.
     */
    private static int getUserInput() {
        System.out.print("What problem shall I run? Or type 'Q' to quit. ");
        return checkUserInput(System.console().readLine());
    }

    /**
     * checkUserInput will validate the user's input. This is a very redimentary
     *  validation method. It checks three things ...
     *  1. Checks for the letter "Q"
     *  2. Checks for an integer
     *  3. Checks that the integer is positive
     *  4. Checks that the integer is no greater than the last problem solved.
     *  These checks assume that problems are solved in order.
     *  Note: If the user enters "Q", a minus one is returned to the caller.
     * 
     * @param userInput The string entered by the user
     * @return          An integer representing the problem number or -1 to quit
     */
    private static int checkUserInput(String userInput) {
        int result = -1;
        if (userInput.equalsIgnoreCase(QUITSTRING)) return result;

        try
        {
            result = Integer.parseInt(userInput);
            if (result < 1)
            {
                System.out.println("\nBTW, problem numbers are positive integers.");
                result = getUserInput();
            } else if (result > LASTPROBLEM)
            {
                System.out.println("\nI have only completed problems 1 through " + LASTPROBLEM);
                result = getUserInput();
            }
        }
        catch (NumberFormatException exception)
        {
            System.out.println("\nSorry but I did not understand that. Please type the problem number or Q to quit.");
            result = getUserInput();
        }

        return result;
    }

    /**
     * This is the main program.
     * 
     * @param    args  Command line arguments, but this program does not use command line arguments.
     */
    public static void main(final String[] args) throws Exception {

        int problemNumber = 0;
        ProblemFactory problemFactory = new ProblemFactory();

        problemNumber = getUserInput();

        while (problemNumber > 0) {
            Instant startTime = Instant.now();
            String result = problemFactory.GetSolution(problemNumber).Compute();
            Instant stopTime = Instant.now();
            Long totalTime = Duration.between(startTime, stopTime).toMillis();

            System.out.println("\n-----------------------------------------------------------------------");
            System.out.println("Solution to problem " + problemNumber + " = " + result);
            System.out.println("Execution time was " + Utilities.FormatMilliseconds(totalTime));
            System.out.println("-----------------------------------------------------------------------");
            System.out.println();            
            problemNumber = getUserInput();
        }

        System.out.println("Goodbye. Press any key to continue");
        System.console().readLine();
    }   
}