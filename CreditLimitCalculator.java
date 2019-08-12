import java.util.Scanner;

public class CreditLimitCalculator
{
    public static void main(String[] args)
    {
        Scanner txtInput = new Scanner(System.in);  //scanner

        int acctNum;   //variables
        int begBal;
        int itemTotal;
        int creditTot;

        CreditLimit creditCalc = new CreditLimit(); //(0, 0, 0, 0); // --> constructor
                                                    //constructor not necessary bc of set methods w/ inputs

        int cont = 1;

        while (cont != 0)   //loop
        {

            System.out.println();
            System.out.print("Please enter your account number: ");
            acctNum = txtInput.nextInt();
            creditCalc.setAccountNum(acctNum);

            System.out.printf("Enter beginning balance for account %d ", creditCalc.getAccountNum());
            begBal = txtInput.nextInt();
            creditCalc.setBegBalance(begBal);

            System.out.printf("Enter item total for account %d ", creditCalc.getAccountNum());
            itemTotal = txtInput.nextInt();
            creditCalc.setItemTotal(itemTotal);

            System.out.printf("Enter total credits for account %d ", creditCalc.getAccountNum());
            creditTot = txtInput.nextInt();
            creditCalc.setCreditTotal(creditTot);


            creditCalc.calculateBalance();              //calculates the balance very simple
            creditCalc.determineCreditExceeded();           //method determines if cLimit exceeded
            System.out.println();

            System.out.print("Press 0 to exit, 1 to cont");
            cont = txtInput.nextInt();

        }
    }
}