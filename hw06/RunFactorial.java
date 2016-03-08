//Lela Lerner
//3/7/16
//while loop, calculating factorials

import java.util.Scanner;
 
public class RunFactorial{
   public static void main(String args[]){
      int integer;
      int numFactors = 1;
      int factorial = 1;
 
      System.out.println("Please enter an integer that is between 9 and 16:");
      Scanner myScanner = new Scanner(System.in);
 
      integer = myScanner.nextInt();
 
    if (integer >= 9 && integer <= 16 ){
        while (numFactors <= integer){
        factorial = numFactors * factorial;
        numFactors++;//increases numbFactor by 1
        }
        System.out.println("Input accepted:"+ integer + "! = " + factorial);
    }
    else{
        System.out.println("Invalid input, enter again!");
        }
   }
}