//Lela Lerner
//3/11/16
//while, for, do-while loops

import java.util.Scanner; //import to allow user imput

public class Twisty {
    public static void main (String[] args){
        Scanner myScanner = new Scanner ( System.in );
        boolean run = true;
        System.out.println("Enter length:");
        int length = 0;
        int counter = 0;
            while (run = true){ //makes sure while loop runs as long as input is true
                if (!myScanner.hasNextInt()){
                    System.out.println ("Error: enter an integer");
                    System.out.println("Enter length:");
                }
                else if (myScanner.hasNextInt()){//else if sets parameter for if statement
                length = myScanner.nextInt();//don't forget parenthesis
                if (length <= 0 || length > 80){
                    System.out.println ("Error: enter an integer between 0 and 80");
                    System.out.println("Enter length:");
                    continue;//continues if statement
                }
                run = false;
                break;
                }
            }
        System.out.println("Enter width:");
        int width = 0;
            while (run = true){
                if (!myScanner.hasNextInt()){
                    System.out.println ("Error: enter an integer");
                    System.out.println("Enter width:");
                }
                else if (myScanner.hasNextInt()){
                width = myScanner.nextInt();//don't forget parenthesis
                if (width <= 0 || width >=length){
                    System.out.println ("Error: enter an integer between 0 and 80");
                    System.out.println("Enter width:");
                    continue;//continues if statement
                }
                run = false;
                break;
            }
            }
        // meet with Evan to figure out quicker way to do this (Strings?)
       double xNum = length/width;
        int k;
        int i, j;
        for (i = 0; i < width; i ++){ //determines which line you are writing on
        for(k = 0; k < (xNum + 1); k++){ //determines which character each 'X' will start with
            if(k%2 != 0){
                if (k == xNum){
                    for (j = 0; j < (length % width); j++){
                        if (j == i){
                            System.out.print ("\\");
                        }
                        else if (j == (width - i) - 1){
                            System.out.print ("#");
                        }
                        else{
                            System.out.print (" ");
                        }
                    }
                }
                else{
                    for (j = 0; j < width; j++){ //determines which character is written
                        if (j == i){
                            System.out.print ("\\");
                        }
                        else if (j == (width - i) - 1){
                            System.out.print ("#");
                        }
                        else{
                            System.out.print (" ");
                        }
                    }
                }
            }
            else{
                if (k == xNum){
                    for (j = 0; j < (length % width); j++){
                        if (j == i){
                            System.out.print ("\\");
                        }
                        else if (j == (width - i) - 1){
                            System.out.print ("#");
                        }
                        else{
                            System.out.print (" ");
                        }
                    }
                    
                }
                else{
                    for (j = 0; j < width; j++){
                        if (j==i){
                            System.out.print ("#");
                        }
                        else if (j == (width - i) - 1){
                            System.out.print ("/");
                        }
                        else{
                            System.out.print (" ");
                        }
                    }
                }
                }
        }
        System.out.println ("");
    }
    }
}

    