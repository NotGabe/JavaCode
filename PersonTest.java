public class PersonTest
{
    public static void main(String []args)
    {
        //show that count is zero before creating Persons
        System.out.printf("Employees before instantiation: %d\n", Person.getCount());

        //create two persons
        Person p1 = new Person("Susan","Baker");
        Person p2 = new Person("Bob", "Blue");

        //show that count is two after creating two persons
        System.out.println("\nPeople after instantiation: ");
        System.out.printf("via p1.getCount(): %d\n", p1.getCount());
        System.out.printf("via p2.getCount(): %d\n", p2.getCount());
        System.out.printf("via Person.getCount(): %d\n", Person.getCount() );


        //get names
        System.out.printf("\nPerson 1: %s %s\n Person 2: %s %s\n", p1.getFirst(), p1.getLast(),
                p2.getFirst(), p2.getLast());



    }
}
