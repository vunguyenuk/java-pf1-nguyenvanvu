package Arrays;

import java.util.Scanner;

public class SearchStudent {
    public static void main(String[] args) {
        String[] tenSinhVien = {"Vu", "Loc", "Hop", "Van"};

        String tenCanTim;
        Scanner write = new Scanner(System.in);
        System.out.println("Nhap ten sinh vien can tim: ");
        tenCanTim = write.nextLine();

        boolean tonTai = false;

        for(String ten : tenSinhVien) {
            if (ten.equals(tenCanTim)) {

                tonTai = true;
                System.out.println("Ten nay co trong danh sach va nam o vi tri thu: " + ten);
            }
        }
        if(!tonTai){
            System.out.println("khong co sinh vien " + tenCanTim + " nao duoc tim thay");
        }
    }
}
