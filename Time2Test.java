public class Time2Test
{
    public static void main(String [] args)
    {
        Time2 t1 = new Time2(); //00:00:00
        Time2 t2 = new Time2(2);//02:00:00
        Time2 t3 = new Time2(21,34); //21:34:00
        Time2 t4 = new Time2(12,25,42); //12:25:42
        Time2 t5 = new Time2(27,74,99); //00:00:00
        Time2 t6 = new Time2(t4); //12:25:46


        System.out.println("Constructed with: ");
        System.out.println("t1: all arguments defaulted");
        System.out.printf("\t%s\n", t1.toUniversalString());
        System.out.printf("\t%s\n", t1.toStringStandard());
        System.out.println();

        System.out.println("t2: hour specified, min & s default");
        System.out.printf("\t%s\n", t2.toUniversalString());
        System.out.printf("\t%s\n", t2.toStringStandard());
        System.out.println();

        System.out.println("t3: hour & min specified, sec default");
        System.out.printf("\t%s\n", t3.toUniversalString());
        System.out.printf("\t%s\n", t3.toStringStandard());
        System.out.println();

        System.out.println("t4: hour min & sec specified");
        System.out.printf("\t%s\n", t4.toUniversalString());
        System.out.printf("\t%s\n", t4.toStringStandard());
        System.out.println();

        System.out.println("t5: all invalid values");
        System.out.printf("\t%s\n", t5.toUniversalString());
        System.out.printf("\t%s\n", t5.toStringStandard());

        System.out.println("t6: Time2 object t4 specified");
        System.out.printf("\t%s\n", t6.toUniversalString());
        System.out.printf("\t%s\n", t6.toStringStandard());




    }
}
