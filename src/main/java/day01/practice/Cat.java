package day01.practice;

public class Cat {
    // Attributes
    private int age;
    private String color;
    private String speak;

    // Constructor
    public Cat(int age, String color,String speak) {
        this.age = age;
        this.color = color;
        this.speak=speak;
    }

    // Getters and setters
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setSpeak(String speak) {
    	this.speak = speak;
    }
   
	public String getSpeak() {
        return speak;
    }

    // Main method to create Dog objects
    public static void main(String[] args) {
        // Create two Dog objects
        Cat cat1 = new Cat(4, "White","meow!");
        Cat cat2 = new Cat(3, "black","meow!");

        // Print the attributes of each Dog
        System.out.println("Cat 1:");
        System.out.println("Age: " + cat1.getAge());
        System.out.println("Color: " + cat1.getColor());
				System.out.println("Speaks: "+ cat1.getSpeak());

        System.out.println("Cat 2:");
        System.out.println("Age Dots: " + cat2.getAge());
        System.out.println("Color: " + cat2.getColor());
		System.out.println("Speaks: " + cat1.getSpeak());
    }
}
