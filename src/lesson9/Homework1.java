package lesson9;

import java.util.*;

public class Homework1 {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<String>();
        Collections.addAll(strings, "123", "1234", "1234", "235");
        markLength4(strings);
        for (String st : strings) {
            System.out.print(st + " ");
        }
    }

    private static void markLength4(List<String> strings) {
        int i = 0;
        while (i < strings.size()) {
            if (strings.get(i).length() == 4) {
                strings.add(i, "****");
                i++;
            }
            i++;
        }
    }
}