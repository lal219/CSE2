//Lela Lerner
//02/05/2016
//CSE 002-111 lab02: Arithmetic Calculations
//
// first compile the program
//       javac Cyclometer.java

// the program should 
//      print the number of minutes for each trip
//      print the number of counts for each trip
//      print the distance of each trip in miles
//      print the distance for the two trips combined

//
public class Cyclometer {
    	// main method required for every Java program
   	public static void main(String[] args) {
	   	int secsTrip1=480;  // variable stores value in secs for Trip1
       	int secsTrip2=3220;  // variable stores value in secs for Trip2
		int countsTrip1=1561;  // variable stores value in counts (rotations) for Trip1
		int countsTrip2=9037; // variable stores value in counts (rotations) for Trip2
		double wheelDiameter=27.0;  // variable stores value for rotation diameter
  	    
  	    
  	    double PI=3.14159; // 
  	    int feetPerMile=5280;  // variable stores value of feet per mile
  	    int inchesPerFoot=12;   // variable stores value of inches per foot (for conversion?)
    	int secondsPerMinute=60;  // variable stores value of seconds per minute (for conversion?)
	    double distanceTrip1, distanceTrip2,totalDistance;  //
	    
	    System.out.println("Trip 1 took "+
       	     (secsTrip1/secondsPerMinute)+" minutes and had "+
       	      countsTrip1+" counts.");
	       System.out.println("Trip 2 took "+
       	     (secsTrip2/secondsPerMinute)+" minutes and had "+
       	      countsTrip2+" counts.");
        // preforms arithmetic and conversion for values
		// calculating combined distance of Trip1 and Trip2
		//
	distanceTrip1=countsTrip1*wheelDiameter*PI;
    	// Above gives distance in inches
    	//(for each count, a rotation of the wheel travels the diameter in inches times PI)
	distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles
	distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
	totalDistance=distanceTrip1+distanceTrip2;
	//Print out the output data.
           System.out.println("Trip 1 was "+distanceTrip1+" miles");
	System.out.println("Trip 2 was "+distanceTrip2+" miles");
	System.out.println("The total distance was "+totalDistance+" miles");
	}  //end of main method   
} //end of class
