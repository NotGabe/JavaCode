import java.util.Scanner;


public class MaxFinderTest2
{
    public static void main(String [] args)
    {
        MaxFinderTest2 MaxFinder = new MaxFinderTest2();
        MaxFinder.detMaxValue();

    }
        public void detMaxValue()
    {
        Scanner txtInput = new Scanner(System.in);
        System.out.println("Enter three doubles separated by spaces ");   //prompt


    double number1 = txtInput.nextDouble();   //reads first double
    double number2 = txtInput.nextDouble();    // reads second
    double number3 = txtInput.nextDouble();    //reads third

    //determine max value;  calls method with multiple parameters
    double result = maximumVal(number1, number2, number3);


        System.out.printf("\n");
        System.out.printf("Maximum is %.2f", result);
        System.out.printf("\n");
    }

    public double maximumVal(double x, double y, double z) {
        return Math.max(x, Math.max(y, z));
    }

}

