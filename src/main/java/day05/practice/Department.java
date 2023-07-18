package day05.practice;


class Department {
	String deptName;
	int deptId;
	
	public Department(String deptName, int deptId) {
		this.deptName = deptName;
		this.deptId = deptId;
	}
	
	public String getDetails() {
		return (this.deptName + "\n" + "Department Id: " + this.deptId );
	}
	
}
