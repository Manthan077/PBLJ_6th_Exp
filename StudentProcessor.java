import java.util.*;
import java.util.stream.Collectors;

class Student {
    String name;
    double marks;

    Student(String name, double marks) {
        this.name = name;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return name + " | Marks: " + marks;
    }
}

public class StudentProcessor {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("Manthan", 80),
                new Student("Vivek", 70),
                new Student("Harsh", 90),
                new Student("Ansh", 60)
        );

        List<String> topStudents = students.stream()
                .filter(s -> s.marks > 75)
                .sorted((s1, s2) -> Double.compare(s2.marks, s1.marks))
                .map(s -> s.name)
                .collect(Collectors.toList());

        System.out.println("Students scoring above 75% (sorted by marks):");
        topStudents.forEach(System.out::println);
    }
}
