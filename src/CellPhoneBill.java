/*
 * Modified on 1/31/2013
 * 
 * ULID: Rkhickm
 * Course: IT 168
 * Lecture Section: 4
 * Instructor: Professor Matsuda
 * Lab section: 5
 * Instructor: Professor Erickson
 */

/**
 * Gets the user's: fixed monthly fee, the number of free minutes included in the plan, the actual number of minutes used by the user,
 * and the per-minute fee applied for phone call minutes over the free minutes. Then calculates and displays: the user's additional 
 * minute charge, additional tax fees, and lastly their total cell phone charges for the month. 
 * 
 * &author Ryan Hickman
 * 
 */

import java.util.Scanner;					//Needed for the scanner class

public class CellPhoneBill 
{
	public static void main (String [] args)
	{
		double monthlyFee;										//The user's monthly cell phone bill fee		
		double freeMinutes;										//The number of free minutes the user has
		double minutesUsed;										//The number of minutes the user has used
		double overageCharge;									//The fee charged per minute used past the user's free minutes
		double FUSC = 0.04;										//Creates a variable named "FUSC" and declares it = 4%
		double state = 0.03;									//Creates a variable named "state" and declares it = 3%
		double FUSCTotal;										//The user's total FUSC charge, which is based on FUSC * totalCharges
		double stateTotal;										//The user's total state charge, which is based on State * totalCharges
		double additionalMinCharge;								//The variable used to calculate overage charges, which is based on the overage minutes * the overage charge per minute
		double overageMins;										//Holds a variable
		double totalCharges;									//The user's total cell phone bill before taxes are added
		double overallTotal;									//The user's overall total cell phone bill for the month
		
		
		//Crates a scanner input to read input
		Scanner keyboard= new Scanner(System.in);
		
		//Gets the user's monthly cell phone bill amount
		System.out.print("Please enter the amount of your monthly fee: ");
		monthlyFee = keyboard.nextDouble();
		
		//Gets the user's free minutes that are included in their plan
		System.out.print("Please enter the number of free minutes included in your plan: ");
		freeMinutes = keyboard.nextDouble();
		
		//Gets the user's actual minutes used for the month
		System.out.print("Please enter the number of actual minutes used: ");
		minutesUsed = keyboard.nextDouble();
		
		//Gets the user's fee for every addtional minute used over the number of minutes included in the plan
		System.out.print("Please enter the fee for additional minutes over the " + freeMinutes + " limit: ");
		overageCharge = keyboard.nextDouble();
		
		overageMins = minutesUsed - freeMinutes;				//Calculates the difference between minutes used and minutes provided for the month
		additionalMinCharge = overageMins * overageCharge;		//Calculates the monthly overage charges the user has based on overage minutes 
		totalCharges = monthlyFee + additionalMinCharge;		//Calculates the user's total monthly charges before taxes
		FUSCTotal = FUSC * totalCharges;						//Calculates the total FUSC taxes the user has for the month
		stateTotal = state * totalCharges;						//Calculates the total state taxes the user has for the month
		overallTotal = FUSCTotal + stateTotal + totalCharges;	//Calculates the overall total cell phone bill the user owes for the month
		
		
		//Displays the user's additional minute charge for the month; the charge for overage minutes 
		System.out.printf("Additional minutes charge: $" + additionalMinCharge);
		
		//Displays the word "additional fees" and the user's FUSC fee and state fee for the month on separate lines and indented
		System.out.print("\nAdditional fees;" + "\n\tFUSC fee:   $" + FUSCTotal + "\n\tState fees: $" + stateTotal);
		
		//Displays the user's total monthly cell phone charge
		System.out.print("\nTotal cell phone charges: $" + overallTotal);
		
		
		
		
		
		
	}

}
