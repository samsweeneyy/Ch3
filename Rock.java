

// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class Rock
{
    public static void main(String[] args)
    {
        String personPlay;    //User's play -- "R", "P", or "S"
        String computerPlay = "";  //Computer's play -- "R", "P", or "S"
        int computerInt;      //Randomly generated number used to determine
                              //computer's play
        Random generator = new Random();
        Scanner scan = new Scanner(System.in);
        //Get player's play -- note that this is stored as a string
        //Make player's play uppercase for ease of comparison
        computerInt = generator.nextInt(2) + 1;//Generate computer's play (0,1,2)
        if (computerInt == 0) {
            computerPlay = "R";
        }//Translate computer's randomly generated play to string
        if (computerInt == 1) {
            computerPlay = "P";
        }
        if (computerInt == 2) {
            computerPlay = "S";
        }//Print computer's play
        System.out.print ("Your Move (R, P, or S): ");
        personPlay = scan.next();
        System.out.println();
        System.out.println("Computer's move: " + computerPlay);
        if (computerPlay.equals("R") && personPlay.equals("P")) {
            System.out.println ("You win!");
        }
         if (computerPlay.equals("R") && personPlay.equals("S")) {
            System.out.println ("You lose!");
        }
        if (computerPlay.equals("R") && personPlay.equals("R")) {
            System.out.println ("It's a draw!");
        }
        if (computerPlay.equals("P") && personPlay.equals("S")) {
            System.out.println ("You win!");
        }
        if (computerPlay.equals("P") && personPlay.equals("R")) {
            System.out.println ("You lose!");
        }
        if (computerPlay.equals("P") && personPlay.equals("P")) { 
            System.out.println ("It's a draw!");
        }
        if (computerPlay.equals("S") && personPlay.equals("R")) {
            System.out.println ("You win!");
        }
        if (computerPlay.equals("S") && personPlay.equals("P")) {
            System.out.println ("You lose!");
        }
        if (computerPlay.equals("S") && personPlay.equals("S")) { 
            System.out.println ("It's a draw!");
        }
    }
}
    
//See who won.
    
    
