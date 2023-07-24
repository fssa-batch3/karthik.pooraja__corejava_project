package day10.practice;

import java.util.*;

class UserAlreadyExistsException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8105491977357554060L;

	// Calling each super constructors for each of the types
	public UserAlreadyExistsException(String msg) {
		super(msg);
	}

	public UserAlreadyExistsException(Throwable te) {
		super(te);
	}

	public UserAlreadyExistsException(String msg, Throwable te) {
		super(msg, te);
	}
}


class User {
	int id;
	String name;
	String emailId;
	public User(int id,String name,String emailId) {
		this.id=id;
		this.name=name;
		this.emailId=emailId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	
	
}
class UserValidator {
	static ArrayList<User> list = new ArrayList<User>();
	public static boolean register(User user) throws UserAlreadyExistsException {
		if (user == null) {
			throw new UserAlreadyExistsException("object cannot null");
		}
	
		for(User element:list) {
			if(element.emailId.equals(user.getEmailId())) {
				throw new UserAlreadyExistsException("User Already added");
			}
			
		}
	list.add(user);
		System.out.println("User added");
		return true;
		}
	
}
public class UserAlreadyExistsExceptionDemo {
	
	public static void main(String[] args) {
		User member1=new User(1, "Karthik", "karthik@gmail.com");
		User member2=new User(2, "joshua", "joshua@gmail.com");
		User member3=new User(1, "Karthik", "karthik@gmail.com");
		User member4=new User(2, "joshua", "joshua@gmail.com");
	boolean value=UserValidator.register(member1);
	boolean valueone=UserValidator.register(member2);
	boolean valuetwo=UserValidator.register(member3);
	boolean valuethree=UserValidator.register(member4);
	System.out.println(value);
	System.out.println(valueone);
	System.out.println(valuetwo);
	System.out.println(valuethree);
		
		
	}
	


}
