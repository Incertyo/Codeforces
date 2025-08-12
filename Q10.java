import java.util.*;
// Interface defining the contract for enrollment system (loose coupling)
interface EnrollmentSystem {
    void enrollStudent(Student student, Course course);
    void dropStudent(Student student, Course course);
    void displayEnrollments();
}

// Student class with high cohesion (manages student details only)
class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Course class with high cohesion (manages course details only)
class Course {
    private String code, name;

    public Course(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getName() {
        return name;
    }
}


// Enrollment class implementing EnrollmentSystem to manage student enrollments
class Enrollment implements EnrollmentSystem {
    private Map<Course, List<Student>> enrollments = new HashMap<>();

    // Enroll a student in a course
    public void enrollStudent(Student s, Course c) {
        enrollments.computeIfAbsent(c, k -> new ArrayList<>()).add(s);
        System.out.println(s.getName() + " enrolled in " + c.getName());
    }

    // Remove a student from a course
    public void dropStudent(Student s, Course c) {
        enrollments.getOrDefault(c, new ArrayList<>()).remove(s);
        System.out.println(s.getName() + " dropped from " + c.getName());
    }

    // Display all enrollments
    public void displayEnrollments() {
        enrollments.forEach((c, sList) -> {
            System.out.println("Course: " + c.getName());
            sList.forEach(s -> System.out.println(" - " + s.getName()));
        });
    }
}

// Main class to demonstrate the enrollment system functionality
public class Q10 {
    public static void main(String[] args) {
        EnrollmentSystem es = new Enrollment(); // Loose coupling via interface

        // Creating students
        Student s1 = new Student(1, "Alice"), s2 = new Student(2, "Bob");

        // Creating a course
        Course c1 = new Course("CS101", "Computer Science");

        // Enrolling students
        es.enrollStudent(s1, c1);
        es.enrollStudent(s2, c1);

        // Displaying enrollments
        es.displayEnrollments();

        // Dropping a student and re-displaying enrollments
        es.dropStudent(s1, c1);
        es.displayEnrollments();
    }
}
