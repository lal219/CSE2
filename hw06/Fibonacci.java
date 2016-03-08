//Lela Lerner
//3/6/16
//Fibonacci sequence, practice writing loops

import java.util.Scanner;

public class Fibonacci {
    public static void main (String[] args){
        Scanner myScanner = new Scanner (System.in);
        int a;
        int b;
        int length = 0; 
        System.out.println ("Enter three positive integers");
   
        while (! myScanner.hasNextInt()){
        System.out.println ("Error: input must be an integer");
        myScanner.next();//clears bad input
    }
    
    a = myScanner.nextInt();
    
        while (a < 0){
        System.out.println ("Error: enter a positive number");
        a = myScanner.nextInt();
        
    }
       while (! myScanner.hasNextInt()){
        System.out.println ("Error: input must be an integer");
        myScanner.next();//clears bad input
    }
    
    b = myScanner.nextInt();
    
        while (b < 0){
        System.out.println ("Error: enter a positive number");
        b = myScanner.nextInt();
    }
    
       while (! myScanner.hasNextInt()){
        System.out.println ("Error: input must be an integer");
        myScanner.next();//clears bad input
    }
    
    length = myScanner.nextInt();

        while (length < 0){
        System.out.println ("Error: enter a positive number");
        length = myScanner.nextInt();
        
    }
    
    int counter = 0;
    int c = a + b;
    System.out.print (a + ", " + b);
    while (counter < length-2){
        a = b; //swapping values, "assignment of b to a"
        b = c;
        c = a + b;
        if(counter + 1 == length){
        System.out.print (c);
        }
        else{
        System.out.print (", " + c);
        }
        counter++;
    }
    
    System.out.print(".");
    } 
}