public class Card
{
    private String face; //face of card(Ace, two, jack, king etc)
    private String suit; //suit(club, spade, etc)

    //Constructor that has two arguments to initialize that card's face and suit
    public Card(String cardFace, String cardSuit)
    {
       face = cardFace;
        suit = cardSuit;

    } //end constructor

    //method to return String representation of card

    public String toString()  //return string representation of card
    {
        return face + " of " + suit;
    }








}
