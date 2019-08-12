public class Interest
{
    public static void main(String [] args)
    {
        double amount, principal, rate;   //declare variables
        principal = 1000.0;
        rate = .05;


        //display headers     format
        System.out.printf("%s %20s\n", "YEAR", "Amount on Deposit");




        //loop, zero based index
        for(int year = 1; year <= 10; year++)
        {
            //equation            //exponential function
            amount = principal * Math.pow(1.0 + rate , year);

            System.out.printf("%4d %,20.2f \n", year, amount);

        }
    }





}
