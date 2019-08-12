import java.util.Scanner;


public class miligrams
{
    private String pillName;

    public void setPill(String pill)
    {
        pillName = pill.toLowerCase();
    }

    public String getPill()
    {

        return pillName;
    }

    public void displayMessage()
    {
        System.out.print("\n\nWelcome to Gabe's pill mill\n");
    }

    public void determineMG()
    {
        int cont = 0;
        while(cont <=5)
        {
            String color;
            Scanner input = new Scanner(System.in);
            System.out.print("\n\nWhat color are your indians? : ");
            color = input.next();
            setPill(color);
            if (pillName.equals("orange"))
                System.out.printf("\n%s is a .5mg, eat one\n", pillName);
            else if (pillName.equals("yellow"))
                System.out.printf("\n%s is a .25mg, eat two my nigga\n", pillName);
            else if (pillName.equals("white")) {
                System.out.printf("\n%s is a 1.0 my nigga be easy", pillName);
            }

            cont++;
        }


    }







}
