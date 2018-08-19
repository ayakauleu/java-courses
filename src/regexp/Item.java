package regexp;

public class Item {
    private String title;
    private String start;
    private String end;
    private Type type;

    public Item(String start, String end, String title) {
        this.start = start;
        this.end = end;
        this.title = title;
        if (title.equals("Упражнения") || title.equals("Решения") || title.equals("Перерыв") || title.equals("Обеденный перерыв")) {
            type = Type.INTERVAL;
        } else {
            type = Type.LECTURE;
        }
    }

    public String getLog() {
        return start + "-" + end + " " + title;
    }

    public String getTitle() {
        return title;
    }

    public Type getType() {
        return type;
    }

    public int getStartMinutes() {
        return Integer.valueOf(start.substring(0, 2)) * 60 + Integer.valueOf(start.substring(3, 5));
    }

    public int getEndMinutes() {
        return Integer.valueOf(end.substring(0, 2)) * 60 + Integer.valueOf(end.substring(3, 5));
    }

    public int getTime() {
        return getEndMinutes() - getStartMinutes();
    }
}
