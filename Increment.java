public class Increment
{
    private int total = 0;  //total of all increments

    private final int INCREMENT;  //constant variable (not initialized)

    //constructor to initialize instance variable INCREMENT
    public Increment(int incrementVal)
    {
        INCREMENT = incrementVal;  //initialize constant variable once  //every indiv object of class can have own increm.
    }//end constructor

    //add increment to total
    public void addIncrementToTotal()
    {
        total+= INCREMENT;
    }

    public String toString()
    {
        return String.format("total = %d", total);
    }
}
