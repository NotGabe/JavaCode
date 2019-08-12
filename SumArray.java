public class SumArray
{
    public static void main(String [] args)
    {
        int [] array = {87,68,94,100,83,78,85,91,76,87};
        int total = 0;

        //add each elements value to the total
        for(int i = 0; i < array.length; i++)
        {
            total = total + array[i];
        }

        System.out.printf("Total of array elements: %d \n", total);

        for (int i = 0 ; i < array.length; i++ )
        {
            int aSum = 0;
            if (i ==0)
            {
                aSum = array[i];
            }
                else
            {
                aSum = aSum + array[i] + array[i - 1];
            }
            System.out.print(aSum);
            System.out.println();
        }
    }
}
