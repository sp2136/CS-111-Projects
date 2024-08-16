/*************************************************************************
 *  Compilation:  javac LargestOfFive.java
 *  Execution:    java LargestOfFive 35 10 32 1 8
 *
 *  @author:
 *
 *  Takes five distinct integers as command-line arguments and prints the 
 *  largest value
 *
 *
 *  % java LargestOfFive 35 10 32 1 8
 *  35
 *
 *  Assume the inputs are 5 distinct integers.
 *  Print only the largest value, nothing else.
 *
 *************************************************************************/

public class LargestOfFive 
{

    public static void main (String[] args) 
    {

        // WRITE YOUR CODE HERE
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int d = Integer.parseInt(args[3]);
        int e = Integer.parseInt(args[4]);
        int max;

        if((a > b) && (a > c) && (a > d) && (a > e))
        {
            max = a;
        }
        else if((b > c) && (b > d) && (b > e))
        {
            max = b;
        }
        else if((c > d) && (c > e))
        {
            max = c;
        }
        else if(d > e)
        {
            max = d;
        }
        else
        {
            max = e;
        }

        System.out.println(max);
    }
}