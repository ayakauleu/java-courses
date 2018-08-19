package regexp;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LogParser {

    public static void main(String[] args) {
        String content = readFrom("resources\\courses\\log.txt", "Windows-1251");
        LogCollection logs = new LogCollection();
        logs.fillFromString(content);

        writeTo("resources\\courses\\intervals.txt", logs.outFile1(), "Windows-1251");
        writeTo("resources\\courses\\stats.txt", logs.outFile2(), "Windows-1251");
    }

    public static String readFrom(String path, String charsetName) {
        String res = "";
        try {
            byte[] bytes = Files.readAllBytes(Paths.get(path));
            res = new String(bytes, charsetName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return res;
    }

    public static void writeTo(String path, String content, String charsetName) {
        try {
            Files.write(Paths.get(path), content.getBytes(charsetName));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
