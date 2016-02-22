//Lela Lerner
//02/22/15
//Homework 04 Converting Decimals to Hexadecimals


import java.util.Scanner; //import to allow user imput

public class ToHex {
    public static void main (String[] args){
        Scanner myScanner = new Scanner ( System.in );
        System.out.println("Please enter three numbers representing RBG values:");
        
        int R = 0, B = 0, G = 0;
        if(myScanner.hasNextInt()){
            R = myScanner.nextInt();
            
            if(R > 255 || R < 0){
                System.out.println("Sorry, you must enter a number less than 255 or greater than 0");
                return;
            }
        }
        else{
            System.out.println("Sorry, your input must consist of integers.");
            return;
        }
        
        if(myScanner.hasNextInt()){
            B = myScanner.nextInt();
            
            if(B > 255 || B < 0){
                System.out.println("Sorry, you must enter a number less than 255 or greater than 0");
                return;
            }
        }
         else{
            System.out.println("Sorry, your input must consist of integers.");
            return;
        }
        
         if(myScanner.hasNextInt()){
            G = myScanner.nextInt();
            
            if(G > 255 || G < 0){
                System.out.println("Sorry, you must enter a number less than 255 or greater than 0");
                return;
            }
        }
         else{
            System.out.println("Sorry, your input must consist of integers.");
            return;
        }
    
        int remainderR = (R%16);//gives remainder after user imput is divided by 16
        int remainderB = (B%16);
        int remainderG = (G%16);
        
        int fullR = (R/16);//gives number of times 16 goes into user imput decimal, declared as int to truncate remainder
        int fullB = (B/16);
        int fullG = (G/16);
        
        System.out.println(fullR + " " + fullG + " " + fullB);
        String hexR1;//declares strings so they can be assigned a value during switch statements
        String hexB1;
        String hexG1;
        
        switch(fullR){
            case 10:
            hexR1 = "A";
            break;
            case 11:
            hexR1 = "B";
            break;
            case 12:
            hexR1 = "C";
            break;
            case 13:
            hexR1 = "D";
            break;
            case 14:
            hexR1 = "E";
            break;
            case 15:
            hexR1 = "F";
            break;
            
            default:
            hexR1 = "" + fullR;
        }
        
        switch(remainderR){
            case 10:
            hexR1 = hexR1 + "A";
            break;
            case 11:
            hexR1 = hexR1 + "B";
            break;
            case 12:
            hexR1 = hexR1 + "C";
            break;
            case 13:
            hexR1 = hexR1 + "D";
            break;
            case 14:
            hexR1 = hexR1 + "E";
            break;
            case 15:
            hexR1 = hexR1 + "F";
            break;
            default:
            hexR1 = "" + hexR1 + remainderR;
        }
        
        switch(fullB){
            case 10:
            hexB1 = "A";
            break;
            case 11:
            hexB1 = "B";
            break;
            case 12:
            hexB1 = "C";
            break;
            case 13:
            hexB1 = "D";
            break;
            case 14:
            hexB1 = "E";
            break;
            case 15:
            hexB1 = "F";
            break;
            default:
            hexB1 = "" + fullB;
        }
        
        switch(remainderB){
            case 10:
            hexB1 = hexB1 + "A";
            break;
            case 11:
            hexB1 = hexB1 + "B";
            break;
            case 12:
            hexB1 = hexB1 + "C";
            break;
            case 13:
            hexB1 = hexB1 + "D";
            break;
            case 14:
            hexB1 = hexB1 + "E";
            break;
            case 15:
            hexB1 = hexB1 + "F";
            break;
            default:
            hexB1 = "" + hexB1 + remainderB;
        }
        
        switch(fullG){
            case 10:
            hexG1 = "A";
            break;
            case 11:
            hexG1 = "B";
            break;
            case 12:
            hexG1 = "C";
            break;
            case 13:
            hexG1 = "D";
            break;
            case 14:
            hexG1 = "E";
            break;
            case 15:
            hexG1 = "F";
            break;
            default:
            hexG1 = "" + fullG;
        }
        
        switch(remainderG){
            case 10:
            hexG1 = hexG1 + "A";
            break;
            case 11:
            hexG1 = hexG1 + "B";
            break;
            case 12:
            hexG1 = hexG1 + "C";
            break;
            case 13:
            hexG1 = hexG1 + "D";
            break;
            case 14:
            hexG1 = hexG1 + "E";
            break;
            case 15:
            hexG1 = hexG1 + "F";
            break;
            default:
            hexG1 = "" + hexG1 + remainderG;
        }
        
        String hexRBG = (hexR1 + hexB1 + hexG1);//saves entire hexadecimal number into one String variable
        
        System.out.println("The decimal numbers R:" + (R) + " B:" + (B) + " G:" + (G) + " , is represented in hexidecimal as:" + (hexRBG));

    }
}