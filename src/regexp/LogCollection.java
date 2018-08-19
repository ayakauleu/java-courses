package regexp;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogCollection {
    private List<List<Item>> logs = new ArrayList<>();

    public void addDay(List<Item> day) {
        logs.add(day);
    }

    public int daysCount() {
        return logs.size();
    }

    public void fillFromString(String st) {
        String regex = "(\\d{2}:\\d{2})\\W([а-яА-ЯёЁ ]+)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(st);
        String prevTime = "";
        String prevTitle = "";
        boolean needCreate = false;
        List<Item> day = new ArrayList<>();
        while (matcher.find()) {
            if (needCreate) {
                Item item = new Item(prevTime, matcher.group(1), prevTitle);
                day.add(item);
            }
            if (matcher.group(2).equals("Конец")) {
                addDay(day);
                day = new ArrayList<>();
                needCreate = false;
            } else {
                needCreate = true;
            }
            prevTime = matcher.group(1);
            prevTitle = matcher.group(2);
        }
    }

    private String outDayFile1(List<Item> day) {
        String st = "";
        for (Item item : day) {
            st = st + item.getLog() + "\n";
        }
        return st;
    }

    public String outFile1() {
        String st = "";
        for (List<Item> value : logs) {
            st = st + outDayFile1(value) + "\n";
        }
        return st;
    }

    private String outDayFile2(List<Item> day, int dayTime) {
        String st = "";
        int lectureTime = 0;
        int intervalTime = 0;

        for (Item item : day) {
            if (item.getType() == Type.LECTURE) {
                lectureTime = lectureTime + item.getTime();
            } else {
                intervalTime = intervalTime + item.getTime();
            }
        }
        st = st + "Лекции: " + lectureTime + " " + minutes(lectureTime) + " "
                + Math.round((float) lectureTime / dayTime * 100) + "%\n";
        st = st + "Другие отрезки времени: " + intervalTime + " " + minutes(intervalTime) + " "
                + Math.round((float) intervalTime / dayTime * 100) + "%\n";

        st = st + "Лекции:\n";
        for (Item item : day) {
            if (item.getType() == Type.LECTURE) {
                st = st + item.getTitle() + ": " + item.getTime() + " " + minutes(item.getTime()) + " "
                        + Math.round((float) item.getTime() / dayTime * 100) + "%\n";
            }
        }
        return st;
    }

    public String outFile2() {
        String st = "";
        for (List<Item> value : logs) {
            int dayTime = value.get(value.size() - 1).getEndMinutes() - value.get(0).getStartMinutes();
            st = st + outDayFile2(value, dayTime) + "\n";
        }
        return st;
    }

    public static String minutes(int number) {
        String res;
        int lastDigit = number % 10;
        int lastTwoDigits = number % 100;
        if ((5 <= lastDigit && lastDigit <= 9 || lastDigit == 0)
                || (11 <= lastTwoDigits && lastTwoDigits <= 19)) {
            res = "минут";
        } else if (2 <= lastDigit && lastDigit <= 4) {
            res = "минуты";
        } else {
            res = "минута";
        }
        return res;
    }

}
