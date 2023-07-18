package day08.practice;
import java.util.*;

public class HashMapProblem {
    public static void main(String[] args) {
        List<String> input = Arraylist();
        Map<String, Integer> answer = Hashmap(input);
        System.out.println(answer);
    }

    public static List<String> Arraylist() {
        List<String> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        while (sc.hasNext()) {
            String line = sc.nextLine().trim();
            if (line.equals("stop")) {
                break;
            }
            arr.add(line);
        }
        return arr;
    }

    public static Map<String, Integer> Hashmap(List<String> arr) {
        Map<String, Integer> counter = new HashMap<>();
        for (int i = 0; i < arr.size(); i++) {
            String element = arr.get(i).trim();
            if (!counter.containsKey(element)) {
                counter.put(element, 1);
            } else {
                int count = counter.get(element);
                count++;
                counter.put(element, count);
            }
        }
        return counter;
    }
}

