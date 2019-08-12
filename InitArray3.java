public class InitArray3
{

    public static void main(String [] args)
    {
        final int ARRAY_LENGTH = 10;          //declare constant variable
        int[] array = new int[ARRAY_LENGTH];  // creates array with length of variable ARRAY_LENGTH

        //use loop to calculate each element of index i in array
        for(int i = 0; i <array.length; i++)
        {
            array[i] = 2 +2*i ;
        }

        System.out.printf("%s%8s \n", "Index", "Value"); //header

        for(int i = 0; i <array.length; i++)
        {
             System.out.printf("%5d %8d \n", i, array[i]);
        }

    }

}

