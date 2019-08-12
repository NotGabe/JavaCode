public class Date
{
    private int month;
    private int day;
    private int year;

    //constructor: call checkMonth to confirm proper value for month;
    //call checkDay to confirm proper value for day
    public Date(int theMonth, int theDay, int theYear)
    {
        month = checkMonth(theMonth) ; //validate month
        day = checkDay(theDay) ;     //validate day
        year = theYear;     //we dont use a method to validate year, we assume it is correct

        System.out.printf("Date object constructor for date %s\n", this);
    }//end constructor

    private int checkMonth(int testMonth)
    {
        if(testMonth>0 && testMonth <=12)
        {return testMonth;}
        else
        {       //if month is invalid, print msg and return 1 as month
            System.out.printf("Invalid month (%d) set to 1", testMonth);
            return 1;
        }
    }//end method checkMonth

    private int checkDay(int testDay)
    {
            //array that holds number of days of each month as each element in array
        int [] daysPerMonth = {0, 31,28,31,30,31,30,31,31, 30,31,30,31};

            //check if day in range for the month
        if(testDay>0 && testDay<=daysPerMonth[month])
        {
            return testDay;
        }

        //check for leap year
        if ((month ==2 && testDay ==29 &&(year%400 ==0 || (year%4==0 && year%100 !=0))))
        {
            return testDay;
        }

            System.out.printf("Invalid day (%d) set to 1", testDay);
            return 1; //maintain object in consistent state
    } //end checkDay method


    public String toString()
    {
        return String.format("%d/%d/%d", month, day, year);
    }//end method toString
}//end class Date
