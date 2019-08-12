public class CreditLimit
{
    private int acctNum;
    private int begBalance;
    private int itemTotal;
    private int creditTotal;
    private int cLimit;

   // public CreditLimit(int acct, int begBal, int itemTot, int creditTot)  // --> constructor
  //  {                                                 NOT Neccessary bc of set methods gathering inputs
   //  acctNum = acct;
    // begBalance = begBal;
    // itemTotal = itemTot;
    // creditTotal = creditTot;

  //  }

    public void setAccountNum(int Acct)
    {
        acctNum = Acct;
    }
    public int getAccountNum()
    {
        return acctNum;
    }
    public void setBegBalance(int balance)
    {
        begBalance = balance;
    }
    public int getBegBalance()
    {
        return begBalance;
    }
    public void setItemTotal(int items)
    {
        itemTotal = items;
    }
    public int getItemTotal()
    {
        return itemTotal;
    }
    public void setCreditTotal(int credit)
    {
        creditTotal = credit;
    }
    public int getCreditTotal()
    {
        return creditTotal;
    }
    public int calculateBalance()                       //method to calculate the balance
    {
        return getBegBalance() - getItemTotal() + getCreditTotal();

    }
    public void determineCreditExceeded()       //determines if limit exceeded
    {
        if (creditTotal> calculateBalance())
        {
            System.out.println("Credit Limit exceeded");
        }
        else
        {
            System.out.print( "You are within your bounds");
        }

    }

}
