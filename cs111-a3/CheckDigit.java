/*************************************************************************
 *  Compilation:  javac CheckDigit.java
 *  Execution:    java CheckDigit 020131452
 *
 *  @author:
 *
 *  Takes a 12 or 13 digit integer as a command line argument, then computes
 *  and displays the check digit
 *
 *  java CheckDigit 048231312622
 *  0
 *
 *  java CheckDigit 9780470458310
 *  0
 * 
 *  java CheckDigit 9780470454310
 *  8
 * 
 *  Print only the check digit character, nothing else.
 *
 *************************************************************************/

public class CheckDigit 
{

    public static void main (String[] args) 
    {

        // WRITE YOUR CODE HERE
        long num = Long.parseLong(args[0]);
        String str = num + "";

        int sum = 0;
        int d = 0;
        for(int i = str.length() - 1; i >= 0; i -= 2)
        {
            sum += Character.getNumericValue(str.charAt(i));
        }
        d = (sum % 10);

        int s = 0;
        int digit = 0;
        for(int j = str.length() - 2; j >= 0; j -= 2)
        {
            s += Character.getNumericValue(str.charAt(j));
        }
        digit = (s % 10);

        int dig = digit * 3;
        int di = (dig % 10);

        int digits = d + di;

        int digi = (digits % 10);
        System.out.println(digi);
    }
}