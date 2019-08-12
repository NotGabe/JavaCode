
public class GradeBook
{
    private String courseName;    //course name variable
    private int[] grades; //array of student grades

    public GradeBook(String name, int[] gradesArray)     // --> constructor; initial value passed here into courseName var
    {
        courseName = name; //initialize course name
        grades = gradesArray; // store grades
    }//end gradebook constructor

    public void setCourseName(String name) //-->set method
    {
        courseName = name;
    }//end method setCourseName

    public String getCourseName()   //--> method that returns courseName when called
    {
        return courseName;
    }//end get method

    public void displayMessage() {
        System.out.printf("Welcome to gradebook for %s\n", getCourseName());
    }

    public void processGrades()
    {
        //output grades array
        outputGrades();

        //call method getAverage to calculate average grade
        System.out.printf("\nClass average is %.2f\n", getAverage());

        //call methods get min and max
        System.out.printf("Min grade is %d\n Max grade is %d\n", getMinimum(), getMaximum());

        //call output bar chart
        outputBarChart();
    }//end method processGrades

    public int getMinimum() {
        int minGrade = grades[0]; //initialize lowest grade to first element in array

        //loop thru the array
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < minGrade)
                minGrade = grades[i];
        }
        return minGrade;
    }//end min method

    //find max grade
    public int getMaximum() {
        int maxGrade = grades[0]; //initialize max grade to first element of array

        //loop thru array
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > maxGrade)
                maxGrade = grades[i];
        }
        return maxGrade;
    }//end max method

    public double getAverage() {
        int total = 0;

        //sum grades for one student
        for (int i = 0; i < grades.length; i++) {
            total = total + grades[i];
        }
        return (double) (total / grades.length);

    }//end method getAverage

    public void outputBarChart()
    {
        System.out.println("Grade distribution: ");

        //stores frequency of grades in each range of 10 grades
        int[] frequency = new int[11];

        //for each grade, increment the appropriate frequency
        for  (int grade = 0; grade < grades.length; grade++)     //(int grade : grades)  //code w/ enhanced for
        {
            ++frequency[grades[grade]/10];                       //++frequency[grade/10]
        }

        //for each freq, print bar chart
        for (int i = 0; i < frequency.length; i++)
        {
            //output bar label(00-09, 10-19, ... 80-89 etc)
            if (i == 10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);

            //print bar of asterisks
            for (int stars = 0; stars < frequency[i]; stars++ )
            {

                System.out.print("*");
            }
            System.out.println(); //start new line of output
        }//end outer for
    }//end method

    //output contents of grades array
    public void outputGrades()
    {
        System.out.println("The grades are:\n");

        //output each students grades
        for (int student = 0; student < grades.length; student++)
        {
            System.out.printf("Student %2d: %3d\n", student + 1, grades[student]);
        }
    }//end method outputGrades
}//end class
















/*

        Way of inputting in previous chapter via loops, but grades are not stored, they have to be re-entered each time


    public void determineClassAverage()      //--> method to determine class average;  uses Scanner for input
    {
      Scanner txtInput = new Scanner(System.in);
        int total;                              //variables
        int i;                  //counter variable
        int grade;
        double average;

        total = 0;
        i = 0;    //begins at value of 0, initialize to 1 to ease.

        while(i<=9)  //loop.  takes 10 inputs
        {
            System.out.print("Enter grade: "); //prompt
            grade= txtInput.nextInt();  //takes input as next grade
            total = total + grade ;       //adds grade to total

            i+=1;  //counter increment
        }  //end of loop

        average = (double) total/10 ;
        //still within the determineClassAverage method; just outside of loop; also uses conversion to double
        System.out.printf("Total of all 10 grades is %d \n", total);
        System.out.printf("The average is %.2f", average);

    }//ends determineAVG method
}

 */