package AccessModifier;

/*
The array size is fixed to 100.
* Improved it to automatically increase the array size by creating
* a bigger new array and copy the contents of the current array into it.

Executes the dropStudent method. Determine which method is static.

Add a new method called clear ()
to remove all students from the course.
Determine which method is static.

Write a test program as follows:
Create a course, in addition to three students,
Eliminate a student, and show the students in the course.
* */

public class Course {
    private String name;
    private static String[] students = new String[100];
    private static int studentsCount = 0;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String[] getStudents() {
        return students;
    }

    public int getStudentsCount() {
        return studentsCount;
    }

    public void addStudent(String name) {
        if (studentsCount == students.length) {
            String[] newStudents = new String[students.length * 2];
            for (int i = 0; i < studentsCount; i++) {
                newStudents[i] = students[i];
            }
            students = newStudents;
        }
        students[studentsCount] = name;
        studentsCount++;
    }

    public static void dropStudents(String name) {
        boolean found = false;
        for (int i = 0; i < studentsCount; i++) {
            if (students[i] == name) {
                found = true;
                for (int j = i + 1; j < studentsCount; j++) {
                    students[j - 1] = students[j];
                }
                studentsCount--;
                System.out.println("Student \"" + name + "\" removed!");
            }
        }
        if (!found) {
            System.out.println("Student \"" + name + "\" not existed in list, nothing removed!");
        }
    }

    public void printStudents() {
        for (int i = 0; i <= studentsCount -1; i++) {
            System.out.println("Name student: " +  students[i]);
        }
    }
}