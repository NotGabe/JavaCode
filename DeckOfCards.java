import java.util.Random;

public class DeckOfCards
{
    //      object[]array   array of a reference type
    private Card [] deck;  //array of the Card object

    private int currentCard; //index of next card to be dealt
    private static final int NUMBER_OF_CARDS = 52; //constant # of cards

    //random number generator
    Random randomNums = new Random();


    //constructor to fill deck of cards  ///constructor has same name as class
    public DeckOfCards()
    {
        String [] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight","Nine",
        "Ten", "Jack", "Queen", "King"};
        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};

        deck = new Card[NUMBER_OF_CARDS]; //create array for card object
        currentCard = 0;    //sets currentCard so first card dealt is deck[0]

        //populate deck with cards
        for(int i = 0; i<deck.length; i++)
        {
            deck[i] = new Card(faces[i%13],suits[i/13]);  //passes two arguments to Card array/object instance
        }
    } //end DeckofCards constructor

    //shuffle deck of cards with one-pass algorithm
    public void shuffle()
    {
        //after shuffling, dealing should start at deck[0] again
        currentCard = 0;

        //for each card, pick another random card and swap them
        for(int first = 0; first<deck.length; first++)
        {
            //select a random number between 0 and 51
            int second = randomNums.nextInt(NUMBER_OF_CARDS);

            //swap current card with randomly selected new card
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }//end loop
    }//end shuffle method

    public Card dealCard()
    {
        //determine whether cards are remaining to be dealt
        if(currentCard<deck.length)
            return deck[currentCard++ ];  //return card in next index of array
        else
        return null;  //return null to indicate end of deck has been reached
    }
}
