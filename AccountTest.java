import java.awt.*;
import java.util.Scanner;

public class AccountTest
{
    public static void main(String [] args)
    {
        Account Acct1 = new Account(50.00); //create Account object w/ initial val --> constructor
        Account Acct2 = new Account(-7.53 ); // create Account object with initial value

        //display initial values
        System.out.printf("account 1 balance is $ %.2f \n", Acct1.getBalance());
        System.out.printf("account 2 balance is $ %.2f \n", Acct2.getBalance());

        //create scanner to get user inputs

        Scanner txtInput = new Scanner(System.in);

        double depositAmount;  //deposit amount input from user

        System.out.print("Enter deposit for Account 1: ");                      //prompt user
        depositAmount = txtInput.nextDouble();                                    //get user input
        System.out.printf("\n adding %.2f to account1 balance \n\n", depositAmount); //prints message to user
        Acct1.credit(depositAmount);                                             //add to account1 balance


        //display Acct balances again
        System.out.printf("account 1 balance is $ %.2f \n", Acct1.getBalance());
        System.out.printf("account 2 balance is $ %.2f \n", Acct2.getBalance());

        System.out.print("Enter deposit amount for Acct2: ");                   //prompt
        depositAmount = txtInput.nextDouble();                              //takes user input
        System.out.printf("\n adding %.2f deposit to Account2\n", depositAmount);  //message to user
        Acct2.credit(depositAmount);                                          //adds to acct2 w/ credit method


        //display balances again
        System.out.printf("account 1 balance is $ %.2f \n", Acct1.getBalance());
        System.out.printf("account 2 balance is $ %.2f \n", Acct2.getBalance());

    }

}
