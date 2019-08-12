public class Account
{
    private double balance;  //instance variable that stores balance -- private to this class only

    public Account(double initialBal)   // --> constructor. initialBal variable will be passed here from main method
    {

        if(initialBal > 0.0)  //if initial bal > 0, make it that bal, initial is set to 0 by default

        {
            balance = initialBal ;
        }

    }

    public void credit(double amount) //method to credit/(add) amount to balance
    {
        balance = balance + amount;
    }

    public double getBalance() //method to get balance
    {
        return balance;    //return value of the balance when method is called

    }

}
