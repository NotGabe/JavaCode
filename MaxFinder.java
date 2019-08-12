import java.util.Scanner;


public class MaxFinder
{

    public void determineMax()
    {
        Scanner txtInput = new Scanner(System.in);  //scanner instance

        System.out.println("Enter three doubles separated by spaces ");   //prompt

        double number1 = txtInput.nextDouble();   //reads first double
        double number2 = txtInput.nextDouble();    // reads second
        double number3 = txtInput.nextDouble();    //reads third

        //determine max value;  calls method with multiple parameters
        double result = maximum(number1, number2, number3);

        System.out.printf("\n");
        System.out.printf("Maximum is %.2f", result);

    }//end method
    public double maximum(double x, double y, double z)
    {
        double maxValue = x;  //assume x is largest to start

        if(y > maxValue)
            maxValue = y;

        if(z>maxValue)
           maxValue = z;

        return maxValue;

       // return Math.max(x, Math.max(y,z));

    }


    //this is an alternate using a JAVA built in math function
    public double maximumAlternate(double x, double y, double z)
    {
        return Math.max(x, Math.max(y,z));
    }
}
