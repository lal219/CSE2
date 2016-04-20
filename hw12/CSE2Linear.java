//Lela Lerner
//4/19/16
//search using arrays

import java.util.*;//imports everything

public class CSE2Linear {
    public static void main (String[] args){
        int [] grades = new int [15];
        Scanner myScanner = new Scanner ( System.in );//user input
        System.out.println("Enter " + grades.length + " grades (lowest to highest):");
        for (int i = 0; i < grades.length; i++){
            while (! myScanner.hasNextInt()){//make sure input is int first
                    System.out.println ("Error: input must be an integer");
                    myScanner.next();//clears bad input, think of kinda like counter/loop
                }
            grades[i] = myScanner.nextInt();//fills aray with user input
               
                while (grades[i] < 0 || grades[i] > 100){
                    System.out.println ("Error: grade must be between 0 and 100");
                    grades[i]= myScanner.nextInt();
                }
        /*    while (i >= 1 && grades[i-1]<= grades[i]){ //check that int is not greater than or equal to the last int  
            System.out.println ("Error: grade must be larger than last value entered");
            grades[i] = myScanner.nextInt();
            }
        */
            System.out.print(grades[i] + " ");
        }
        System.out.println();
        System.out.println("Enter a grade to search for:");
        int lookFor = myScanner.nextInt();
        for (int i = 0; i < grades.length; i++){
            if (lookFor==grades[i])
            System.out.println(lookFor + " was found!");
            if (lookFor!=grades[i]){
            System.out.println(lookFor + " was not found.");
        }
    }
    
      /*  Arrays.sort(grades);
        //System.out.println(Arrays.toInt(grades));
        // in reverse order
            for (int i = array.length - 1; i >= 0; i--)
            System.out.print(array[i] + " ");
            System.out.println();

        }
    
        public static int Linear(){
        int temp = 0; //holds place for int while we swap values around
        int min = grades[0];
        for (int i = 1; i < grades.length; i++){
            if (grades[i] < min){
                min = grades[i];
                temp = i;
             }
             return i;
        }
        }
        */
    
                
                /*
                Next, prompt the user to enter a grade to be searched for.
                Use linear search to find the entered grade. 
                Indicate if the grade was found or not,  
                print out the number of iterations used. 
*/
      
}
}
    
        
                