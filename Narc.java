public class Narc
{
    private String name;

    public void setNarcName(String cop)
    {

        name = cop;
    }

    public String getNarcName()
    {
        return name;

    }

    public void writeMessage()
    {
        System.out.printf("Put that nigga %s in the ground" , getNarcName());
    }


}
