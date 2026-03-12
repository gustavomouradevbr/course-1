package entites;

public class Calculator {
	
	// Static members

		
		public static final double PI = 3.14159; // The final serves to indicate thart that variable is a constant.
		
		
		public static double circumference(double radius) {
		return 2.0 * PI * radius;
		}
		
		public static double volume(double radius) {
		return 4.0 * PI * radius * radius * radius / 3.0;
		}
		

		
		
	}
