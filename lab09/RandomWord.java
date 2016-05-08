//Lela Lerner
//3/25/16
//Lab 09: Methods Practice

import java.util.*;

public class RandomWord{
public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        Random sentGenerator = new Random ();
        while(true){
            System.out.println("The " + randomAdjective() + " " + randomSubject() + " " + randomVerb() + " " + "over the " + randomAdjective() + " " + randomObject() + ".");
            System.out.println("Would you like to repeat? Y = 1, N = 0");
            while (!myScanner.hasNextInt()){
                    myScanner.next();
                    System.out.println("Error: enter an int");
            }
            int doOver = myScanner.nextInt();
            
            if (doOver == 0){
                break;
            }
            else if (doOver<0 || doOver>1){
                System.out.println("Error: invalid input");
                break;
            }
           
        }
}
public static String randomAdjective(){
    Random sentGenerator = new Random();
    int randomInt = sentGenerator.nextInt(10);//
switch(randomInt){
            case 0:
            return("funny");
            case 1:
            return("beautiful");
            case 2:
            return("smart");
            case 3:
            return("crusty");
            case 4:
            return("quick");
            case 5:
            return("little");
            case 6:
            return("wise");
            case 7:
            return("glamourous");
            case 8:
            return("old");
            case 9:
            return("green");
            default:
            return("dumb");
}
}

public static String randomSubject (){
    Random sentGenerator = new Random();
    int randomInt = sentGenerator.nextInt(10);//
switch(randomInt){
            case 0:
            return("Lela");
            case 1:
            return("Rachel");
            case 2:
            return("professor");
            case 3:
            return("Dog");
            case 4:
            return("Cat");
            case 5:
            return("Panda");
            case 6:
            return("Kobe Bryant");
            case 7:
            return("student");
            case 8:
            return("president");
            case 9:
            return("Leonardo DiCaprio");
            default:
            return("Calvin");
}
}
public static String randomVerb (){
    Random sentGenerator = new Random();
    int randomInt = sentGenerator.nextInt(10);//
switch(randomInt){
            case 0:
            return("jumped");
            case 1:
            return("crawled");
            case 2:
            return("boogie");
            case 3:
            return("ran");
            case 4:
            return("forgot");
            case 5:
            return("coded");
            case 6:
            return("typed");
            case 7:
            return("looked");
            case 8:
            return("remembered");
            case 9:
            return("memorized");
            default:
            return("lost");
}
}
public static String randomObject (){
    Random sentGenerator = new Random();
    int randomInt = sentGenerator.nextInt(10);//
switch(randomInt){
            case 0:
            return("bagel");
            case 1:
            return("basketball");
            case 2:
            return("homework");
            case 3:
            return("exam");
            case 4:
            return("iPhone");
            case 5:
            return("computer");
            case 6:
            return("magazine");
            case 7:
            return("bridge");
            case 8:
            return("slipper");
            case 9:
            return("sock");
            default:
            return("mug");
}
}
}
