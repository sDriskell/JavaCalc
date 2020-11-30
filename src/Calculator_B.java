
import java.util.Scanner;

public class Calculator_B {
	public static void main(String[] args) {
		Scanner   scan = new Scanner(System.in);
		IsNumeric isNum = new IsNumeric();
		DoMath    math = new DoMath();
		String    userInput;
		String    delims = "[ +/*-]+";
		String[]  tokens;
		double    total = 0.0;
		boolean   goodInput = false;
		
		do {
			System.out.print("Enter your equation: ");
			userInput = scan.nextLine();
			tokens = userInput.split(delims);
			
			for (int i = 0; i < tokens.length; i++) {
				if (isNum.isNumeric(tokens[i]) == true)
					goodInput = true;
				else {
					System.out.println("Bad input.");
					goodInput = false;
				}
			}
		} while(goodInput == false);
		
		if (userInput.contains("+"))
			total = math.addition(tokens);
		else if (userInput.contains("-"))
			total = math.subtraction(tokens);
		else if (userInput.contains("*"))
			total = math.multiplication(tokens);
		else if (userInput.contains("/"))
			total = math.division(tokens);
		else
			System.out.println("Error.");
		
		System.out.println(total);
		scan.close();
	}
}
