package lesson9;

public class Student {
    private String lastName;
    private String firstName;
    private int age;
    private float averageMark;

    public Student(String lastName, String firstName, int age, float averageMark) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.averageMark = averageMark;
    }

    public int getAge() {
        return age;
    }

    public float getAverageMark() {
        return averageMark;
    }

    public String getFullName() {
        return lastName + " " + firstName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                ", averageMark=" + averageMark +
                '}';
    }
}
