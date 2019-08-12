public class Time1Test
{
    public static void main(String[]args)
    {
        //create and initialize time1 Object
        Time1 time = new Time1();  //invokes Time1 constructor ; initially sets them to zero

        //output string representations of the time
        System.out.print("\nThe initial universal time is: ");
        System.out.println(time.toUniversalString());
        System.out.print("The initial standard time is: ");
        System.out.println(time.toStandardString());
        System.out.println();

        //change time and output updated time
        time.setTime(13,27,6);  //set method
        System.out.print("Universal time after setTime is: ");
        System.out.println(time.toUniversalString());
        System.out.print("Standard time after setTime is: ");
        System.out.println(time.toStandardString());
        System.out.println();

        //set time with invalid numbers
        time.setTime(99,99,99);  //set method
        System.out.println("After inputting invalid settings");
        System.out.print("Universal time is: ");
        System.out.println(time.toUniversalString());
        System.out.print("Standard time is: ");
        System.out.println(time.toStandardString());
        System.out.println();

    }
}
