public class practiveLoop
{


  public static void main(String[]args) {
      int[] array = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

      int grades;


      int[] frequency = new int[11];

      //for each grade, increment the appropriate frequency
      for (int grade = 0; grade < array.length; grade++)     //(int grade : grades)  //code w/ enhanced for
      {
          ++frequency[array[grade] / 10];//++frequency[grade/10]


          System.out.print(grade + "   " +   array[grade] + "  "+  frequency[grade]);
          System.out.println();
      }



  }




}