import java.util.*;

public class Student {
    private String studentId;
    private String name;
    private String program;
    private int semester;
    private Map<Course, Integer> courses;

    public Student(String studentId, String name, String program, int semester) {
        this.studentId = studentId;
        this.name = name;
        this.program = program;
        this.semester = semester;
        this.courses = new HashMap<>();
    }

    public void registerCourse(Course course, int mark) {
        courses.put(course, mark);
    }

    public void printStudentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);
        System.out.println("Courses Registered:");
        for (Course course : courses.keySet()) {
            System.out.println(" - " + course.getName());
        }
    }

    public void printFailedCourses() {
        System.out.println("Courses with marks < 40:");
        for (Map.Entry<Course, Integer> entry : courses.entrySet()) {
            if (entry.getValue() < 40) {
                System.out.println(" - " + entry.getKey().getName() + ": " + entry.getValue());
            }
        }
    }
}