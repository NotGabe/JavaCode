import java.util.Random;

public class Craps
{
    //create random num for use in method RollDie
    private static final Random randomNums = new Random();

    //enumeration with constants that represent game status
    private enum Status {CONTINUE , WON , LOST}

    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
   private static final int BOX_CARS = 12;

    //play one game of craps
    public void play()
    {
        int myPoint = 0; //point if no win or loss on first roll
        Status gameStatus; //can contain CONTINUE, WIN, LOSE; enum type

        int sumOfDice = rollDice();  //first roll of the dice

        //determine game status and point based on first roll
        switch (sumOfDice)
        {
            case SEVEN:                     //win on first roll
            case YO_LEVEN:
                gameStatus = Status.WON;
                break;

            case SNAKE_EYES:            //lose on first roll
            case TREY:
            case BOX_CARS:
                gameStatus = Status.LOST;
                break;

            default:         //didnt win or lose with roll, so remember point
                gameStatus = Status.CONTINUE;
                myPoint = sumOfDice;         //sum of dice becomes your point number
                System.out.printf("Your point is %d \n", myPoint);
                break;
        }

        //while game is not over
        while (gameStatus == Status.CONTINUE) {
            sumOfDice = rollDice();  //roll dice again

            //determine game status
            if (sumOfDice == myPoint)
                gameStatus = Status.WON;
            else if (sumOfDice == SEVEN)
                gameStatus = Status.LOST;
        } //end while


        if(gameStatus == Status.WON)
            System.out.println("Player wins");
            else
                System.out.println("Player Loses");


    }//end method play


    public int rollDice()
    {
        //pick random dice values
        int die1;
        int die2;

        //die rolls
        die1 = 1+ randomNums.nextInt(6);  //REMEMBER: 1+ bc starting index is 0.
        die2 = 1+ randomNums.nextInt(6);

        int sum = die1 + die2;

        //display rolls

        System.out.printf("Player rolled %d + %d = %d\n", die1, die2, sum);

        return sum; //returns sum of dice
    }

}
