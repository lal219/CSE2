//Lela Lerner
//3/28/16
//overloading methods

import java.util.Scanner;//user input

public class Rectangularize{ //class

    public static void Rect (String forMain){//for main?
        for (int n=1; n < forMain.length(); n++){
            System.out.println(forMain);
        }
    }

    public static void Rect(int forMain){
        for (int n=0; n<forMain; n++){
            for (int m=0; m<forMain; m++){
                System.out.print("%");
            }
            System.out.println("");
        }
    }
 
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word or an integer");
        if (input.hasNextInt()){
             int intUser = input.nextInt();
             Rect(intUser);
        }
         
        else{
             String stringUser = input.next();
             Rect(stringUser);
        }
    }
}