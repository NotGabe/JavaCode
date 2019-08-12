import java.util.Scanner;

public class SalesCommission
{
    int item1;
    int item2;
    int item3;
    int item4;

    public void setItemOne(int itemOne)
    {
        item1 = itemOne;
    }

    public void setItemTwo(int itemTwo) {
        item2 = itemTwo;
    }

    public void setItemThree(int itemThree)
    {
        item3 = itemThree;
    }
    public void setItemFour(int itemFour)
        {
            item4 = itemFour;
        }

        public void inputData()
        {
            Scanner txtInput = new Scanner(System.in);
            String name;

            System.out.print("Enter Salesperson Name: ");
            name = txtInput.next();

            int amountItemOne;
            int amountItemTwo;
            int amountItemThree;
            int amountItemFour;

            System.out.print("Enter how many of item 1: ");
            amountItemOne = txtInput.nextInt();
            setItemOne(amountItemOne);

            System.out.print("Enter amount of item 2: ");
            amountItemTwo = txtInput.nextInt();
            setItemTwo(amountItemTwo);

            System.out.print("Enter amount of item 3: ");
            amountItemThree = txtInput.nextInt();
            setItemThree(amountItemThree);

            System.out.print("Enter amount of item 4: ");
            amountItemFour = txtInput.nextInt();
            setItemFour(amountItemFour);

        }
        public double calculateTotalSales()
            {
                    double Total;
                    Total = (double)(item1*240) + (item2*130) + (item3*100) + (item4*351);
                return Total;

            }

            public double calculateCommissions()
            {
                double comm;
                comm = (.09*((item1*240) + (item2*130) + (item3*100) + (item4*351)));
                return comm;
           }









}


