package day02.practice;

public class Logger {
	public static void debug (String msg) {
		System.out.println("DEBUG: " + msg);
	}
	public static void info (String msg) {
		// TODO complete this code using the above template
		System.out.println("INFO: " + msg);
	}
	
	public static void error (String msg) {
		// TODO complete this code using the above template
		System.out.println("ERROR: " + msg);
	}
	
	public static void debug (int num) {
		// TODO Complete this code
		System.out.println("DEBUG: " + num);
	}
	
	// Similarly write overloaded methods for error and info.
	public static void info (int num) {
		// TODO complete this code using the above template
		System.out.println("INFO: " + num);
	}
	
	public static void error (int num) {
		// TODO complete this code using the above template
		System.out.println("ERROR: " + num);
	}
	public void main(String[] args) {
		Logger.debug("The error in the code");
		Logger.info("This code is to familarize in method overloading concept");
		Logger.error("It can be debugged");
		Logger.debug(10);
		Logger.info(20);
		Logger.error(40);
	
	}
}
