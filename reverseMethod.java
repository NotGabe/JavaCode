import java.util.Scanner;

public class reverseMethod
{
    public static void main (String[] args)
    {
        Scanner txtInput = new Scanner(System.in);
        String str;

        System.out.print("Enter your name: ");
        str = txtInput.next();

      // reverseString(str);  //method  **only need to put reverseString(str) in line below

        System.out.printf("Your name in reverseMethod is: \n%s", reverseString(str));
    }

    public static String reverseString(String str)   //method to reverseMethod String
    {
        String reverse = "";

        int len = str.length() - 1;

        for(int n = len ; n>=0 ; n--)
        {
            reverse = reverse + str.charAt(n);
            // reverse = reverse + str.substring(n, n+1);  //another way

        } //end loop

        return reverse;  //return statement
    }
}
