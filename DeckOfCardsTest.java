public class DeckOfCardsTest
{
    public static void main(String [] args)
    {
        DeckOfCards MyDeckOfCards = new DeckOfCards();

        MyDeckOfCards.shuffle(); //place cards in random order

        //print all 52 cards in order they are dealt

        for(int i = 1; i<=52; i++)
        {
            //deal and display cards
            System.out.printf("%-19s", MyDeckOfCards.dealCard());

            if(i % 4 ==0)  //output new line ever 4 cards
                System.out.println();
        }
    }
}
