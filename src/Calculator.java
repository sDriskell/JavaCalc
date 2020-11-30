//Project: Create a full-fledged calculator

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner  scan = new Scanner(System.in);
		String   firstNumber;
		String   secondNumber;
		String   arth;
		char     keepGoing;
		double   total = 0;
		IsNumeric isNum = new IsNumeric();
		do {
			do {
				System.out.print("Enter 1st number: ");
				firstNumber = scan.nextLine();
				System.out.print("Enter 2nd number: ");
				secondNumber = scan.nextLine();
			} while (isNum.isNumeric(firstNumber) == false &&
					isNum.isNumeric(secondNumber) == false);
	
			System.out.println("+, -, *, or / : ");
			arth = scan.nextLine();
			if (arth.contains("+")) {
				total = Double.parseDouble(firstNumber) + Double.parseDouble(secondNumber);
			}
			else if (arth.contains("-")) {
				total = Double.parseDouble(firstNumber) - Double.parseDouble(secondNumber);
			}
			else if (arth.contains("*")) {
				total = Double.parseDouble(firstNumber) * Double.parseDouble(secondNumber);
			}
			else if (arth.contains("/")) {
				total = Double.parseDouble(firstNumber) / Double.parseDouble(secondNumber);
			}
			else {
				System.out.println("Incorrect symbol.");
			}
			
			try {
				System.out.println("Total: " + total);
			} catch (Exception e) {
				System.out.println("One or more component not valid.");
			}
			
			System.out.print("Another computation ([y]es)?: ");
			keepGoing = scan.nextLine().toLowerCase().charAt(0);
		} while (keepGoing == 'y');
		scan.close();
	}
}
