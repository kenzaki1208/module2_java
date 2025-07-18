package week6.inheritance.friday.exercise.using_map_to_count_words_in_array;

import java.util.Map;
import java.util.TreeMap;

public class WordCountWithTreeMap {
    public static void main(String[] args) {
        String input = "Java is great and Java is powerful. Java can be fun !";

        input = input.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        String[] words = input.split("\\s+");

        TreeMap<String, Integer> wordMap = new TreeMap<>();

        for (String word : words) {
            if (wordMap.containsKey(word)) {
                wordMap.put(word, wordMap.get(word) + 1);
            } else {
                wordMap.put(word, 1);
            }
        }

        System.out.println("Tần suất từ: ");
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
