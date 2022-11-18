package zyBooks;

public class TollCalculation {
	
	public double calcToll(int hour, boolean isMorning, boolean isWeekend) {
	      /* Type your code here. */    
		  if (hour < 6) {
	         return isMorning;
	      }
	      else if (hour < 10) {
	         return isMorning;
	      }
	      else if (hour < 18) {
	         return isMorning;
	      }
	      else {
	         tollAmount = 1.55;
	      }
	   }
	   
	  public static void main(String[] args) {
	       TollCalculation tollObj = new TollCalculation();
	       
	       // Test the three samples from the specification.
	       System.out.println(tollObj.calcToll(7, true, false));
	       System.out.println(tollObj.calcToll(1, false, false));
	       System.out.println(tollObj.calcToll(3, true, true));
	   }
	}
