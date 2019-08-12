import java.util.Random;

public class RandomIntegers
{
    public static void main(String[] args)
    {
        Random randomNumbers = new Random();  //random number generator
        int face;      //stores each random number generated


        //loop 20 times
        for(int i =1; i <= 20; i++)
        {
            //picks a random number from 1 to 6
            face = 1 + randomNumbers.nextInt(6);  //6 is scaling factor(means 6 unique numbers)
            //add 1 + in beginning bc orig six numbers are 0-5.

            System.out.printf("%d ", face);

            if(i%5 == 0)  //means if i divisible by 5 then new line
                System.out.println();
        } //end for loop
    }//end main
}
