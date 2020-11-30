
import java.util.Scanner;

public class Calculator_B {
	public static void main(String[] args) {
		String   testInput = "51 / 2";
		double   total = 0;
		String[] tokens = testInput.split(" ");
		
		for (int i = 0; i < tokens.length; i++)
			if (tokens[i].contains("+")){
				total = Double.parseDouble(tokens[i-1]) 
						+ Double.parseDouble(tokens[i+1]);
			} else if (tokens[i].contains("-")) {
				total = Double.parseDouble(tokens[i-1]) 
						- Double.parseDouble(tokens[i+1]);
			} else if (tokens[i].contains("*")) {
				total = Double.parseDouble(tokens[i-1]) 
						* Double.parseDouble(tokens[i+1]);
			} else if (tokens[i].contains("/"))
				total = Double.parseDouble(tokens[i-1]) 
						/ Double.parseDouble(tokens[i+1]);
		System.out.println(total);
	}
}
