public class GradeBookTest
{
    public static void main(String[] args)
    {
        GradeBook myGradeBook = new GradeBook("Java Ch. 5") ;  //create object for class GradeBook w/ constructor

        myGradeBook.displayMessage();
        myGradeBook.inputGrades();
        myGradeBook.displayGradeReport();
    }
}