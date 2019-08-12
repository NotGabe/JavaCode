import java.util.Scanner;

public class GradeBookTest
{
    public static void main(String[] args)
    {
        Scanner txtInput = new Scanner(System.in);  //scanner to get input from keyboard

        GradeBook myGradeBook = new GradeBook("CS101") ;  //create object for class GradeBook ,, w/ constructor

        System.out.printf("Initial course name is %s\n", myGradeBook.getCourseName());
        //display initial value of course name,, should be NULL, that is what it returns initially

        System.out.println("Enter a course name: ");
        String theName = txtInput.nextLine();

        myGradeBook.setCourseName(theName);    //set the course name by passing the string to the method
        System.out.println("\n");
        myGradeBook.displayMessage();

    }

}


