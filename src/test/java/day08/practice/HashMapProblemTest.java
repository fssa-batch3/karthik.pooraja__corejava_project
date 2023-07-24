package day08.practice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class HashMapProblemTest {

    @Test
    public void testEmptyInput() {
        List<String> input = Arrays.asList();
        Map<String, Integer> result = HashMapProblem.Hashmap(input);
        Assertions.assertTrue(result.isEmpty());
    }

    @Test
    public void testSingleString() {
        List<String> input = Arrays.asList("hello");
        Map<String, Integer> result = HashMapProblem.Hashmap(input);
        Assertions.assertEquals(1, result.size());
        Assertions.assertEquals(1, result.get("hello"));
    }

    @Test
    public void testRepeatedString() {
        List<String> input = Arrays.asList("hello", "world", "hello", "world");
        Map<String, Integer> result = HashMapProblem.Hashmap(input);
        Assertions.assertEquals(2, result.size());
        Assertions.assertEquals(2, result.get("hello"));
        Assertions.assertEquals(2, result.get("world"));
    }
}
