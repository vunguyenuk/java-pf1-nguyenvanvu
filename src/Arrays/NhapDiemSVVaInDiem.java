package Arrays;


import java.util.Scanner;

public class NhapDiemSVVaInDiem {
    public static void main(String[] args) {
        int[] diemSinhVien = new int[3];

        for(int i = 0; i < diemSinhVien.length; i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap diem sinh vien thu " + i + ": ");
            diemSinhVien[i] = sc.nextInt();

        }
        for(int i = 0; i < diemSinhVien.length; i++ ){
            System.out.println("diem sinh vien thu " + i + " la: " + diemSinhVien[i]);
        }


    }
}
