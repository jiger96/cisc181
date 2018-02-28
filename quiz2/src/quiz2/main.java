package quiz2;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		java.util.Scanner input = new Scanner(System.in);

		double CarCost;
		double DownPayment;
		int LengthOfLoan;
		double InterestRate;

		System.out.println("Enter Total price of car (sticker price + taxes + extras):");
		CarCost = input.nextDouble();

		System.out.println("Enter DownPayment:");
		DownPayment = input.nextDouble();

		System.out.println("Enter the length of loan(in months):" );
		LengthOfLoan = input.nextInt();

		System.out.println("Enter interest rate for loan(not in percentage)");
		InterestRate = input.nextDouble();
		input.close();

		car class1 = new car (CarCost, DownPayment, LengthOfLoan, InterestRate); // creates values for car constructor 
		
		double mP = class1.payment();
		System.out.println(String.format("Monthly car payment is: $" + "%.2f", mP));

		double fip = class1.ip();
		System.out.println( String.format( "Over the course of %d months, you will have paid $%.2f in interest.", LengthOfLoan, fip ) );


	}


}
