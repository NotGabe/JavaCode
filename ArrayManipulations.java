import java.util.Arrays;

public class ArrayManipulations
{
    public static void main(String []args)
    {
        //sort doubleArray into ascending order
        double [] doubleArray = {8.4,9.3,0.2,7.9,3.4};
        Arrays.sort(doubleArray);
        System.out.println();
        System.out.println("doubleArray: ");

        for(int value =0; value<doubleArray.length; value++)                      //(double value: doubleArray)
            System.out.printf("%.1f  ", doubleArray[value]);//(printf(%.1f) , value)


        //fill 10-element array with 7s
        int[] filledIntArray = new int[10];
        Arrays.fill(filledIntArray, 7);
        displayArray(filledIntArray , "filledIntArray");   //method defined below passes the 2 args down

        //copy array intArray into intArrayCopy
        int [] intArray =  {1,2,3,4,5,6} ;
        int [] intArrayCopy = new int[intArray.length];
        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
        displayArray(intArray, "IntArray");
        displayArray(intArrayCopy, "IntArrayCopy");


        //compare intArray and intArrayCopy for equality
        boolean b = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("\n\nintArray %s intArrayCopy\n", (b ? "==" : "!=") );

        //compare intArray and filledIntArray for equality
        b = Arrays.equals(intArray, filledIntArray);
        System.out.printf("intArray %s filledIntArray\n", b ? "==" : "!=");


        //search intArray for value of 5
        int location = Arrays.binarySearch(intArray, 5);

        if(location>=0)
            System.out.printf("Found 5 at element %d in intArray\n", location);
            else
                System.out.println("5 not found in array\n");

         //search intArray for value 8763
        location = Arrays.binarySearch(intArray, 8763);

        if(location>=0)
            System.out.printf("Found 8763 at element %d in intArray\n", location);
        else
            System.out.println("8763 not found in intArray\n");
    }

//output values in each array
public static void displayArray(int[]array , String description)
//takes the arguments, and passes the method body back
{
    System.out.printf("\n%s", description );
}

}




/* for(int value =0; value<doubleArray.length; value++)                      //(double value: doubleArray)
        if(value == doubleArray.length-1)
        System.out.printf("%.1f  ", doubleArray[value]);//(printf(%.1f) , value)
        else
        System.out.printf("%.1f,", doubleArray[value]);

 */