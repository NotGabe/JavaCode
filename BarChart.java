public class BarChart
{
    public static void main(String [] args)
    {
        int [] array = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};

        System.out.print("\nGrade Distribution: \n");


        //for each element in array, output a bar chart
        for(int i = 0; i < array.length; i++)
        {
            //output bar labels (00-09, 10-19, 20-29) etc.
         if(i == 10)
             System.out.printf("%5d: ", 100);
         else
             System.out.printf("%02d-%02d: ",i*10, i*10+9);


                //print bar of asterisks
            for (int stars = 0; stars < array[i]; stars++)
            {
                System.out.print("*");
            }
                System.out.println();
        }

    }
}
