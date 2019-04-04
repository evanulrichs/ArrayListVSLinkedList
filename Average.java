package data;

public class Average {
	
	static double added_total = 0;
	static double input_total = 0;
	static double average = 0;
	
	public static double average(double n) { // Finds average of all numbers inputed 
		
		added_total = added_total + n;
		
		input_total++;
		
		average = added_total / input_total;
		
		return average;
	}
	
	public static void average_clr() { // Resets variables
		added_total = 0;
		input_total = 0;
		average = 0;
	}
}
