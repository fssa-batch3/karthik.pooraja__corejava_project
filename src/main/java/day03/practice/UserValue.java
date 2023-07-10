package day03.practice;

class User {
	 
    private String name;
    private String password;
    private String email;
    
    public User(){
    	
    }
 
    public User(String name, String password,String email) {
        this.name = name;
        this.password=password;
        this.email=email;
    }
    public String getName() {
    	return name;
    }
    public String getPassword() {
    	return password;
    }
    public String getEmail() {
    	return name;
    }
    
}
public class UserValue {
	 
    public static void main(String[] args) {
        User karthik = new User("Karthik", "Chemeng","chemeng0517@gmail.com");
        System.out.println("Hi "+karthik.getName()+". Your password is "+karthik.getPassword()+" and your email is "+karthik.getEmail());
        }
}
