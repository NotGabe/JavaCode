import java.util.Random ;

public class RollDie
{
    public static void main(String [] args)
    {
        Random randomNums = new Random(); //random number generator
        int [] frequency = new int[7];  //array of frequency counters

        //roll die 6000 times; use die values as frequency index
        //this replaces a switch statement like for ch 6

        for(int roll = 1; roll <=6000; roll++)
        {
           ++frequency [1+randomNums.nextInt(6)];
        }

        System.out.printf("%4s%10s\n", "Face", "Frequency");

        for(int face = 1; face < frequency.length; face++)
        {
            System.out.printf("%4d%10d\n", face, frequency[face]);
        }

    }
}
