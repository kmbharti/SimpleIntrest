import java.util.HashMap;

public class BasicHashMapExample {
    public static void main(String[] args) {
        // Creating a HashMap
        HashMap<String, Integer> populationMap = new HashMap<>();

        // Adding key-value pairs
        populationMap.put("USA", 328_000_000);
        populationMap.put("China", 1_393_000_000);
        populationMap.put("India", 1_366_000_000);

        // Accessing a value by key
        System.out.println("Population of China: " + populationMap.get("China"));
}
}