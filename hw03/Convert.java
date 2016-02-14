//Lela Lerner
//cse02 hw03 Convert
//2/13/16

import java.util.Scanner;//import is always first step (before public class)

public class Convert {
    public static void main (String[] args){
        Scanner myScanner = new Scanner( System.in );
        System.out.println("Enter the distance in meters");
        double measurementMeters = myScanner.nextDouble();//accepts user imput
        double measurementInches = (measurementMeters * 39.3701);//converts user measurement from meters to inches
        
        System.out.println (measurementMeters + " meters is " + measurementInches + "inches");
        
    }
}