//Lela Lerner
//3/22/15
//while, for, do-while loops

import java.util.Scanner; //import to allow user imput

public class Triangles {
    public static void main (String[] args){
        Scanner myScanner = new Scanner ( System.in );
    
    int triangle;
    
    System.out.println ("Enter an integer:");
        while (! myScanner.hasNextInt()){
        System.out.println ("Error: input must be an integer");
        myScanner.next();//clears bad imput
    }
    
    triangle = myScanner.nextInt();
    
    System.out.println ("Enter an integer:");
    while (triangle <= 5 || triangle >= 30){
        System.out.println ("Error: enter a number between 5 and 30");
        triangle = myScanner.nextInt();//redefine so it won't run bad value infinitely
    }
    
    //for loop
    for (int i = 1; i <= triangle; i++){
        for (int k = 0; k < i; k++){
            System.out.print(i);//don't do println!!!
        }
        System.out.println(""); //prints new line
    }
    for (int i = triangle; i >= 0; i--){
        for (int k = 0; k < i; k++){
            System.out.print(i);
    }
        System.out.println("");
    }
    
    //while
    int i = 1;
    while (i < triangle){
        int k = 0;
        while (k < i){
            System.out.print(i);
            k++;
            continue;
        }
        System.out.println("");//println because done printing number, need line
        i++;
    }
     while (i > 0){
        int k = 0;
        while (k < i){
            System.out.print(i);
            k++;
            continue;
        }
        System.out.println("");
        i--;
     }
        System.out.println ("messed up do while-- put work in comments for partial credit?");
     }
    
    //do-while
//    int i = 1;
//    int k = 0;
//    do{
//    do{
  //      do{
    //    System.out.print(i);
      //  i++;
        //while (i <= triangle);
//    }
//    System.out.println("");
//}
//    do{
//        do{
//        System.out.print(i);
//        k++;
//        while (k<i);
//    }
//    System.out.println("");
//}
// 
//  for (int i = 1; i <= triangle; i++){
//        for (int k = 0; k < i; k++){
//            System.out.print(i);//don't do println!!!
//        }
//        System.out.println(""); //prints new line
//    }
//    
// int i = triangle;
// int k = 0;
//    do{
//    do{
//        do{
//        System.out.print(i);
//        i--;
//        while (i >= 0);
//    }
//    System.out.println("");
//}
//    do{
//        do{
//        System.out.print(i);
//        k++;
 //       while (k<i);
 //   }
 //   System.out.println("");
 //   }
 //   }
//}

        
    }
