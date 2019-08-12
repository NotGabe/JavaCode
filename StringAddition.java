public class StringAddition
{
    public static void main(String [] args)
    {
        makeOutWord("1234", "food");
        System.out.printf("%s", makeOutWord("1234", "food"));



    }

    public static String makeOutWord(String s1, String s2)
    {
        //s1 = 1234
        //s2=food

        String half1 = s1.substring(0,s1.length()/2);
        String half2 = s1.substring((s1.length()/2), s1.length());
        String sFinal = half1 + s2 + half2;


        return sFinal;
    }
}
