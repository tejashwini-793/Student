public class Main {
    public static void main(String[] args) {
        Course math = new Course("C101", "Mathematics");
        Course physics = new Course("C102", "Physics");

        Student student = new Student("S001", "Alice", "Computer Science", 2);
        student.registerCourse(math, 35);
        student.registerCourse(physics, 78);

        // 1. Retrieve student info
        student.printStudentInfo();

        // 2. Retrieve failed courses
        student.printFailedCourses();
    }
}