//Lela Lerner
//4/8/16
//Array Practice

import java.util.*;//* inputs everything

public class Arrays {
    public static void main (String[] args){
        Random randomGenerator = new Random();//picks random number
        int randomName = 5+randomGenerator.nextInt(5);//sets perimeters starting at 5, up to at most 10
        
        String[] students;
        students = new String[randomName];//pointer not a variable- refers to location
        
        Scanner myScanner = new Scanner ( System.in );//user input
        System.out.println("Enter " + randomName + "students' names");
        for(int counter = 0; counter < students.length; counter++){//students.length checks length of array and runs that number
            students[counter] = myScanner.next();//.next gets Strings, assumes good input
        }
        
        Random randomGradeAmount = new Random();
        
        int[] midterm;
        midterm = new int[randomName];
        for(int counter = 0; counter < midterm.length; counter++){//students.length checks length of array and runs that number
            int randomGrade = randomGradeAmount.nextInt(101);
            midterm[counter] = randomGrade;//assigning number to index ID by array
        }
        
        for(int counter = 0; counter < midterm.length; counter++){
            System.out.println(students[counter] + "received a score of " + midterm[counter] + "on the midterm");//counter goes inside brackets
    }
}
}