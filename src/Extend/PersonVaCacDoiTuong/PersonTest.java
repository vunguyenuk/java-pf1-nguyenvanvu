package Extend.PersonVaCacDoiTuong;

public class PersonTest {
    public static void main(String[] args) {
        Student student = new Student("VuNguyen", "32 Bau nang 7, Da Nang", "IT software", 3, 12000000);
        System.out.println(student);

        Staff staff = new Staff("KhanhNguyen", "8 Nguyen Thong", "Havard", 2.5);
        System.out.println(staff);
    }
}
