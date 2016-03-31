//Lela Lerner
//3/28/16
//methods

import java.util.*;//user input

public class Games{ //class
    public static void main (String[] args){ //main methods
        Scanner myScanner = new Scanner ( System.in );
        System.out.println("Welcome to Lela's game center:");
        System.out.println("Please write the name of the minigame you want to play: guessTheBox, spinTheWheel or scrambler!");
            String a = "guessTheBox", b = "spinTheWheel", c = "scrambler";
            String choice = myScanner.next();//game selection
            if (choice.equals(a)){//checks if strings are equal to each other
                System.out.println("Select box 1, 2 or 3");
                guessTheBox();//calls method, user imput is parameters
            }
            if (choice.equals(b)){//checks if strings are equal to each other
                System.out.println("Select red or black");
                System.out.println("Select an integer between 1 - 5");
                spinTheWheel();//calls method, user imput is parameters
            }
            
            if (choice.equals(c)){//checks if strings are equal to each other
                System.out.println("Enter a word");
                scrambler();//calls method, user imput is parameters
            }
            else{
                System.out.println("Sorry, Lela's arcade does not have that game");
                return;
            }
    }
    
    public static void guessTheBox(){
        Scanner myScanner = new Scanner ( System.in );
        if(! myScanner.hasNextInt()){ //checks if user input is int
            System.out.println("Sorry, you can only select box 1, 2 or 3");
            return;
        }
        int a = myScanner.nextInt();
        if (a < 1 || a > 3){
            System.out.println("Sorry, you can only select box 1, 2 or 3");
        }
        double winner = Math.random();
        int win;
        int input = myScanner.nextInt();
        if (winner < 0.1){
            win = 1;
        }
        else if (winner < 0.2){
            win = 2;
        }
        else{
            win = 3;
        }
        if (input == win){
            System.out.println ("Congrats! You have won an Easter basket");
        }
        else{
            System.out.println("Sorry, you did not win.");
        }
    }
   
//  public static void spinTheWheel(Scanner myScanner){
//       Scanner myScanner = new Scanner ( System.in );
//            Scanner myScanner = new Scanner ( System.in );
//          if (myScanner.hasNext()){
//                String color = myScanner.next();
//               int counter = 0;
//               color.toLowerCase();//makes all chars in string lowercase
//               if (color.equals("black")|| color.equals("red")){
//                   System.out.println("You picked: " + color);
//                }
//                if (! color.equals("black")|| ! color.equals("red")){
//                    System.out.println("Error: please select red or black");
//                }
//                Random spinColor = new Random();
//                int 
//                while ()
//                }
        
        
            //take in a string, call it strang using .next();
            //take in an int using the method
            //take strang and make either all caps or all lowercase
            // strang.toLowerCase()
            //if strang.equals("black")
            //use an if statement IN LOWER CASE
            //test string black or red input
            //generate 2 random numbers (1-2 or 1-5)
           // Random letterSwap = new Random();
        
            //    int halfWay = letterSwap.nextInt(length-1);
            // use f statements to fnd 
            //test if user input is same as random
            //print answer and random
        }
   }
   
    public static void scrambler(){
        Scanner myScanner = new Scanner ( System.in );
        if (myScanner.hasNext()){
            String word = myScanner.next();
            int length = word.length();//counts number of characters in word
            int counter = 0;
            String firstHalf = "";
            String secondHalf = "";
            //create the random object
            Random letterSwap = new Random();
            while (length*6 > counter){//determines how many times to scramble word
                int halfWay = letterSwap.nextInt(length-1);
                firstHalf = word.substring(0, halfWay);
                System.out.println("Here's haflway: " + halfWay);
                secondHalf = word.substring(halfWay+1, length);
                word = secondHalf+firstHalf;
                counter++;
            }
            System.out.println(word);
        }
    }

    
        


