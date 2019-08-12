public class PassArray
{
    public static void main(String [] args)
    {
       //main creates method and calls modifyArray & modifyElement
       int[] array = {1,2,3,4,5};

       System.out.println("Effects of passing reference to entire array: \n\n" +
               "The values of the original array are: ");

       //output original array elements
        for(int value =0 ; value< array.length; value++)
            System.out.printf("   %d", value);

        modifyArray(array);  //pass array reference
        System.out.printf("\n\n Effects of passing array element value: \n" +
                "array[3] before modifyElement: %d\n", array[3]);


        modifyElement(array[3]);  //attempt to modify array[3]
        System.out.printf("array[3] after modifyElement: %d\n", array[3]);

    } //end main


    //multiply each element of array by 2
    public static void modifyArray(int[] array2)
    {
        for(int i = 0; i<array2.length; i++)
        {
            array2[i] = array2[i] * 2;
        }
    }

    //multiply argument/element by 2
    public static void modifyElement (int element)
    {
        element = element * 2;
        System.out.printf("Value of element in modifyElement:  %d\n", element);
    }





}
