public class EmployeeTest
{
    public static void main(String[]args)
    {
        //create 2 date objects; pass values to constructor
        Date birth = new Date(7,24,1949);
        Date hire = new Date(3,12,1988);

        //create object for Employee class
        Employee employee = new Employee("Bob", "Blue", birth, hire);

        System.out.println(employee);

    }//end main
}//end class EmployeeTest
