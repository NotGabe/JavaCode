public class Employee
{
    private String firstName;
    private String lastName;
    private Date birthDate;  //this class has two instance variable references to the Date object
    private Date hireDate;   //known as a "has-a relationship"

    //constructor to initialize name, bday, and hire day
    public Employee(String first, String last, Date dob, Date hired)
    {
        firstName = first;
        lastName = last;
        birthDate = dob;
        hireDate = hired;
    }

    //convert employee to String format
    public String toString()
    {
        return String.format("%s, %s, Hired: %s, Bday: %s\n", firstName, lastName, birthDate, hireDate);
    }//end method toString
}//end class
