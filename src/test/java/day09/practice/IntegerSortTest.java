package day09.practice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayInputStream;
import java.util.Arrays;
import java.util.List;

public class IntegerSortTest {

    @Test
    public void testIntegerSort() {
        // Simulate user input: 5, 2, 8, -100 (to exit loop)
        String input = "2\n5\n8\n-100";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        List<Integer> result = ArrayListCreation.Arraylist();
        Assertions.assertEquals(Arrays.asList(2, 5, 8), result);
    }
}
