public class BreakTest
{
    public static void main(String[] args)
    {
        int count;   //control variable

        for(count =1; count <= 10; count++) // --> can also initialize count in here with int count = 1;
        {
            if(count ==5)  //if count =5,
            {
                break ;    //terminate loop
            }

            System.out.printf("%d", count);
        }
                System.out.printf("\n Broke out of loop at count = %d", count);
    }
}
