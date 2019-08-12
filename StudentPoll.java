
public class StudentPoll
{
    public static void main(String [] args)
    {
        //array of survey responses
        int[]responses = {1,2,6,4,8,5,9,7,8,10,1,6,3,8,6,10,3,8,2,7,6,5,7,6,8,6,7,5,6,6,5,6,7,5,6,4,8,6,8,10};

        int[]frequency = new int[11]; //array of frequency counters

        //for each answer, select responses element & use that value as frequency index
        //to increment that frequency element
        for(int answer = 0; answer < responses.length; answer++)
        {
            ++frequency[responses[answer]];  //adds to freq counter of the appropriate response; element of freq array
        }
        System.out.printf("%s\t%s\n", "Rating", "Frequency");  //header

        //output each array elements value
        for(int rating = 1; rating<frequency.length; rating++)
        {
            System.out.printf("%d\t\t%d\n", rating, frequency[rating]);
        }
    }
}
