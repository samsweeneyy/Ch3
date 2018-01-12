/**
 * Write a description of class ChargeAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.text.NumberFormat;
 
public class ChargeAccount
{
   public static void main (String[] args)
   {
           double previousBalance;  
           double additionalCharges;             
           double interest;          
           double newBalance;
           double minimumPayment = 0; 
 
           Scanner scan = new Scanner(System.in);
 
           System.out.print ("Enter the previous balance: $");
           previousBalance = scan.nextDouble();
           System.out.print ("Enter additional charges: ");
           additionalCharges = scan.nextDouble(); 
           interest = (additionalCharges + previousBalance) * .02;           
           NumberFormat money = NumberFormat.getCurrencyInstance();
           System.out.println("Interest: " + money.format(interest));
           
           newBalance = additionalCharges + previousBalance + interest;
           if (newBalance <= 50.0) {
               minimumPayment = newBalance;
            }
           if (newBalance >= 50.0 && newBalance <= 300.0) {
               minimumPayment = 50.0;
            } 
           if (newBalance >= 300.0) {
               minimumPayment = newBalance * .2;
            }
            
           System.out.println();
           System.out.println("New Balance: " + money.format(newBalance));
           System.out.println();
           System.out.println("Minimum Payment:          " + money.format(minimumPayment));
           System.out.println();
        }
}