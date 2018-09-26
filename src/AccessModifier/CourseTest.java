package AccessModifier;

public class CourseTest {
    public static void main(String[] args) {
        Course course = new Course("Java");

        course.addStudent("Vu");

        course.addStudent("Van");

        course.addStudent("Dung");

        course.dropStudents("Van");

        course.printStudents();
    }
}
