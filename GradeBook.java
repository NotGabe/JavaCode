import java.util.Scanner;

public class GradeBook
{
    private String courseName;    //course name variable
    //int instance variables are initialized to zero
    private int total;        //total variable
    private int gradeCounter; // counter variable
    private int aCount;   //variables ++ for each grade range (Case Selection)
    private int bCount;
    private int cCount;
    private int dCount;
    private int fCount;


    public GradeBook(String name)     // --> constructor; initial value passed here into courseName var
    {
        courseName = name;
    }

    public void setCourseName(String name) //-->set method
    {
        courseName = name;
    }

    public String getCourseName()   //--> method that returns courseName when called
    {
        return courseName;
    }

    public void displayMessage() {
        System.out.printf("Welcome to gradebook for %s\n", getCourseName());
    }

    public void inputGrades()
    {
        Scanner txtInput = new Scanner(System.in);

        int grade;  // grade entered by user

        System.out.printf("%s\n\n%s\n\n   %s\n   %s\n", "enter grades 0-100", "Type end of file indicator to terminate",
                "On unix/linux/mac osx type <CMD> d then press enter", "On windows type <CTRL> z then Enter");

        //loop until user enters end-of-file indicator/ sentinel control --> while loop
        while (txtInput.hasNext()) //
        {
            grade = txtInput.nextInt();
            // as long as there is another input / end of file indicator hasnt been entered
            //returns boolean value of true until end of file is pressed and returns false
            total = total + grade;
            gradeCounter++;

             incrementLetterGradeCounter(grade);
        }

    }

    private void incrementLetterGradeCounter(int grade) {
        switch (grade / 10) {
            case 9:
            case 10:      //grade was between 90 and 100
                aCount++; // add 1 to A grade counter
                break;    //break prevents falling through once proper grade counter counted
            case 8:      //grade in 80s
                bCount++;  //add 1 to b counter etc.
                break;
            case 7:
                cCount++;
                break;
            case 6:
                dCount++;
                break;
            default:
                fCount++;
                break;
        }
    }
        public void displayGradeReport()
        {
            System.out.println("Grade Report: ");

            //if user enters at least one grade
            if(gradeCounter != 0)
            {
                double average;
                average = (double) total / gradeCounter; //average of all grades

                //outout summary of results
                System.out.printf("Total of the %d grades entered is %d\n", gradeCounter, total);
                System.out.printf("Class average is %.2f \n", average);
                System.out.printf("%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n",
                        "Number of students who received each grade: ",
                        "A: ", aCount, "B: ", bCount, "C: ", cCount, "D: ", dCount, "F: ", fCount);
            }
            else
            {
                System.out.println("No grades were entered");
            }
        }
}