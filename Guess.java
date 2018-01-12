// ****************************************************************
//   Guess.java
//
//   Play a game where the user guesses a number from 1 to 10
//              
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
 
public class Guess
{
    public static void main(String[] args)
        {
          int numToGuess;           //Number the user tries to guess
          int guess;                //The user's guess
 
          Scanner scan = new Scanner(System.in);
          Random generator = new Random();
 
          computerInt = generator.nextInt(9) + 1;//randomly generate the  number to guess
 
          System.out.println("Guess a number");
          numPowersOf2 = scan.nextInt();//print message asking user to enter a guess
 
          numToGuess = 1;//read in guess 
          
 
          //print message saying guess is right
        }
}