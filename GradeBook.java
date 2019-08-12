public class GradeBook
{
    private String courseName;    //course name for gradebook; private so only this class can use it

    public GradeBook (String name)
    //this is a constructor.  if you declare initial value in () of object in main, this constructor holds it
    {//dont need if no initial value assigned to object instance in main method
        courseName = name;
    }

    public void setCourseName(String name)    //set method
    {
        courseName = name;    //when string is passed to this method, sets string pass ->courseName var

    }

    public String getCourseName()  //method to get course name
    {//returns null if either called before assigned anything plus no constructor initially
        return courseName;
    }

    public void displayMessage()   //calls getCourseName to get the name of course for this GradeBook
    {
        System.out.printf("Welcome to the gradebook for \n %s \n", getCourseName());
    }
}
