package day07.practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateRemover {

	public static void main(String[] args) {
		List<Integer> result = DuplicateRemover.arrayList();
		
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
