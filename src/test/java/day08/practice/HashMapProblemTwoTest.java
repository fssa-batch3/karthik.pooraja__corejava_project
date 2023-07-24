package day08.practice;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;
public class HashMapProblemTwoTest {

    @Test
    public void testCreateDepartmentAndEmployeesMap() {
        List<String> inputLines = Arrays.asList(
                "HR, John",
                "IT, Alice",
                "HR, Bob",
                "IT, Carol"
        );

        Map<String, List<String>> expectedMap = new HashMap<>();
        expectedMap.put("HR", Arrays.asList("John", "Bob"));
        expectedMap.put("IT", Arrays.asList("Alice", "Carol"));

        Map<String, List<String>> result = HashMapProblemTwo.createDepartmentAndEmployeesMap(inputLines);

        assertEquals(expectedMap, result);
    }

}
