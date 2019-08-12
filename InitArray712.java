//run it from the command line

//java initArray712.java
//java initArray712.java 5 0 4    passes these numbers to the arrays and re runs the program


public class InitArray712
{
    //check number of command line arguments
    public static void main(String[]args)
    {
        if(args.length !=3)
            System.out.println("Error: please re-enter entire command, including\n" +
                    "an array size, initial value, and increment");
        else
        {
          //get array size from first command-line argument
          int arrayLength = Integer.parseInt(args[0]);
          int[]array = new int[arrayLength]; //create array

            //get initial value and increment from command-line arguments
            int initialValue = Integer.parseInt(args[1]);
            int increment = Integer.parseInt(args[2]);

            //calculate value for each array element
            for(int counter = 0; counter<array.length;counter++)
            {
                array[counter] = initialValue + increment * counter;
            }

            System.out.printf("%s%8s\n", "Index", "Value"); //header

            //display array index and value
            for(int counter=0;counter<array.length;counter++)
            {
                System.out.printf("%5d%8d\n", counter, array[counter]);
            }
        }
    }
}
