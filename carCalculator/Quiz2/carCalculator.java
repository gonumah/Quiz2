import java.util.Scanner;
public class carCalculator {

	double totalPriceOfACar;
	double downPayment;
	int lengthOfLoan;
	double interestRateForLoan;

	
	public Calculator(double totalPriceOfACar, double downPayment, int lengthOfLoan, double interestRateForLoan) {
		this.totalPriceOfACar = totalPriceOfACar;
		this.downPayment = downPayment;
		this.lengthOfLoan = lengthOfLoan;
		this.interestRateForLoan = interestRateForLoan;
		
	}


	public Calculator() {
		input();
	}
	
	public void input() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Total price of car: ");
		totalPriceOfACar = input.nextDouble();
		
		System.out.print("Down payment: ");
		downPayment = input.nextDouble();
		
		System.out.print("Length of loan (in months): ");
		lengthOfLoan = input.nextInt();
		
		System.out.print("Interest rate for loan: ");
		interestRateForLoan = input.nextDouble();
	}
	
	
	public double monthlyCarPayment() {
		double result = ((totalPriceOfACar-downPayment)*(interestRateForLoan/1200))/(1- Math.pow((1+interestRateForLoan/1200),-(lengthOfLoan/12)*12));
		return result;
	}
	
	public double totalSpentOnInterestOverTheTermOfTheLoan(){
		double result = (monthlyCarPayment()*lengthOfLoan - totalPriceOfACar);
		return result;
	}
		
	
}

