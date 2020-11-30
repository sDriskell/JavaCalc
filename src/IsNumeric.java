
public class IsNumeric {
	public static boolean isNumeric(String strNum) { // Creator of function: baeldung
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
}
