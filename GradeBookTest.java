
    public class GradeBookTest
    {
        public static void main(String[] args) {
            //array of student grades
            int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

            GradeBook myGradeBook = new GradeBook("CS101 JAVA", gradesArray);

            myGradeBook.displayMessage();
            myGradeBook.processGrades();

        }//end main method

    }//end class GradeBookTest

