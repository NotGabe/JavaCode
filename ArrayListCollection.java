import java.util.ArrayList;

public class ArrayListCollection
{
    public static void main(String[]args)
    {
        //create new arrayList of Strings
        ArrayList<String> items = new ArrayList<String>();

        items.add("red");
        items.add(0,"yellow");  //at the 0 index, add yellow

        //header
        System.out.print("Display list contents with counter-controlled loop: ");

        //display colors in the list
        for(int i =0;i<items.size(); i++)
        {
            System.out.printf(" %s", items.get(i));
        }

        //display colors using for-each method
        display(items, "\nDisplay list contents with enhanced for statements: ");

        items.add("green");
        items.add("yellow");
        display(items, "List with two new elements: ");

        items.remove("yellow");
        display(items, "Remove first instance of yellow: ");

        items.remove(1);  //remove element at index 1
        display(items, "Remove second list element (green): ");

        //check if value is in the list
        System.out.printf("'red' is %sin the list\n", items.contains("red")?"":"not ");


        //display number of elements in the list
        System.out.printf("Size: %s\n", items.size());

    } //end main


public static void display(ArrayList<String>items,String header )
{
    System.out.print(header); //display header

    for(String item : items)
        System.out.printf(" %s", item);
    System.out.println();
}
}
