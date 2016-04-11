//Lela Lerner
//02/19/16
//cse02 lab04 Card Generator
//if statements, switch statements  and in using Math.random(), a random number generator

import java.util.*;//* = wildcard, will import everything from util

public class CardGenerator {
    public static void main(String[] args){
        int card = (int)(Math.random() * 52 + 1);// generates number between 1 and 52, run everything on right then cast to int
                                                // 1 is start number, 52 is number of possible results(?)
        int numSuit = card%13;
        String suit = new String();//String assigning suit
        if (1<= card && card <= 13){
            suit = "Diamonds";
        }
        else if (14<= card && card <= 26){
            suit = "Clubs";
        }
        else if (27<= card && card <= 39){
            suit = "Hearts";
        }
        else if (40<= card && card <= 52){
            suit = "Spades";
        }
    
    switch (numSuit){
            case 1:
            System.out.println("You picked the Ace of " + suit);
            break;
            case 2:
            System.out.println("You picked the two of " + suit);
            break;
            case 3:
            System.out.println("You picked the three of " + suit);
            break;
            case 4:
            System.out.println("You picked the four of " + suit);
            break;
            case 5:
            System.out.println("You picked the five of " + suit);
            break;
            case 6:
            System.out.println("You picked the six of " + suit);
            break;
            case 7:
            System.out.println("You picked the seven of " + suit);
            break;
            case 8:
            System.out.println("You picked the eight of " + suit);
            break;
            case 9:
            System.out.println("You picked the nine of " + suit);
            break;
            case 10:
            System.out.println("You picked the ten of "+  suit);
            break;
            case 11:
            System.out.println("You picked the Jack of " + suit);
            break;
            case 12:
            System.out.println("You picked the Queen of " + suit);
            break;
            case 13:
            System.out.println("You picked the King of " + suit);
            break;
            }
       }
}
