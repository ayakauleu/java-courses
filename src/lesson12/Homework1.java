package lesson12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;

public class Homework1 {

    public static void main(String[] args) {
        Path path = Paths.get("resources", "oak.txt");
        File file = path.toFile();
        Map<Character, Integer> letters = new TreeMap<>();
        handleFile(file, letters);
        System.out.println(letters);
    }

    private static void handleFile(File file, Map<Character, Integer> letters) {
        try (InputStream in = new FileInputStream(file); Reader reader = new InputStreamReader(in, Charset.defaultCharset()); Reader buffer = new BufferedReader(reader)) {
            int r;
            while ((r = reader.read()) != -1) {
                char ch = (char) r;
                ch = Character.valueOf(ch).toString().toLowerCase().charAt(0);
                letters.put(ch, letters.getOrDefault(ch, 0) + 1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
