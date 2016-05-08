//Lela Lerner
//4/22/16
//Creating 2D Ragged Arrays (think spreadsheet)

import java.util.*;//imports everything

public class Ragged {
    public static void main(String[] args){
        Scanner myScanner = new Scanner (System.in);
        System.out.println("Enter size of main array:");
        
        int mainArray = myScanner.nextInt();
        int [][] mainLength = new int[mainArray][];
        
        System.out.println("Ragged Unsorted:");
            for (int i=0; i<mainArray;i++){
                int randomInt = (int)(Math.random() * 20);
                mainLength[i] = new int [randomInt];//fills in i
                for (int j=0; j<mainLength[i].length; j++){
                    int rand = (int)(Math.random()*20);
                    mainLength[i][j] = rand;
                    System.out.print(mainLength[i][j]+" ");
                }
                System.out.println("");
            }
        
        
        for (int i = 0; i < mainLength.length; i++) {
            for (int k=0; k < mainLength[i].length; k++){
               int min = k; 
            for (int j = k + 1; j < mainLength.length; j++) {
                if (mainLength[j][k] < mainLength[j][min]) {
                min = j;
            }
            }
        
            int temp = mainLength[i][k];
            mainLength[i][k] = mainLength[i][min];
            mainLength[i][min] = temp;
        }
        }
         System.out.println("Ragged Sorted:");
            for (int i=0; i<mainLength.length;i++){
                for (int j=0; j<mainLength[i].length; j++){
                    System.out.print(mainLength[i][j]+" ");
                }
                System.out.println("");
            }
        
        // Then, your program will create a random-sized member array 
        //(of length less than that of the main array) and assign one 
        //to each element of the main array.  Now you have an empty 
        //ragged array could look like the array below. 
    }
}