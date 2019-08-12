//used for enum

public enum Book
{
    //declare constants of enum type

    JHTP ("Java how to Program", "2010"),
    CHTP("C How to program", "2007"),
    IW3HTP("Internet & Worldwide Web", "2008"),
    CPPHTP("C++ how to program", "2008"),
    VBHTP("Visual Basic how to program", "2009"),
    CSHARPHTP("C# how to program", "2008");

    //instance fields
    private final String title;
    private final String copyRightYear;

    //enum constructor
    Book(String bookTitle, String year)
    {
        title = bookTitle;
        copyRightYear=year;
    }
        public String getTitle()
        {
            return title;
        }

        //accessor field for copyrightYear
    public String getCopyrightYear()
    {
        return copyRightYear;
    }
}//end enum Book
