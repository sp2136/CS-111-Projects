/*************************************************************************
 *  Compilation:  javac RecursiveAppend.java
 *  Execution:    java RecursiveAppend
 *
 *  @author:
 *
 *************************************************************************/

public class RecursiveAppend {

    // Returns the original string appended to the original string n times 
    public static String appendNTimes (String original, int n) 
    {

	// WRITE YOUR CODE HERE
        if (n <= -1) 
        {
            return "";
        }
        return original + appendNTimes(original, n - 1);
    }

    public static void main (String[] args) 
    {

	// WRITE TEST CASES HERE to test your method
        int n = Integer.parseInt(args[1]);
        String original = args[0];

        System.out.println(appendNTimes(original, n));
    }
}
