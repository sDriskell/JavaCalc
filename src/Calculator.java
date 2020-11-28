import java.util.Scanner;

public class Calculator {
	public static boolean isNumeric(String strNum) {
		// Create boolean check to ascertain if valid number.
		if (strNum == null) {
			return false;
		}
		try {
			double d = Double.parseDouble(strNum);
		} catch (NumberFormatException nfe) {
			return false;
		}
		return true;
	}
	public static void main(String[] args) {
		String firstNumber, secondNumber;
	
		Scanner scan = new Scanner(System.in);

		do {
			System.out.print("Enter 1st number: ");
			firstNumber = scan.nextLine();
			System.out.print("Enter 2nd number: ");
			secondNumber = scan.nextLine();
		} while (isNumeric(firstNumber) == false &&
				isNumeric(secondNumber) == false);

		try {
			System.out.println("Total: " + (Double.parseDouble(firstNumber) + Double.parseDouble(secondNumber)));
		} catch (Exception e) {
			System.out.println("One or more numbers not valid.");
		}
		scan.close();
	}
}
