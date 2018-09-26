package AccessModifier;

/*
* Kích thước mảng được cố định là 100.
* Cải thiện nó để tự động tăng kích thước mảng bằng cách tạo
* một mảng mới lớn hơn và sao chép nội dung của mảng hiện tại vào nó.

Thực thi phương thức dropStudent. Xác định phương thức này là static.

Thêm một phương thức mới có tên clear()
để loại bỏ tất cả sinh viên khỏi khóa học.
Xác định phương thức này là static.

Viết một chương trình kiểm tra như sau:
tạo một khóa học, thêm vào ba sinh viên,
loại bỏ một sinh viên, và hiển thị các sinh viên trong khóa học.
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