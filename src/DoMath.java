
public class DoMath {
	public double multiplication(String[] userInput) {
		return Double.parseDouble(userInput[0])
				* Double.parseDouble(userInput[1]);
	}
	public double division(String[] userInput) {
		return Double.parseDouble(userInput[0])
				/ Double.parseDouble(userInput[1]);
	}
	public double addition(String[] userInput) {
		return Double.parseDouble(userInput[0])
				+ Double.parseDouble(userInput[1]);
	}
	public double subtraction(String[] userInput) {
		return Double.parseDouble(userInput[0])
				- Double.parseDouble(userInput[1]);
	}
}
