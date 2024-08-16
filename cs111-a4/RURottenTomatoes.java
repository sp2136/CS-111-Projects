/*************************************************************************
 *  Compilation:  javac RURottenTomatoes.java
 *  Execution:    java RURottenTomatoes
 *
 *  @author:
 *
 * RURottenTomatoes creates a 2 dimensional array of movie ratings 
 * from the command line arguments and displays the index of the movie 
 * that has the highest sum of ratings.
 *
 *  java RURottenTomatoes 3 2 5 2 3 3 4 1
 *  0
 *************************************************************************/

public class RURottenTomatoes 
{

    public static void main(String[] args) 
	{

		// WRITE YOUR CODE HERE
		/*int s = 0;
        int x = 0;
        int index = 0;

		int[] tomato = new int[args.length];
		for(int i = 0; i < args.length; i++)
		{
			tomato[i] = Integer.parseInt(args[i]);
		}
	 	int[][] tom = new int[tomato[0]][tomato[1]];
			int i = 2;
			for(int j = 0; j < tomato[0]; j++)
			{
				for(int k = 0; k < tomato[1]; k++)
				{
					tom[j][k] = tomato[i];
					i++;
				}
			}

			for(int m = 0; m < tomato[1]; m++)
			{
				for(int j = 0; j < tomato[0]; j++)
				{
					s += tom[j][m];
				}
				if(s > x)
				{
					x = s;
					index = m;
				}
				s = 0;
			}
			System.out.println(index);*/

		int i;
		int j;
		int k = 2; //20

		int totalRows = Integer.parseInt(args[0]);
		int totalCols = Integer.parseInt(args[1]);
		int sumOfCol = 0;
		int totalSum = 0;
		int runningIndex = 0;

		int[][] output = new int[totalRows][totalCols];

		for(i = 0; i < totalRows; i++)
		{
			for(j = 0; j < totalCols; j++)
			{
				output[i][j] = Integer.parseInt(args[k]);
				k++;
			}
		}
		for(i = 0; i < totalCols; i++)
		{
			for(j = 0; j < totalRows; j++)
			{
				sumOfCol += output[j][i];
			}
			if(sumOfCol > totalSum)
			{
				totalSum = sumOfCol;
				runningIndex = i;
			}
			sumOfCol = 0;
		}
		System.out.println(runningIndex);
	}
}