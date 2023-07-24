package day09.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class ArrayListCreation{
public static List<Integer> Arraylist() {
    ArrayList arr = new ArrayList();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your number");
    while (sc.hasNext()) {
        int number = sc.nextInt();
        if (number==-100) {
            break;
        }
        arr.add(number);
    }
    return arr;
}
}
public class IntegerSort {
	public static void main(String[] args) {
        List<Integer> input = ArrayListCreation.Arraylist();
        Collections.sort(input);
        System.out.println(input);
    }
   
}
