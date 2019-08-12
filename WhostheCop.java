import java.util.Scanner ;

public class WhostheCop
{
    public static void main(String[] args)
    {
        Scanner txtInput = new Scanner(System.in);

        Narc Narc1 = new Narc();

        System.out.printf("initial is %s", Narc1.getNarcName());
        System.out.println("\nWho's a narc?");

        String theName = txtInput.nextLine();
        Narc1.setNarcName(theName);

        Narc1.writeMessage();

    }
}