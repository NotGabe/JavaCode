public class Invoice
{
    private String partNum;                //declare instance variables
    private String description;
    private int quantity;
    private double pricePerItem;

    public Invoice(String pNum , String desc , int quant, double price )
    {                                  //--> constructor, passes multiple arguments from Main.
       partNum = pNum;
        description = desc;
        quantity = quant;
        pricePerItem = price;
    }

        public void setPartNum(String pNumber)      //set and get methods for part num
        {
            partNum = pNumber;
        }
        public String getPartNum()
        {
            return partNum;
        }

        public void setDescription(String desc)    //set and get methods for description
        {
            description = desc;
        }
        public String getDescription()
        {
            return description;
        }

        public void setQuantity(int quant)     // set and get methods for quantity
        {
            quantity = quant;
        }
        public int getQuantity()
        {
            return quantity;
        }

        public void setPricePerItem(double price)    //set and get methods for price per item
        {
            pricePerItem = price;
        }
        public double getPricePerItem()
        {
            return pricePerItem;
        }

        public double displayAmount()  //method to display total amount
        {
            double amount;
            amount = quantity*pricePerItem;

            return amount;
        }


}
