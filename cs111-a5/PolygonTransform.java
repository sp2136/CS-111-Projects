/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author:
 *
 *************************************************************************/

public class PolygonTransform 
{


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) 
    {

	// WRITE YOUR CODE HERE
        double[] newArray = new double[array.length];

        for(int i = 0; i < array.length; i++)
        {
            newArray[i] = array[i];
        }
        return newArray;
    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) 
    {

	// WRITE YOUR CODE HERE
        StdDraw.setScale(-5.0, +5.0); 
        StdDraw.setPenColor(StdDraw.RED); 
        StdDraw.polygon(x, y);

        for(int i = 0; i < x.length; i++)
        {
            x[i] *= alpha;
        }
        for(int i = 0; i < y.length; i++)
        {
            y[i] *= alpha;
        }

        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y); 
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) 
    {

	// WRITE YOUR CODE HERE
        StdDraw.setScale(-5.0, +5.0); 
        StdDraw.setPenColor(StdDraw.RED); 
        StdDraw.polygon(x, y);

        for(int i = 0; i < x.length; i++)
        {
            x[i] += dx;
        }
        for(int i = 0; i < y.length; i++)
        {
            y[i] += dy;
        }

        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y); 
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) 
    {

	// WRITE YOUR CODE HERE
        StdDraw.setScale(-5.0, +5.0); 
        StdDraw.setPenColor(StdDraw.RED); 
        StdDraw.polygon(x, y);

        double radian = Math.toRadians(theta);

        for(int i = 0; i < x.length; i++)
        {
            double temp = x[i];
            x[i] = x[i] * Math.cos(radian) - y[i] * Math.sin(radian);
            y[i] = y[i] * Math.cos(radian) + temp * Math.sin(radian);
        }

        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y); 
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) 
    {

	// WRITE YOUR CODE HERE
       
        //double[] x = { 0, 1, 1, 0 }; 
        //double[] y = { 0, 0, 2, 1 }; 
        //double alpha = 2.0; 
        //scale(x, y, alpha); 
        
        
        //double[] x = { 0, 1, 1, 0 }; 
        //double[] y = { 0, 0, 2, 1 }; 
        //double dx = 2.0, dy = 1.0; 
        //translate(x, y, dx, dy); 


        //double[] x = { 0, 1, 1, 0 }; 
        //double[] y = { 0, 0, 2, 1 }; 
        //double theta = 45.0; 
        //rotate(x, y, theta); 

        /*double[]x = new double[4];
        double[]y = new double[4];
        StdDraw.setScale(-5.0, +5.0);
        x = { 0, 1, 1, 0 };
        y = { 0, 0, 2, 1 };
        double alpha = 2.0;
        StdDraw.setPenColor(StdDraw.RED);
        StdDraw.polygon(x, y);
        scale(x, y, alpha);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.polygon(x, y);*/

    }
}
