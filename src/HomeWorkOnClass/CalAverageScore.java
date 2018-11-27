package HomeWorkOnClass;

import java.util.Scanner;

public class CalAverageScore {
    public static void main(String[] args){
        int Average = 0;

        System.out.println("Nhap vao diem cac mon hoc: ");

        Scanner read = new Scanner(System.in);
        int diemLy = read.nextInt();
        int diemHoa = read.nextInt();
        int diemSinh = read.nextInt();

        System.out.println("Diem mon Ly la: " + diemLy);
        System.out.println("Diem mon Hoa la: " + diemHoa);
        System.out.println("Diem mon Sinh la: " + diemSinh);

        Average = Math.abs(diemLy + diemHoa + diemSinh)/3;

        System.out.println("In diem trung binh cong: " + Average);


    }
}
