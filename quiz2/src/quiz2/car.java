package quiz2;
import java.util.Scanner;

public class car{
	double CarCost;
	double DownPayment;
	int LengthOfLoan;
	double InterestRate;

	public car(double car_price, double down_payment, int loan_length, double interest) {
		this.CarCost = car_price;
		this.DownPayment = down_payment;
		this.LengthOfLoan = loan_length;
		this.InterestRate = interest/100;

	}

	public double ip() {
		double temp = (this.InterestRate/12)* this.CarCost;
		temp = temp/(1-Math.pow((1+(this.InterestRate/12)), - this.LengthOfLoan));
		return (this.LengthOfLoan * temp) - this.CarCost;
	}

	public double payment() {
		double temp = (this.InterestRate/12)* this.CarCost;
		temp = temp/(1-Math.pow((1+(this.InterestRate/12)), - this.LengthOfLoan));
		return temp;
	}
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

		System.out.println("Enter the length of loan:" );
		LengthOfLoan = input.nextInt();

		System.out.println("Enter interest rate for loan");
		InterestRate = input.nextDouble();
		input.close();

		car class1 = new car (CarCost, DownPayment, LengthOfLoan, InterestRate);
		double mP = class1.payment();
		System.out.println(String.format("Monthly car payment is: $" + "%.2f", mP));

		double fip = class1.ip();
		System.out.println( String.format( "Over the course of %d months, you will have paid $%.2f in interest.", LengthOfLoan, fip ) );


	}
}
