//Lela Lerner
//3/4/16
//practice using loops, print out a twist

import java.util.Scanner; //import to allow user imput

public class TwistGenerator {
    public static void main (String[] args){
        Scanner myScanner = new Scanner ( System.in );
        System.out.println("Enter length:");
        int length;
    
    while (! myScanner.hasNextInt()){
        System.out.println ("Error: length must be an integer");
        myScanner.next();//clears bad imput
    }
    
    length = myScanner.nextInt();
    
    while (length <= 0){
        System.out.println ("Error: enter a positive number");
        length = myScanner.nextInt();//redefine so it won't run bad value infinitely, if you don't change condition in while loop: runs infinitely
    }
    
    //don't need to define
    String twist1 = "\\";//escape key, Java decided that forward slash is special
    String twist2 = " ";
    String twist3 = "/";
    String twist4 = "X";
    
    String result1 = "";//need so that you can change and print on one line
    String result2 = "";
    
    while (length > 0){
        if (length >= 3){
        result1 = result1 + (twist1 + twist2 + twist3);
        result2 = result2 + (twist2 + twist4 + twist2);
        length = length-3;
        }
        else if (length == 2){
            result1 = result1 + (twist1 + twist2);
            result2 = result2 + (twist2 + twist4);
            length = length - 2; 
        }
        else if (length ==1){
            result1 = result1 + (twist1);
            result2 = result2 + (twist2);
            length = length - 1; 
        }
}
    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result1);
}
}