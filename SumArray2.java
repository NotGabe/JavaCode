public class SumArray2
{
    public static void main(String [] args)
    {
        int [] array = new int [10];

        int total= 0;
        int sum = 0 ;


        //loop to put values in each element of array
        for(int i = 0; i < array.length; i++)
        {
            array[i] = 2 + 2*i;

        }
        System.out.printf("%s%8s%8s \n", "Index", "Value", "Sum"); //header



        //totals all elements of array.  figure out one by one
        for(int i = 1; i < array.length; i++)
        {
            total = total + array[i];
          //  total = array[i-1] + array[i];
        }


        for(int i = 0; i <array.length; i++)
        {
            System.out.printf("%d%8d%8d\n",i , array[i], total );
        }
    }
}
