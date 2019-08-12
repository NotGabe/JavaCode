import java.util.Scanner;


public class InvoiceTest
{
public static void main(String[] args)
 {
    Scanner txtInput = new Scanner(System.in);

    Invoice invoiceObject = new Invoice(" ", " ", 0, 0);
    //--> constructor for initial values

     String partNum;       //declare variables
     String description;
     int quantity;
     double pricePerItem;

     System.out.print("Enter description: ");    //description
     description = txtInput.next();
     invoiceObject.setDescription(description);


        System.out.print("Enter part Number: ");    //part number
        partNum = txtInput.next();
        invoiceObject.setPartNum(partNum);

        System.out.print("Enter quantity: "); //quantity
        quantity = txtInput.nextInt();
        if (quantity > 0)                    //make sure quantity is more than zero
        {
            invoiceObject.setQuantity(quantity );
        }

        System.out.print("Enter price of item: ");    //make sure price is more than zero
        pricePerItem = txtInput.nextDouble();
        if (pricePerItem > 0)
        {
            invoiceObject.setPricePerItem(pricePerItem);
        }


        System.out.print("\n");
        System.out.printf("The total amount is %.2f", invoiceObject.displayAmount());
                                           //calls method that calculates the amount

 }

}
