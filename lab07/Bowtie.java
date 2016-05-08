//Lela Lerner
//3/11/16
//while loops and breaks

import java.util.*;

public class Bowtie{
    public static void main (String[] args) {
        while(true){
            int nStars = 11;
            Scanner myScanner = new Scanner(System.in);
            System.out.println("Enter an odd number between 3-33: ");
            while (!myScanner.hasNextInt()){
                myScanner.next();
                System.out.println("Error: Please enter an integer.");
            }
            while(true){
                nStars = myScanner.nextInt();
                if ((nStars%2) == 0){
                    System.out.println("Enter an odd number");
                }
                else if (nStars<3 || nStars>33){
                    System.out.println("Enter: number must be between 3 and 33");
                }
                else
                {
                    break;
                }
            }
                
            int top = (nStars/2);
            int bottom = (nStars/2)+1;
           
            int i = 0;    
            while(i<top){
                int k = 0;
                while(k < (i + 1)){
                    System.out.print(" ");
                    k++;
                }
                int j = 0;
                while(j < (nStars - (i*2))){
                    System.out.print("*");
                    j++;
                }
                System.out.println(" ");
                i++;
            }    
            
            i = 0;    
            while(i<bottom){
                int k = 0;
                while(k < (bottom - i)){
                    System.out.print(" ");
                    k++;
                }
                int j = 0;
                while(j < (i*2 + 1)){
                    System.out.print("*");
                    j++;
                }
                System.out.println(" ");
                i++;
            }   
        
                
            for ( i = 0; i < top; i++){
                for (int k = 0; k < i+1; k++){
                System.out.print(" ");
                }
                for (int j = 0; j < (nStars - (i*2)); j++){
                System.out.print("*");
                }
            System.out.println(" ");
            }
            
            for ( i = 0; i < bottom; i++){
                for (int k = 0; k < bottom-i; k++){
                System.out.print(" ");
                }
                for (int j=0; j < (i*2+1); j++){
                System.out.print("*");
                }
                
            System.out.println(" ");
            }
           
             i = 0;    
            do{
                int k = 0;
                do{
                    System.out.print(" ");
                    k++;
                }while(k < (i + 1));
                int j = 0;
                do{
                    System.out.print("*");
                    j++;
                }while(j < (nStars - (i*2)));
            System.out.println(" ");
            i++;
            }
            while(i<top);
            
            //Nested do - while loop to print bottom of bowtie
            i = 0;    
            do{
                int k = 0;
                do{
                    System.out.print(" ");
                    k++;
                }
                while(k < (bottom - i));
                int j = 0;
                do{
                    System.out.print("*");
                    j++;
                }
                while(j < (i*2 + 1));
            System.out.println(" ");
            i++;
            }
            while(i<bottom);
            Scanner repeat = new Scanner(System.in);
            System.out.print("Continue by entering in Y or y: ");
            String doOver = repeat.nextLine();
            if (!doOver.equals("Y") && !doOver.equals("y")){
                break;
            }
            }
        }
    }



/*public class Bowtie {
    public static void main (String[] args){
        int nStars = 9;
        int nLine = nStars;
        int counter = 0;
        int i;//number of lines
        int j;//number of stars within line
        int k;
        
        for (i=0; i<nStars; i++){//controls number of lines printed
            if (i <= 4){
            for (k=0; k<i; k++){
                System.out.print(" ");
            }
            for (j=0; j<nStars-(2*i);j++){//controls what goes on within lines, how many stars on each line
                System.out.print("*");
            }
            System.out.println();//change line
            }
            if (i >= 5){
            for (k=0; k<(8-i); k++){
                System.out.print(" ");
            }
            for (j=0; j<1+ 2*(i-4);j++){//controls what goes on within lines, how many stars on each line
                System.out.print("*");
            }
            System.out.println();
            }
        }



    }
}
        
        
        
        
        
        
     //user input
     //do while loop
        
       /* Scanner myScanner = new Scanner ( System.in );
    //    System.out.println("Enter length:");
//        int length;
    
    while (! myScanner.hasNextInt()){
        System.out.println ("Error: length must be an integer");
        myScanner.next();//clears bad imput
    }
    
    length = myScanner.nextInt();
        */
        
