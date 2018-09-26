package method;

import java.util.Scanner;

public class KiemTraChuoiDoiXung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi doi xung: ");
        String str = sc.nextLine();

        chuoiDoiXung(str);
    }


    public static void chuoiDoiXung(String s){
        String cutInitialStr = s.substring(0, s.length() / 2);
        String cutNextStr = s.substring(s.length() - s.length() / 2);

        if (cutInitialStr.equals(new StringBuffer(cutNextStr).reverse().toString())) {
            System.out.println(s + "la chuoi doi xung");
        } else {
            System.out.println("Khong Doi xung");
        }
    }

//    public static void main(String[] args) {
//        Scanner ip = new Scanner(System.in);
//        System.out.println("Nhap vo doan chuoi doi xung: ");
//        String s = ip.nextLine();
//
//        if(isPalindrome(s)){
//            System.out.println(s + " la chuoi doi xung");
//        }else {
//            System.out.println("Khong phai chuoi doi xung!");
//        }
//    }
//    public static boolean isPalindrome (String str) {
//        int left = 0;
//        int right = str.length() - 1;
//
//        while (left < right) {
//            if (str.charAt(left) != str.charAt(right))
//                return false;
//            left++;
//            right--;
//        }
//        return true;
//    }
}
