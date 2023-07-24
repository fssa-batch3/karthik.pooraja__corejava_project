package day11.practice;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ToDoTaskTest {
	
	@Test
	public void testValidTask() {
		
		try {
			String url = "error";
			String userName = "root";
			String passWord="Josh";
			DriverManager.getConnection(url, userName, passWord);
			Assertions.fail("Error should be thrown but it was not");
		}
		catch(SQLException ex) {
			Assertions.assertEquals("Connection is not created", ex.getMessage());
		}
		
	}
	
	
	@Test
	public void testInvalidTask() {
		
		try {
			Task t1 = null;
			ToDoTask.createTask(t1);
		}catch(DAOException e) {
			Assertions.assertEquals("Tasks object cannot be null", e.getMessage());
		}
		
	}

}
