public class Time2
{
    private int hour;   //0-23
    private int minute;  //0-59
    private int second;   //0-59

    //Time2 no-argument constructor: initializes each instance variable to zero,
    //ensures that Time2 objects start in a consistent state
    public Time2()
    {
        this(0, 0, 0);  //invokes Time2 constructor with three arguments
    }//end Time2 no-argument construct

    //Time2 constructor: hour supplied, minute and second defaulted to zero
    public Time2(int h)
    {
        this (h,0,0);  //invokes Time2 constructor with three arguments
    }//end Time2 one-argument constructor

    //Time2 constructor with hour and minute supplied, second default to zero
    public Time2(int h, int m)
    {
        this(h,m,0);  //invoke Time2 constructor with three arguments
    }//end Time2 two-argument constructor

    //Time2 constructor with hour, minute, and second supplied
    public Time2(int h, int m, int s)
    {
        setTime(h,m,s); //invoke Time2 constructor with three arguments
    }//end Time2 three-argument constructor

    //Time2 constructor: another Time2 object supplied
    public Time2(Time2 time)
    {
        //invoke Time2 three-argument constructor
        this(time.getHour(), time.getMinute(), time.getSecond());
    }//end Time2 constructor with Time2 object

    /*              SET METHODS                                    */
    //set a new time value using universal time; ensure that the data remains
    //consistent by setting invalid values to zero

    public void setTime(int h , int m, int s)
    {
        setHour(h); //set the hour
        setMinute(m); //set the minute
        setSecond(s); //set the second
    }//end method setTime

    public void setHour(int h)
    {
        this.hour = ((h>=0 && h<24)?h:0);
    }

    public void setMinute(int m)
    {
        this.minute = ((m>=0 && m<60)?m:0);
    }
    public void setSecond(int s)
    {
        this.second = ((s>=0 && s<60)?s:0);
    }

    //GET METHODS
    public int getHour()
    {
        return hour;
    }
    public int getMinute()
    {
        return minute;
    }

    public int getSecond()
    {
        return second;
    }

    //convert to string in Universal-Time format(HH:MM:SS)
    public String toUniversalString()
    {
        return String.format("%d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    //convert to String in Standard-Time format(HH:MM:SS am/pm)
    public String toStringStandard()
    {
        return String.format("%d:%02d:%02d  %s", ((getHour() ==0 || getHour()==12?12:getHour() %12)), getMinute(),
                getSecond(), (getHour()<12?"AM":"PM"));
    }
}
