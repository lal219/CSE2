//Lela Lerner
//4/15/16
//Search using arrays

import java.util.*;

public class Search {
    public static void main (String[] args){
    Random randomGenerator = new Random();
    
    int[] array1 = new int[50];
    int[] array2 = new int [50];
    int j = 0;
    int k = 49;
    
    for(j=0; j<array1.length; j++){
        array1[j]= randomGenerator.nextInt(100);
    }
    
    int max = array1[0];
    int min = array1[k];
    for(j=0; j < array1.length; j++) {
        if(max<array1[j]){
            max = array1[j];
        }
    }
    System.out.println("The max value in array1 is:" + max);

    for(; k > array1.length; k--) {
        if(min>array1[k]){ 
            min = array1[k];
        }
    }
    System.out.println("The min value in array1 is:" + min);
    
    array2[0]= randomGenerator.nextInt(100);
    for(int counter = 1; counter < 50;counter++){
        int randomNumber = randomGenerator.nextInt(1000);//returns positive number 
        array2[counter]=randomNumber + array2[counter-1];
    }
    System.out.println("The min value in array2 is: " + array2[0]);
    System.out.println("The max value in array2 is: " + array2[49]);
    
    Scanner myScanner = new Scanner(System.in);
    System.out.println ("Enter a number greater than 0:");
    int input = -1; 
    if (myScanner.hasNextInt()==true){
        input = myScanner.nextInt();
        if (input < 0){
            System.exit(1);//error code, call when you want to exit program
        }
    }
    else{
        System.exit(1);
    }
    int low = 0;
    int high = 49;
    int middle = 24;
    while(high >= low){
        middle = (high + low)/2;
        if (array2[middle] == input){
            System.out.println (input + " was found");
            break;
        }
        if (array2[middle] < input){
            low = middle + 1;
        }
        if (array2[middle] > input){
            high = middle - 1;
        }
        }
    
    if(high <= low && array2[middle]!= input){
        System.out.println (input + " was not found");
        if (input < array2[49]){
        System.out.println ("The number above the input is " + array2[low]);
        }
        else{
            System.out.println("Input in larger than max value so there is no value above");
        }
        if (input > array2[0]){
        System.out.println ("The number below the input is " + array2[high]);
        }
        else{
            System.out.println("Input in smaller than min value so there is no value below");
        }
    }
    }
}