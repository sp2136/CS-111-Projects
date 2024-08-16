/*************************************************************************
 *  Compilation:  javac RandomWalker.java
 *  Execution:    java RandomWalker 10
 *
 *  @author:
 *
 * The program RandomWalker that takes an int command-line argument n
 * and simulates the motion of a random walk for n steps. Print the
 * location at each step (including the starting point), treating the
 * starting point as the origin (0, 0). Also, print the square of the
 * final Euclidean distance from the origin.
 *
 *  % java RandomWalker 10
 * (0,0)
 * (-1,0)
 * (-1,-1)
 * (-1,-2)
 * (-1,-3)
 * (-1,-4)
 * (-1,-5)
 * (0,-5)
 * (-1,-5)
 * (-2,-5)
 * (-2,-4)
 * Squared distance = 20.0
 *
 *************************************************************************/

public class RandomWalker 
{

    public static void main(String[] args) 
    {

	// WRITE YOUR CODE HERE
        int num = Integer.parseInt(args[0]);
        int count = 0;

        int x = 0;
        int y = 0;

        System.out.println("(" + x + "," + y + ")");

        int nextX = (int)Math.random();
        int nextY = (int)Math.random();

        while(count < num)
        {
            int randomNum = (int)(Math.random() * 4) + 1;

            if(randomNum == 1)
            {
                nextX += 1;
            }
            if(randomNum == 2)
            {
                nextX -= 1;
            }
            if(randomNum == 3)
            {
                nextY += 1;
            }
            if(randomNum == 4)
            {
                nextY -= 1;
            }

            System.out.println("(" + nextX + "," + nextY + ")");
            count++;
        }

        double squaredDistance = (Math.pow((nextX - x), 2)) + (Math.pow((nextY - y), 2));

        System.out.println("Squared distance = " + squaredDistance);
        //System.out.println(num);
    }
}
