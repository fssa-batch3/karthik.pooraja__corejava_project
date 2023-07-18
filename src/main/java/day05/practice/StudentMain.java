package day05.practice;


public class StudentMain {
	
	public static void main(String[] args) {
		
		Department stuDept = new Department("Computer Science", 1);
		
		Student student = new Student("Aravind", 3, stuDept);
		
		System.out.println(student);
	}

}
