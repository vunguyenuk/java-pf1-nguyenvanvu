package AccessModifier;

public class StudentManagerTest {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        studentManager.displayAll();

        Student vu = new Student("Vu", 18);
        studentManager.add(vu);
        System.out.println("added " + vu);
        System.out.println("show information: " + vu.getInfomation());
        studentManager.displayAll();

        Student dung = new Student("Dung", 23);
        studentManager.add(dung);
        System.out.println("added" + dung);
        System.out.println("show information: " + dung.getInfomation());
        studentManager.displayAll();
    }
}
