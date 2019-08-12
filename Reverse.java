import java.util.Scanner;

public class Reverse
{
    public static void main (String[] args)
    {
        Scanner txtInput = new Scanner(System.in);
        String str;

        System.out.print("Enter your name: ");
        str = txtInput.next();

        String reverse = "";

        int len = str.length() - 1;

        for(int n = len ; n>=0 ; n--)
        {
            reverse = reverse + str.charAt(n);
            //reverse = reverse + str.substring(n, n+1);  //another way

            // System.out.print(str.substring(n,n+1));
            // System.out.println();
        }

        System.out.printf("Your name in reverse is: \n%s", reverse);
    }

}
