package day09.practice;

import java.time.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

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
}

class DeadlineComparator implements Comparator<Task> {
    public int compare(Task t1, Task t2) {
        return t1.getDeadline().compareTo(t2.getDeadline());
    }
}

public class DateSort {
    public static void main(String args[]) {
        ArrayList<Task> addTask = new ArrayList<Task>();
        addTask.add(new Task(3, "Coding", LocalDate.of(2022, 10, 22)));
        addTask.add(new Task(5, "Product Design", LocalDate.of(2022, 10, 1)));
        addTask.add(new Task(1, "Software Design", LocalDate.of(2022, 10, 7)));
        addTask.add(new Task(3, "Coding", LocalDate.of(2022, 10, 22)));

        System.out.println("Sorting by Date");

        Collections.sort(addTask, new DeadlineComparator());
        Iterator<Task> itr2 = addTask.iterator();
        while (itr2.hasNext()) {
            Task task = itr2.next();
            System.out.println(task.getId() + " " + task.getName() + " " + task.getDeadline());
        }
    }
}
