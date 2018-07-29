package lesson9;

import java.util.*;

public class Homework2 {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Yakauleu", "Andrei", 40, 9),
                new Student("Petrov", "Pavel", 40, 8),
                new Student("Petrov", "Pavel", 30, 8),
                new Student("Sidorov", "Igor", 25, 6),
                new Student("Smirnov", "Igor", 25, 7)
        );

        System.out.println("Student that has max average mark is " + getMaxStudent(students) + "\n");

        print(students);
        students.sort(
                Comparator.comparing(Student::getFullName)
                        .thenComparing(Comparator.comparing(Student::getAge))
                        .thenComparing(Student::getAverageMark)
        );
        print(students);
    }

    private static Student getMaxStudent(List<Student> students) {
        Iterator<Student> iterator = students.iterator();
        Student maxStudent = students.get(0);
        float maxMark = 0;
        while (iterator.hasNext()) {
            Student next = iterator.next();
            if (next.getAverageMark() > maxMark) {
                maxMark = next.getAverageMark();
                maxStudent = next;
            }
        }
        return maxStudent;
    }

    private static void print(List<Student> Students) {
        for (Student student : Students) {
            System.out.println(student);
        }
        System.out.println();
    }
}



