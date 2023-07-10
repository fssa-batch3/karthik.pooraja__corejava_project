package day02.practice;

class User {
	private int id;
	private String name;
	private String password;
	private String emailid;
	
	
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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmailid() {
		return emailid;
	}


	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}


	public static void main(String[] args) {
		User obj=new User();
		obj.setName("Karthik");
		obj.setPassword("Karthik");
		obj.setEmailid("karthik.pooraja@fssa.freshworks.com");
		obj.setId(14);
		System.out.println(obj.getId());
		System.out.println(obj.getName());
		System.out.println(obj.getEmailid());
		System.out.println(obj.getPassword());
	}

}
