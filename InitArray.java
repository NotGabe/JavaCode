public class InitArray
{
    public static void main(String [] args)
    {
        int [] array;  // integer array with name 'array'
        array = new int [10];  // creates array object size 10

        System.out.printf("%s%8s \n", "Index", "Value"); //header

        //loop to output each element of array
        for(int i = 0; i <array.length; i++)
        {
            System.out.printf("%5d %8d \n", i, array[i]);
        }
    }
}
