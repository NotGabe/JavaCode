public class Person
{
    private String firstName;
    private String lastName;
    private static int count = 0; //number of person's created
    //static var means same static var shared by all objects of the class


    //initialized person, add 1 to static count and
    //output String indicating that constructor was called
    public Person(String first, String last)
    {
        firstName = first;
        lastName = last;
        count++; //increment static count
        System.out.printf("Person constructor: %s %s; count = %d\n", firstName, lastName, count);
    }//end constructor

    //get first name
    public String getFirst()
    {
        return firstName;
    }

    //get last name
    public String getLast()
    {
        return lastName;
    }

    public static int getCount()
    {
        return  count;
    }

}//end class
