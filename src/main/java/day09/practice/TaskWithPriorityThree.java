package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class TaskPriority {
    private int id;
    private String name;
    private LocalDate deadline;
    private int priority;

    public TaskPriority(int id, String name, LocalDate deadline, int priority) {
        this.id = id;
        this.name = name;
        this.deadline = deadline;
        this.priority = priority;
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

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}

class PriorityComparator implements Comparator<TaskPriority> {
    public int compare(TaskPriority t1, TaskPriority t2) {
        int deadlineComparison = t1.getDeadline().compareTo(t2.getDeadline());
        if (deadlineComparison == 0) {
            return Integer.compare(t1.getPriority(), t2.getPriority());
        } else {
            return deadlineComparison;
        }
    }
}

public class TaskWithPriorityThree {
    public static void main(String args[]) {
        ArrayList<TaskPriority> addTask = new ArrayList<TaskPriority>();
        addTask.add(new TaskPriority(3, "Coding", LocalDate.of(2022, 10, 22), 2));
        addTask.add(new TaskPriority(5, "Product Design", LocalDate.of(2022, 10, 1), 1));
         addTask.add(new TaskPriority(5, "Planning", LocalDate.of(2022, 10, 1), 2));
        addTask.add(new TaskPriority(1, "Software Design", LocalDate.of(2022, 10, 7), 3));
        addTask.add(new TaskPriority(3, "Coding", LocalDate.of(2022, 10, 22), 1));

        System.out.println("Sorting by combining both priority and deadline");

        Collections.sort(addTask, new PriorityComparator());
        Iterator<TaskPriority> itr2 = addTask.iterator();
        while (itr2.hasNext()) {
            TaskPriority task = itr2.next();
            System.out.println(task.getId() + " " + task.getName() + " " + task.getDeadline() + " " + task.getPriority());
        }
    }
}
