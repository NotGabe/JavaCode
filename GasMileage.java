import java.util.Scanner;

public class GasMileage
{
    public static void main(String[] args)
    {
        Scanner txtInput = new Scanner(System.in);  //scanner object
        int miles;    // initialize variables
        int gallons;
        int mpg;


        int i = 1;      //counter that counts which trip gas tank we are tracking
        int cont = 1 ;  //cont is the sentinel value. after each loop asks the user to continue or -1 to quit

        while (cont != -1)  //loop
        {
            System.out.printf("Enter miles for trip %d:   ", i);
            miles = txtInput.nextInt();
            System.out.printf("Enter gallons for trip %d  ", i);
            gallons = txtInput.nextInt();
            System.out.printf("Trip %d mpg is %.2f", i ,getMPG(miles, gallons));
            System.out.println();

            i++;
            System.out.printf("Move on to trip number %d ?: any number or, -1 ", cont);
            cont = txtInput.nextInt();
            System.out.println();
        }
    }

    public static double getMPG(int miles, int gallons)  //method within main(static) that gets MPG
    {
        miles = miles;
        gallons = gallons;
        double mpg = (double)(miles/gallons);  //conversion
        return mpg;
    }
}
