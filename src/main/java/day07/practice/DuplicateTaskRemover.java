package day07.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

class Task {
    private int id;
    private String name;
    private LocalDate deadline;

    public Task(int id, String name, LocalDate deadline) {
        this.id = id;
        this.name = name;
        this.deadline = deadline;
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

	public LocalDate getDeadline() {
		return deadline;
	}

	public void setDeadline(LocalDate deadline) {
		this.deadline = deadline;
	}

	@Override
	public String toString() {
		return "Task [id=" + id + ", name=" + name + ", deadline=" + deadline + "]";
	}
}

public class DuplicateTaskRemover {

    public static void main(String[] args) {
        List<Task> taskList = taskAddition();
        HashSet<Task> uniqueTasks = UniqueOne(taskList);

        System.out.println("Unique Tasks:");
        for (Task task : uniqueTasks) {
            System.out.println(task);
        }
    }

    public static List<Task> taskAddition() {
        ArrayList<Task> taskList = new ArrayList<>();
        taskList.add(new Task(1, "Task 1", LocalDate.of(2023, 7, 15)));
        taskList.add(new Task(2, "Task 2", LocalDate.of(2023, 7, 16)));
        taskList.add(new Task(1, "Task 1", LocalDate.of(2023, 7, 15)));
        taskList.add(new Task(4, "Task 3", LocalDate.of(2023, 7, 17)));
        taskList.add(new Task(1, "Task 1", LocalDate.of(2023, 7, 15)));
        return taskList;
    }

    public static HashSet<Task> UniqueOne(List<Task> taskList) {
        return new HashSet<>(taskList);
    }
}
