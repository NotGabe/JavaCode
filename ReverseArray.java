public class ReverseArray
{
    public static void main(String [] args)
    {
        int [] array = {1,2,3,4,5,6 };
        int [] copyArray = new int[array.length];

        for(int i = array.length-1 ;i>= 0;i--)
        {
            copyArray[i] = array[i];
            System.out.print(copyArray[i]);
        }






    }
}
