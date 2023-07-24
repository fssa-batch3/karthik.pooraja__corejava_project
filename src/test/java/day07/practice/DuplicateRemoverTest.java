package day07.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DuplicateRemoverTest {
	




	@Test
	public void testValidArray() {
		
		ArrayList<Integer> arr = new ArrayList();
		arr.add(1);
		arr.add(2);
		arr.add(1);
		arr.add(4);
		arr.add(5);
		arr.add(7);
		arr.add(7);
		
		
		HashSet<Integer> uniqueArr = new HashSet<>(Arrays.asList(1, 2, 4, 5, 7));
        HashSet<Integer> result = DuplicateRemover.UniqueOne(arr);

        List<Integer> sortedUniqueArr = new ArrayList<>(uniqueArr);
        Collections.sort(sortedUniqueArr);

        List<Integer> sortedResult = new ArrayList<>(result);
        Collections.sort(sortedResult);

        Assertions.assertIterableEquals(sortedUniqueArr, sortedResult);

	}
	
	
	
}