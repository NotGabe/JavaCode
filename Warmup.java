import java.util.Scanner;


public class Warmup
{

    public static void main(String[] args)
    {
        Scanner txtInput = new Scanner(System.in);

    System.out.print("Enter a name: ");
    String name = txtInput.next();

    if (name.equals("joey"))
        System.out.printf("%s is a cop", name);
    else
        System.out.printf("%s is chill", name);
    }
}