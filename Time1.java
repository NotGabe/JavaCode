public class Time1
{

    private int hour;    //0-23    //can initialiaze to zero but dont have to bc compiler does
    private int minute; // 0-59
    private int second; // 0-59

    //set a new time value using universal time; ensure that the
    //data remains consistent by setting invalid values to zero
    public void setTime(int h, int m , int s)
   {
       hour = ((h>=0 && h<24)?h:0); //validate hour     if h>0 & h<24, hour = h, else hour = 0.
       minute= ((m>=0 && m<60)?m:0); //validate minute  if m>0 & m<60 minute =m, else minute = 0.
       second= ((s>=0 && s<60)?s:0); //validate second  if s>0 & s<60 second = s, else second = 0.
   } //end method setTime

    //convert to String in universal time format(HH:MM:SS)
    public String toUniversalString()
    {
        return String.format("%02d:%02d:%02d", hour, minute , second );
    }//end method toUniversalString

    //convert to String in standard time format(H:MM:SS AM or PM)
    public String toStandardString()
    {
        return String.format("%02d:%02d:%02d %s",
                ((hour==0 || hour==12)?12:hour%12),minute,     //if hour ==0 or hour ==12, its 12, else its 1 to 11
                second, (hour <12 ? "AM": "PM"));                                            // hour%12 = hour mod 12
                                                                        //remainder between 12 and the # it goes into
    }//end method toStandardString
}    //end class time1




        /* this is a constructor that would be used up top.
        In TimeTest1, if we want a starting time that
        is not 00:00:00, here is the constructor that would get that values passed through the instance of it
        created in the main method.

   public Time1(int h, int m, int s)
    {
       hour = ((h>=0 && h<24)?h:0); //validate hour     if h>0 & h<24, hour = h, else hour = 0.
       minute= ((m>=0 && m<60)?m:0); //validate minute  if m>0 & m<60 minute =m, else minute = 0.
        second= ((s>=0 && s<60)?s:0); //validate second  if s>0 & s<60 second = s, else second = 0
    }   */