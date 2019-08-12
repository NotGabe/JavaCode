import java.util.Scanner;


public class ParkingCharges
{
    public static void main(String [] args)
    {
       displayMSG();
    }

   private static double calcCharges(int hrs)
    {
        double charge;
        if (hrs<=3)
            charge = 2;
         else if (hrs > 3 && hrs <24)
             charge = (double)(2 + (hrs-3)*.5);
         else
             charge = 10;

        return charge ;
    }

    static void displayMSG()
    {
        Scanner input = new Scanner(System.in);
        int hours = 0;
        System.out.println("Enter hours: ");
        System.out.println();
        hours = input.nextInt();
       // calcCharges(hours);
        System.out.printf("%.2f", calcCharges(hours));
    }
}
