//Lela Lerner
//cse02 hw03 Pyramid
//2/13/16

import java.util.Scanner;//import is always first step

public class Pyramid {
    public static void main (String[] args){
        Scanner myScanner = new Scanner ( System.in );
        System.out.println("The square side of the pyramid is (imput length)" );
        double pyramidSquare = myScanner.nextDouble();//accepts user imput
        System.out.println("The height of the pyramid is (imput height ");
        double pyramidHeight = myScanner.nextDouble();
        double pyramidVolume = (((pyramidSquare * pyramidSquare) * pyramidHeight)/3);//calculates pyramid volume
        
        System.out.println ("The volume inside the pyrammid is " + pyramidVolume);
    }
}