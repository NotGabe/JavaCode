public class InitMultiArray
{
    //create and output 2-dimensional array
    public static void main(String[]args)
    {
        int[][] array1 = {{1,2,3},{4,5,6}};
        int[][] array2 = {{1,2},{3},{4,5,6}};


        System.out.println("Values in array1 by row are: ");
        outputArray(array1); //display array1 by row
        System.out.println();


        System.out.println("Values in array2 by row are: ");
        outputArray(array2);
    }

    //output rows and columns of a 2-dimensional array
    public static void outputArray(int[][]array)
    {
        for(int row =0;row<array.length;row++)
        {
            //loop thru columns of current row
            for(int column = 0;column<array[row].length;column++)
            {
                System.out.printf("%d ", array[row][column]);
            }
            System.out.println();
        }
    }
}
