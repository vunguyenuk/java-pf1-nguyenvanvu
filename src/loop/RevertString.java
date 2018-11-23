package loop;

import java.util.Scanner;

public class RevertString {
    public static void main(String[] args) {
        System.out.println("Nhap chuoi dao nguoc:");

        Scanner readStr = new Scanner(System.in);
        String str = readStr.nextLine();

        String[] timdaucach = str.split(" ");

        String chuyenDoiChuoi = "";

        for (int i = 0; i < timdaucach.length; i++)
        {
            String tukhoa = timdaucach[i];

            String daoNguocChuoi = "";

            for (int j = tukhoa.length()-1; j >= 0; j--)
            {
                daoNguocChuoi += tukhoa.charAt(j);
            }

            chuyenDoiChuoi += daoNguocChuoi + " ";
        }
        System.out.println(chuyenDoiChuoi);

    }
}
