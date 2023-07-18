package day07.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Task {
	private int id;
	private String name;
	private LocalDate deadline;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public Task(int id, String name, LocalDate deadline) {
		super();
		this.id = id;
		this.name = name;
		this.deadline = deadline;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDeadline() {
		return deadline;
	}
	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}
	
}
public class DuplicateTaskRemover {

	public static void main(String[] args) {
        List<String> result = DuplicateRemover.arrayList();
		
		HashSet<Integer> value =DuplicateRemover.UniqueOne(result);
		
		System.out.println(value);

	}

	public static List<Integer> arrayList() {
		List<Integer> integer = new ArrayList<>();
		integer.add(1);
		integer.add(2);
		integer.add(3);
		integer.add(3);
		integer.add(4);
		integer.add(4);
		integer.add(5);

		return integer;
	}

	public static HashSet<Integer> UniqueOne(List<Integer> integer) {
		
		HashSet<Integer> value= new HashSet<>(integer);
		
		return value;

	}

	}

}
