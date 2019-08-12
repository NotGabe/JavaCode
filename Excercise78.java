import java.util.Random;
import java.util.Arrays;
public class Excercise78
{

    public static void main(String [] args)
    {
        int [] arr = {4,1,2,3,4,5,6,7,8,9};
           System.out.print(arr[6]);  //print element in sixth index of arr
        System.out.println();

        int[] g = new int[5];
        for(int i = 0; i< g.length ; i++)
        {
            g[i] = 5;
            System.out.printf("%d", g[i]);
        }
           System.out.println();


        //fill 100 element array with random numbers
        double [] hunnids = new double [100];
        Random randomNums = new Random();
        Arrays.fill(hunnids, (double)randomNums.nextInt(250));  //fill it with numbers up to 250
        double sum=0;
        for(int i = 0; i<hunnids.length;i++)   //get sum
        {
            sum = sum + hunnids[i];

        }
            System.out.print(sum);
        System.out.println();           //print


           for (int j=0;j<hunnids.length;j++)   //loop to print each element of array hunnids; using j instead of i
           {
                System.out.printf("%.2f\n", hunnids[j]);
           }



            String name = "gabriel";
           char [] charArray = new char [name.length()];
            //string into char array one char in each element
           for(int i=0;i<charArray.length;i++)
           {
            charArray[i] = name.charAt(i) ;
           }
            System.out.print(charArray);
           System.out.println();


           char[] nameRev = new char[name.length()];
           for(int i = name.length()-1; i>=0;i--)
           {
               nameRev[i] = name.charAt(i);
                System.out.print(nameRev[i]);
           }

    }









}
