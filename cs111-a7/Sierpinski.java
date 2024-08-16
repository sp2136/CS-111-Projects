
/*************************************************************************
 *  Compilation:  javac Sierpinski.java
 *  Execution:    java Sierpinski
 *
 *  @author:
 *
 *************************************************************************/

public class Sierpinski {

    // Height of an equilateral triangle whose sides are of the specified length. 
    public static double height(double length) 
    {

	// WRITE YOUR CODE HERE
        double height = 0.0;
        height = length * Math.sqrt(3.0)/2;
        return height;
    }

    // Draws a filled equilateral triangle whose bottom vertex is (x, y) 
    // of the specified side length. 
    public static void filledTriangle(double x, double y, double length) 
    {

	// WRITE YOUR CODE HERE
        double x2 = x - (length/2.0);
        double y2 = y + height(length);

        double x3 = x + (length/2.0);
        double y3 = y + height(length);

        double[] allX = {x, x2, x3};
        double[] allY = {y, y2, y3};

        StdDraw.filledPolygon(allX, allY);
    }

    // Draws a Sierpinski triangle of order n, such that the largest filled 
    // triangle has bottom vertex (x, y) and sides of the specified length. 
    public static void sierpinski(int n, double x, double y, double length) 
    {

	// WRITE YOUR CODE HERE
        if (n > 0) 
        {
            filledTriangle(x, y, length);
            n--;
            sierpinski(n, x-(length/2.0), y, length/2.0);
            sierpinski(n, x+(length/2.0), y, length/2.0);
            sierpinski(n, x, y + height(length), length/2.0);
        }
    }

    // Takes an integer command-line argument n; 
    // draws the outline of an equilateral triangle (pointed upwards) of length 1; 
    // whose bottom-left vertex is (0, 0) and bottom-right vertex is (1, 0); and 
    // draws a Sierpinski triangle of order n that fits snugly inside the outline. 
    public static void main(String[] args) 
    {

	// WRITE YOUR CODE HERE 
        double length = 1;
        int n = Integer.parseInt(args[0]);
        StdDraw.polygon(new double[] {0.0, length, length/2.0}, new double[] {0.0, 0.0, height(length)});

        double x = length/2.0;
        double y = 0;

       sierpinski(n, x, y, length/2.0);
    }
}