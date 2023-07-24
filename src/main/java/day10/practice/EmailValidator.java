package day10.practice;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class InvalidEmailException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8105491977357554060L;

	
	public InvalidEmailException(String exception) {
		super(exception);
	}

	public InvalidEmailException(Throwable throwable) {
		super(throwable);
	}

	public InvalidEmailException(String exception, Throwable throwable) {
		super(exception, throwable);
	}
}

class EmailExceptionDemo {
	public static boolean isValidEmail(String emailId) throws InvalidEmailException {
		// TODO Write your logic valid returns true else throw the above exception
		// Also create the user defined exception mentioned in throws
		if(emailId==null) {
			throw new InvalidEmailException("The email cannot be null");
		}
		
//		String emailId = "suryafreshworks.com";
		
		// Below is a Regex by RFC standard RFC 5322
		String regex = "^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$";

//		Boolean isMatch = matcher.matches();
		Boolean isMatch = Pattern.matches(regex, emailId);

		if (!isMatch) {
		throw new InvalidEmailException("The email is invalid");
		} 
		
		return true;
		
	}
}
public class EmailValidator {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your email");
	String email=scan.nextLine();
	try {
		EmailExceptionDemo.isValidEmail(email);
	} catch (InvalidEmailException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}