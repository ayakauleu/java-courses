package lesson10;

import java.util.HashMap;
import java.util.Map;

public class DistinctWords {

    private static void count(String text, Map<String, Integer> distincts) {
        String[] words = text.split(" ");
        for (String word : words) {
            distincts.put(word, distincts.getOrDefault(word, 0) + 1);
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> distincts = new HashMap<>();
        count("hjkhj jk hjk hjk hjk hjk hjk hjk hj ghj ghj fgh", distincts);
        System.out.println(distincts);
    }
}
