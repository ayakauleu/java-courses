package lesson12;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Homework2 {

    public static final int N = 100000;

    public static void main(String[] args) {

        File resourcesDirectory = new File("resources");
        Path path = Paths.get("resources", "numbers.txt");
        File file = path.toFile();

        writeRandom(file);

        List<Integer> list = new ArrayList<>();
        readToList(file, list);

        Collections.sort(list);
        writeFromList(file, list);

    }

    private static void writeRandom(File file) {
        try (DataOutputStream dataOutput = new DataOutputStream(new FileOutputStream(file))) {
            boolean created = file.createNewFile();
            Random rand = new Random();
            for (int i = 0; i < N; i++) {
                int n = rand.nextInt(5000) + 1;
                dataOutput.writeInt(n);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readToList(File file, List<Integer> list) {
        try (DataInputStream dataInput = new DataInputStream(new FileInputStream(file))) {
            while (dataInput.available() > 0) {
                list.add(dataInput.readInt());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeFromList(File file, List<Integer> list) {
        try (DataOutputStream dataOutput = new DataOutputStream(new FileOutputStream(file))) {
            for (Integer n : list) {
                dataOutput.writeInt(n);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
