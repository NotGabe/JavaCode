import java.util.Scanner;

public class SalesCommissionCalculator
{
    public static void main(String [] args)
    {
       // Scanner txtInput = new Scanner(System.in);
        SalesCommission Commission = new SalesCommission();



            Commission.inputData();

        System.out.printf("The total is %.2f", Commission.calculateTotalSales());
        System.out.println();
       System.out.printf("Total Commissions is %.2f", Commission.calculateCommissions());

    }
}
