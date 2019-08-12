public class IncrementTest
{
    public static void main(String[] args)
    {
        Increment value = new Increment(5);   //create object and pass initial value to constructor

        System.out.printf("Before incrementing: %s\n\n", value);

        for (int i = 0; i < 3; i++) {
            value.addIncrementToTotal();
            System.out.printf("After increment %d: %s\n", i, value);
        }
    }
}




  /*
  If this were all one window and didnt create a separate object, would just need to make the class static
     so that the main method which is static could call it.

  private static class Increment
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

} */
