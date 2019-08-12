public class WhileCounter
{
    public static void main(String [] args)
    {
        int i = 1; //initialize at 1

        while (i<=10)
        {
            System.out.printf("%d  ", i);  //loop
            ++i;             //pre-increment
        }

        System.out.println();
    }
}
